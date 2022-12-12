package com.company.latian;

public class Game {
    static Karakter karakterA;
    static Karakter karakterB;

    public static void main(String[] args) {
        // Deklarasi karakter A dan B
        karakterA = new Karakter("Raiden", 10, 20);
        karakterB = new Karakter("Sub-Zero", 5, 25);

        // Game mulai di sini
        System.out.println("\n=== Pertarungan dimulai! Karakter A jalan duluan! ===\n");
        karakterA.attackKick(karakterB); // Ini artinya si A nendang si B
        karakterB.attackKick(karakterA); // Si B nendang balik nihh

        for (int i = 1; i <= 3; i++) karakterB.attackHit(karakterA); // Ditonjokin 3x ga ada ampun
        for (int i = 1; i <= 4; i++) karakterA.attackKick(karakterB); // Dikick boxing 4x sampe modar

        System.out.println("Sisa lifepoint A : " + karakterA.getLifePoint() + " || Sisa lifepoint B : " + karakterB.getLifePoint());

        if (karakterB.getLifePoint() == 0) System.out.println("Pemenang adalah " + karakterA.getName());
        else System.out.println("Pemenang adalah " + karakterB.getName());
    }
}

class Karakter {
    String name;
    int lifePoint = 100;
    int attackHitPoint, attackKickPoint, sisaNyawa;

    public Karakter(String name, int attackHitPoint, int attackKickPoint) {
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

    public void attackHit(Karakter karakterYangDipukul) {
        // Kalo karakter B dipukul
        if (karakterYangDipukul.getName().equalsIgnoreCase(Game.karakterB.getName())) {
            System.out.println(Game.karakterB.getName() + " terpukul! -" + Game.karakterA.attackHitPoint + "HP");

            // Lifepoint B berkurang
            sisaNyawa = Game.karakterB.getLifePoint() - Game.karakterA.attackHitPoint;
            Game.karakterB.lifePoint = sisaNyawa;

            System.out.println("\nLifepoint " + Game.karakterB.getName() + " = " + Game.karakterB.getLifePoint());
            System.out.println("\n=== Sekarang saatnya Player B ===");
        }

        // Kalo karakter A dipukul
        if (karakterYangDipukul.getName().equalsIgnoreCase(Game.karakterA.getName())) {
            System.out.println(Game.karakterA.getName() + " terpukul! -" + Game.karakterB.attackHitPoint + "HP");

            // Lifepoint A berkurang
            sisaNyawa = Game.karakterA.getLifePoint() - Game.karakterB.attackHitPoint;
            Game.karakterA.lifePoint = sisaNyawa;

            System.out.println("\nLifepoint " + Game.karakterA.getName() + " = " + Game.karakterA.getLifePoint());
            System.out.println("\n=== Sekarang saatnya Player A ===");
        }
    }

    public void attackKick(Karakter karakterYangDitendang) {
        // Kalo karakter B ditendang
        if (karakterYangDitendang.getName().equalsIgnoreCase(Game.karakterB.getName())) {
            System.out.println(Game.karakterB.getName() + " ditendang! -" + Game.karakterA.attackKickPoint + "HP");

            // Lifepoint B berkurang
            sisaNyawa = Game.karakterB.getLifePoint() - Game.karakterA.attackKickPoint;
            Game.karakterB.lifePoint = sisaNyawa;

            System.out.println("\nLifepoint " + Game.karakterB.getName() + " = " + Game.karakterB.getLifePoint());
            System.out.println("\n=== Sekarang saatnya Player B ===");
        }

        // Kalo karakter A ditendang
        if (karakterYangDitendang.getName().equalsIgnoreCase(Game.karakterA.getName())) {
            System.out.println(Game.karakterA.getName() + " ditendang! -" + Game.karakterB.attackKickPoint + "HP");

            // Lifepoint A berkurang
            sisaNyawa = Game.karakterA.getLifePoint() - Game.karakterB.attackKickPoint;
            Game.karakterA.lifePoint = sisaNyawa;

            System.out.println("\nLifepoint " + Game.karakterA.getName() + " = " + Game.karakterA.getLifePoint());
            System.out.println("\n=== Sekarang saatnya Player A ===");
        }
    }
}