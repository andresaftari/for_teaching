package Bebas.TugasSMP;

import java.util.Scanner;

public class Skala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jarakPeta = sc.nextInt();
        int skala = sc.nextInt();

        double jarakAsli =  jarakPeta * (double) skala;
        System.out.println("Jarak asli jembatan adalah : " + jarakAsli / 100000 + " km");
    }
}
