package TP11;

import java.util.Scanner;

public class Jurnal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[][] papan = new int[size][size]; // data 1 = index 0

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                papan[i][j] = scanner.nextInt();
            }
        }

        int pemenang = 0;
        int papanKosong = 0;
        boolean isMenang = false;
        boolean isKosong = false;

        for (int i = 0; i < size; i++) {
            // Check Mendatar
            for (int j = 0; j < size; j++) {
                if (papan[i][i] != papan[i][j]) {
                    break;
                } else {
                    if (j == papan.length - 1) {
                        isMenang = true;
                        pemenang = papan[i][i];
                    }
                }
            }
            if (isMenang) {
                break;
            }

            // Check Menurun
            for (int j = 0; j < size; j++) {
                if (papan[i][i] != papan[j][i]) {
                    break;
                } else {
                    if (j == papan.length - 1) {
                        isMenang = true;
                        pemenang = papan[i][i];
                    }
                }
            }
            if (isMenang) {
                break;
            }

            // Check diagonal kiri atas ke kanan bawah
            for (int j = 0; j < size; j++) {
                if (papan[i][i] != papan[j][papan.length - (1 + j)]) {
                    break;
                } else {
                    if (j == papan.length - 1) {
                        isMenang = true;
                        pemenang = papan[i][i];
                    }
                }
            }
            if (isMenang) {
                break;
            }

            // Check diagonal kanan atas ke kiri bawah
            for (int j = 0; j < size; j++) {
                if (papan[i][i] != papan[j][j]) {
                    break;
                } else {
                    if (j == papan.length - 1) {
                        isMenang = true;
                        pemenang = papan[i][i];
                    }
                }
            }
            if (isMenang) {
                break;
            }

            // Check kosong kagak?
            for (int j = 0; j < size; j++) {
                if (papan[i][j] == 0) {
                    isKosong = true;
                    papanKosong = papan[i][i];
                    break;
                }
            }
            if (isKosong) {
                break;
            }
        }

        switch (pemenang) {
            case 0:
                if (papanKosong > 0) System.out.println("?");
                else System.out.println("-");
                break;

            case 1:
                System.out.println("O");
                break;

            case 2:
                System.out.println("X");
                break;
        }
        scanner.close();
    }
}
