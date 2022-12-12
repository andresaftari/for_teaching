package com.company.latian;

import java.util.Scanner;

public class Odds {
    public static void main(String[] args) {
        System.out.println("Hitung bilangan ganjil dari N sama X");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input batas awal : ");
        int n = scanner.nextInt();

        System.out.print("Input batas akhir : ");
        int x = scanner.nextInt();

        for (int i = n; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " ");

            }
        }
    }
}
