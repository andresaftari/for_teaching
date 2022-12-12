package com.romawi;

public class Konversi {
    private int angka, nomor;
    private String romawi;

    public Konversi(int angka) {
        this.angka = angka;
        this.romawi = "";
    }

    public String getRomawi() {
        while (angka > 0) {
            if (angka / 1000 != 0) {
                romawi = romawi + "M";
                angka = angka - 1000;
            } else if (angka / 900 != 0) {
                romawi = romawi + "CX";
                angka = angka - 900;
            } else if (angka / 500 != 0) {
                romawi = romawi + "D";
                angka = angka - 500;
            } else if (angka / 400 != 0) {
                romawi = romawi + "CD";
                angka = angka - 400;
            } else if (angka / 100 != 0) {
                romawi = romawi + "C";
                angka = angka - 100;
            } else if (angka / 90 != 0) {
                romawi = romawi + "XC";
                angka = angka - 90;
            } else if (angka / 50 != 0) {
                romawi = romawi + "L";
                angka = angka - 50;
            } else if (angka / 40 != 0) {
                romawi = romawi + "XL";
                angka = angka - 40;
            } else if (angka / 10 != 0) {
                romawi = romawi + "X";
                angka = angka - 10;
            } else if (angka / 9 != 0) {
                romawi = romawi + "IX";
                angka = angka - 9;
            } else if (angka / 5 != 0) {
                romawi = romawi + "V";
                angka = angka - 5;
            } else if (angka / 4 != 0) {
                romawi = romawi + "IV";
                angka = angka - 4;
            } else {
                romawi = romawi + "I";
                angka = angka - 1;
            }
        }
        return romawi;
    }
}