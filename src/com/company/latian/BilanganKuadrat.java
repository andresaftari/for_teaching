package com.company.latian;

import java.util.Scanner;

public class BilanganKuadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka : ");

        int number = scanner.nextInt();
        System.out.print("Output : " + (number * number));
    }
}