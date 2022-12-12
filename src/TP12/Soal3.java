package TP12;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int perkalian = 0;

        int[][] matrixA = new int[size][size];
        int[][] matrixB = new int[size][size];
        int[][] hasilKali = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixB[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    perkalian += matrixA[i][k] * matrixB[k][j];
                }
                hasilKali[i][j] = perkalian;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j + 1 < size) {
                    System.out.print(hasilKali[i][j] + " ");
                } else {
                    System.out.print(hasilKali[i][j]);
                }
            }
            System.out.println();
        }
    }
}
