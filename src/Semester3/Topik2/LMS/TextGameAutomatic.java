package Semester3.Topik2.LMS;

// throws InterruptedException digunakan untuk loading game sebesar 2 detik
// Karena psvm (public static void main(String[] args)) memiliki modifier static, jadi lebih baik semua fuction dijadiin static juga, biar gampang manggilnya...
public class TextGameAutomatic {
    static GameCharacters gameCharacterA;
    static GameCharacters gameCharacterB;
    static int lifePointLeft;

    public static void main(String[] args) throws InterruptedException {
        startGame();
    }

    // Hit attack
    private static void actionHit(GameCharacters karakterYangMauDipukul) throws InterruptedException {
        // Kalo karakter B kepukul
        if (karakterYangMauDipukul.getName().equalsIgnoreCase(gameCharacterB.getName())) {
            System.out.println(gameCharacterB.getName() + " terpukul! -" + gameCharacterA.attackHitPoint + "HP");

            // Lifepoint A berkurang
            lifePointLeft = gameCharacterB.getLifePoint() - gameCharacterA.attackHitPoint;
            gameCharacterB.lifePoint = lifePointLeft;

            System.out.println("\nLifepoint " + gameCharacterB.getName() + " = " + gameCharacterB.getLifePoint());
            System.out.println("\n=== Sekarang saatnya Player B ===");
        }

        // Kalo karakter A kepukul
        if (karakterYangMauDipukul.getName().equalsIgnoreCase(gameCharacterA.getName())) {
            System.out.println(gameCharacterA.getName() + " terpukul! -" + gameCharacterB.attackHitPoint + "HP");

            // Lifepoint B berkurang
            lifePointLeft = gameCharacterA.getLifePoint() - gameCharacterB.attackHitPoint;
            gameCharacterA.lifePoint = lifePointLeft;

            System.out.println("\nLifepoint " + gameCharacterA.getName() + " = " + gameCharacterA.getLifePoint());
            System.out.println("\n=== Sekarang saatnya Player A ===");
        }
        loadingGame();
    }

    // Kick attack
    private static void actionKick(GameCharacters karakterYangMauDitendang) throws InterruptedException {
        // Kalo karakter B ketendang
        if (karakterYangMauDitendang.getName().equalsIgnoreCase(gameCharacterB.getName())) {
            System.out.println(gameCharacterB.getName() + " kena tendangan! -" + gameCharacterA.attackKickPoint + "HP");

            // Lifepoint A berkurang
            lifePointLeft = gameCharacterB.getLifePoint() - gameCharacterA.attackKickPoint;
            gameCharacterB.lifePoint = lifePointLeft;

            System.out.println("\nLifepoint " + gameCharacterB.getName() + " = " + gameCharacterB.getLifePoint());
            System.out.println("\n=== Sekarang saatnya Player B ===");
        }

        // Kalo karakter A ketendang
        if (karakterYangMauDitendang.getName().equalsIgnoreCase(gameCharacterA.getName())) {
            System.out.println(gameCharacterA.getName() + " kena tendangan! -" + gameCharacterB.attackHitPoint + "HP");

            // Lifepoint B berkurang
            lifePointLeft = gameCharacterA.getLifePoint() - gameCharacterA.attackKickPoint;
            gameCharacterA.lifePoint = lifePointLeft;

            System.out.println("\nLifepoint " + gameCharacterA.getName() + " = " + gameCharacterA.getLifePoint());
            System.out.println("\n=== Sekarang saatnya Player A ===");
        }
        loadingGame();
    }

    // Logika gamenya
    private static void startGame() throws InterruptedException {
        // Inisialisasi karakter A
        gameCharacterA = new GameCharacters("Raiden", 10, 20);

        // Inisialisasi karakter B
        gameCharacterB = new GameCharacters("Sub-Zero", 5, 25);

        // Game mulai di sini
        System.out.println("\n=== Pertarungan dimulai! Karakter A jalan duluan! ===\n");
        loadingGame();

        actionKick(gameCharacterB); // Karakter A nendang karakter B
        actionKick(gameCharacterA); // Karakter B nendang karakter A

        for (int i = 1; i <= 3; i++) actionHit(gameCharacterA); // Karakter B mukul 3x
        for (int i = 1; i <= 4; i++) actionKick(gameCharacterB); // Karakter A mukul 4x

        System.out.println("\n" + gameCharacterA.getName() + " = " + gameCharacterA.getLifePoint()
                + " | " + gameCharacterB.getName() + " = " + gameCharacterB.getLifePoint());

        if (gameCharacterA.getLifePoint() > gameCharacterB.getLifePoint())
            System.out.println("\nPemenangnya adalah " + gameCharacterA.getName());
        else System.out.println("\nPemenangnya adalah " + gameCharacterB.getName());

        System.out.println("=== Permainan selesai ===");
    }

    // Ini loading doang gaez
    private static void loadingGame() throws InterruptedException {
        System.out.println("Loading...");
        Thread.sleep(2000);
    }
}

class GameCharacters {
    String name;
    int attackHitPoint; // Kekuatan tonjokan
    int attackKickPoint; // Kekuatan tendangan
    int lifePoint = 100; // Nyawa, default 100

    public GameCharacters(String name, int attackHitPoint, int attackKickPoint) {
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