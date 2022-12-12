package com.romawi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        Konversi konversi = new Konversi(input);
        System.out.println(konversi.getRomawi());
    }
}