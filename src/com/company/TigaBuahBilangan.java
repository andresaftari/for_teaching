package com.company;

import java.util.Scanner;

public class TigaBuahBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dira = scanner.nextInt();
        int radi = scanner.nextInt();
        int idar = scanner.nextInt();

        if (dira > radi && dira > idar) {
            System.out.println("Dira");
        } else if (radi > dira && radi > idar) {
            System.out.println("Radi");
        } else {
            System.out.println("Idar");
        }
    }
}
