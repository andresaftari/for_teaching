package Bebas;

/*
 * Step by step untuk bikin textGame :
 * 1. Buat Object Class dengan nama GameCharacter / KarakterGame, lalu inisialisasikan variable nya sesuai soal
 * 2. Pada class GameCharacter / KarakterGame, silakan buat constructor (ALT+INSERT pada keyboard) dengan name, attackHit dan attackKick sebagai parameter sesuai soal
 * 3. Sesuai soal, buat getter untuk name (String getName()) dan lifepoint (int getLifepoint())
 * 4. Buat dua fungsi static void baru, di bawah public static void main(String[] args)
 * 5. Buat static variable global bernama karakterGameA dan karakterGameB, lalu deklarasikan di public static void main(String[] args)
 * 6. Isi fungsi actionHit() dan actionKick() dengan logika berikut
 *
 */

public class StepByStepGame {
    // Step 5
    static KarakterGame karakterGameA;
    static KarakterGame karakterGameB;
    static int lifePointLeft;

    // Step 4
    private static void actionHit(KarakterGame karakterGame) {
        // Step 6
        if (karakterGame.getName().equalsIgnoreCase(karakterGameB.getName())) { // Kalo karakter B kepukul
            System.out.println(karakterGameB.getName() + " terpukul! -" + karakterGameA.attackHitPoint + "HP");

            // Lifepoint A berkurang
            lifePointLeft = karakterGameB.getLifepoint() - karakterGameA.attackHitPoint;
            karakterGameB.lifepoint = lifePointLeft;

            System.out.println("\nLifepoint " + karakterGameB.getName() + " = " + karakterGameB.getLifepoint());
            System.out.println("\n=== Sekarang saatnya Player B ===");
        }

        if (karakterGame.getName().equalsIgnoreCase(karakterGameA.getName())) { // Kalo karakter A kepukul
            System.out.println(karakterGameA.getName() + " terpukul! -" + karakterGameB.attackHitPoint + "HP");

            // Lifepoint B berkurang
            lifePointLeft = karakterGameA.getLifepoint() - karakterGameB.attackHitPoint;
            karakterGameA.lifepoint = lifePointLeft;

            System.out.println("\nLifepoint " + karakterGameA.getName() + " = " + karakterGameA.getLifepoint());
            System.out.println("\n=== Sekarang saatnya Player A ===");
        }
    }

    private static void actionKick(KarakterGame karakterGame) {
        // Step 6
        if (karakterGame.getName().equalsIgnoreCase(karakterGameB.getName())) { // Kalo karakter B kepukul
            System.out.println(karakterGameB.getName() + " terpukul! -" + karakterGameA.attackKickPoint + "HP");

            // Lifepoint A berkurang
            lifePointLeft = karakterGameB.getLifepoint() - karakterGameA.attackKickPoint;
            karakterGameB.lifepoint = lifePointLeft;

            System.out.println("\nLifepoint " + karakterGameB.getName() + " = " + karakterGameB.getLifepoint());
            System.out.println("\n=== Sekarang saatnya Player B ===");
        }

        if (karakterGame.getName().equalsIgnoreCase(karakterGameA.getName())) { // Kalo karakter A kepukul
            System.out.println(karakterGameA.getName() + " terpukul! -" + karakterGameB.attackKickPoint + "HP");

            // Lifepoint B berkurang
            lifePointLeft = karakterGameA.getLifepoint() - karakterGameB.attackKickPoint;
            karakterGameA.lifepoint = lifePointLeft;

            System.out.println("\nLifepoint " + karakterGameA.getName() + " = " + karakterGameA.getLifepoint());
            System.out.println("\n=== Sekarang saatnya Player A ===");
        }
    }

    public static void main(String[] args) {
        // Step 5
        karakterGameA = new KarakterGame("Raiden", 10, 20);
        karakterGameB = new KarakterGame("Sub-Zero", 5, 25);

        // Step 7 (final)
        System.out.println("\n=== Pertarungan dimulai! Karakter A jalan duluan! ===\n");

        actionKick(karakterGameB); // Karakter A nendang karakter B
        actionKick(karakterGameA); // Karakter B nendang karakter A

        for (int i = 1; i <= 3; i++) actionHit(karakterGameA); // Karakter B mukul 3x
        for (int i = 1; i <= 4; i++) actionKick(karakterGameB); // Karakter A mukul 4x

        System.out.println("\n" + karakterGameA.getName() + " = " + karakterGameA.getLifepoint()
                + " | " + karakterGameB.getName() + " = " + karakterGameB.getLifepoint());

        if (karakterGameA.getLifepoint() > karakterGameB.getLifepoint())
            System.out.println("\nPemenangnya adalah " + karakterGameA.getName());
        else System.out.println("\nPemenangnya adalah " + karakterGameB.getName());

        System.out.println("=== Permainan selesai ===");
    }
}

class KarakterGame {
    // Step 1
    String name;
    int lifepoint = 100;
    int attackHitPoint, attackKickPoint;

    // Step 2
    public KarakterGame(String name, int attackHitPoint, int attackKickPoint) {
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    // Step 3
    public String getName() {
        return name;
    }

    public int getLifepoint() {
        return lifepoint;
    }
}