package Semester3.Topik2.LMS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextGameManual {
    static GameCharacter gameCharacterA;
    static GameCharacter gameCharacterB;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("=== WELCOME TO THE GAME ===");
        loadingGame();

        do {
            System.out.println("\n1. PLAY GAME NOW!\n2. Exit Game");
            System.out.print("Your option : ");
            int option = Integer.parseInt(br.readLine());

            System.out.println();

            switch (option) {
                case 1:
                    startGame();
                    break;

                case 2:
                    System.out.println("\nAre you sure you want to exit?\nType Y to confirm");
                    String exitConfirmation = br.readLine();

                    if (exitConfirmation.equalsIgnoreCase("Y")) {
                        System.out.println("Exitting game...");
                        loadingGame();
                        System.exit(0);
                    }

                    System.out.println("Returning to main menu...");
                    loadingGame();

                    break;
            }
        } while (true);
    }

    private static void actionHit(GameCharacter gameCharacter) throws InterruptedException { // Method to call Hit attack
        loadingGame();
        int hpLeft;

        if (gameCharacter.getName().equals(gameCharacterB.getName())) {
            System.out.println(gameCharacter.getName() + " is hitted! -" + gameCharacterA.attackHitPoint + "HP");

            hpLeft = gameCharacter.lifePoint - gameCharacterA.attackHitPoint;
            gameCharacterB.lifePoint = hpLeft;

            System.out.println(gameCharacterB.getName() + " HP is " + gameCharacterB.getLifePoint() + " left!");
            System.out.println("===It's Player B turn!===");
        }

        if (gameCharacter.getName().equals(gameCharacterA.getName())) {
            System.out.println(gameCharacter.getName() + " is hitted! -" + gameCharacterB.attackHitPoint + "HP");

            hpLeft = gameCharacter.lifePoint - gameCharacterB.attackHitPoint;
            gameCharacterA.lifePoint = hpLeft;

            System.out.println(gameCharacterA.getName() + " HP is " + gameCharacterA.getLifePoint() + " left!");
            System.out.println("===It's Player A turn!===");
        }
    }

    private static void actionKick(GameCharacter gameCharacter) throws InterruptedException { // Method to call Kick attack
        loadingGame();
        int hpLeft;

        if (gameCharacter.getName().equals(gameCharacterB.getName())) {
            System.out.println(gameCharacter.getName() + " is hitted! -" + gameCharacterA.attackKickPoint + "HP");

            hpLeft = gameCharacter.lifePoint - gameCharacterA.attackKickPoint;
            gameCharacterB.lifePoint = hpLeft;

            System.out.println(gameCharacterB.getName() + " HP is " + gameCharacterB.getLifePoint() + " left!");
            System.out.println("===It's Player B turn!===");
        }

        if (gameCharacter.getName().equals(gameCharacterA.getName())) {
            System.out.println(gameCharacter.getName() + " is hitted! -" + gameCharacterB.attackKickPoint + "HP");

            hpLeft = gameCharacter.lifePoint - gameCharacterB.attackKickPoint;
            gameCharacterA.lifePoint = hpLeft;

            System.out.println(gameCharacterA.getName() + " HP is " + gameCharacterA.getLifePoint() + " left!");
            System.out.println("===It's Player A turn!===");
        }
    }

    private static void startGame() throws InterruptedException, IOException {
        // Character A
        System.out.println("===Input identitas player A===");
        loadingGame();

        try {
            System.out.print("Input nama karakter : ");
            String charNameA = br.readLine();

            System.out.print("Input hit power karakter : ");
            int hitPowerA = Integer.parseInt(br.readLine());

            System.out.print("Input kick power karakter : ");
            int kickPowerA = Integer.parseInt(br.readLine());

            gameCharacterA = new GameCharacter(charNameA, hitPowerA, kickPowerA);
            System.out.println("\n===Karakter " + gameCharacterA.getName() + " berhasil dibuat!===\n\n");
        } catch (Exception e) {
            System.out.println("Gagal membuat karakter! " + e.getMessage());
        }

        // Character B
        System.out.println("===Input identitas player B===");
        loadingGame();

        try {
            System.out.print("Input nama karakter : ");
            String charNameB = br.readLine();

            System.out.print("Input hit power karakter : ");
            int hitPowerB = Integer.parseInt(br.readLine());

            System.out.print("Input kick power karakter : ");
            int kickPowerB = Integer.parseInt(br.readLine());

            gameCharacterB = new GameCharacter(charNameB, hitPowerB, kickPowerB);
            System.out.println("\n===Karakter " + gameCharacterB.getName() + " berhasil dibuat!===\n\n");
        } catch (Exception e) {
            System.out.println("Gagal membuat karakter! " + e.getMessage());
        }

        loadingGame();
        int round = 1;
        // Game Starting!
        System.out.println("It's now round " + round + "!\n");
        System.out.println("===Player A starts first===");
        System.out.println(gameCharacterA.getName() + "(" + gameCharacterA.getLifePoint() + ")" + " === " + gameCharacterB.getName() + "(" + gameCharacterB.getLifePoint() + ")");

        while (gameCharacterB.getLifePoint() != 0) {
            System.out.println("\nChoose your attack!\n1. Hit your enemy!\n2. Kick your enemy!");
            int chooseAttack = Integer.parseInt(br.readLine());

            switch (chooseAttack) {
                case 1:
                    if (round % 2 == 1) actionHit(gameCharacterB);
                    else actionHit(gameCharacterA);
                    break;

                case 2:
                    if (round % 2 == 1) actionKick(gameCharacterB);
                    else actionKick(gameCharacterA);
                    break;
            }
            round++;
        }

        loadingGame();
        if (gameCharacterA.getLifePoint() == 0)
            System.out.println("\n\nThe winner is " + gameCharacterB.getName() + " with HP = " + gameCharacterB.getLifePoint() + "!");
        if (gameCharacterB.getLifePoint() == 0)
            System.out.println("\n\nThe winner is " + gameCharacterA.getName() + " with HP = " + gameCharacterB.getLifePoint() + "!");
    }

    private static void loadingGame() throws InterruptedException {
        System.out.println("Loading, please wait...");
        Thread.sleep(2000);
    }
}

class GameCharacter {
    String name; // Identitas
    int attackHitPoint; // Kekuatan tonjokan
    int attackKickPoint; // Kekuatan tendangan
    int lifePoint = 100; // Nyawa, default 100

    public GameCharacter(String name, int attackHitPoint, int attackKickPoint) {
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public String getName() {
        return name;
    }

    public int getLifePoint() {
        return lifePoint;
    }
}