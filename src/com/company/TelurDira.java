package com.company;

import java.util.Scanner;

public class TelurDira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int banyakTelur = scanner.nextInt(); // Input banyak telur

        int harga = 800; // Per butir = Rp800
        double total = 0; // Variable untuk total harganya
        double diskon; // Variable untuk diskon

        System.out.println("Telur " + banyakTelur + " x " + harga + " = " + banyakTelur * harga);

        if (banyakTelur >= 12 && banyakTelur <= 23) { // Kondisi saat telur sebanyak 12 sampai 23 butir
            diskon = 0.10; // Diberikan diskon sebesar 10%
            total = (harga * banyakTelur) * diskon;

            System.out.println("Diskon 10% = " + (int) total); // Total potongan harga

        } else if (banyakTelur >= 24) { // Kondisi saat telur sebanyak 24 butir atau lebih
            diskon = 0.15; // Diberikan diskon sebesar 15%
            total = (harga * banyakTelur) * diskon;

            System.out.println("Diskon 15% = " + (int) total); // Total potongan harga
        } else {
            System.out.println("Diskon 0% = 0"); // Selain kondisi di atas, maka tidak ada diskon yang diberikan
        }

        System.out.println("Total dibayar = " + (int) (banyakTelur * harga - total)); // Cetak total harga yang harus dibayar
    }
}