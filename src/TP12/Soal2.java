package TP12;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[][] matrixA = new int[size][size];
        int[][] matrixB = new int[size][size];
        int[][] total = new int[size][size];

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
                total[i][j] = matrixA[i][j] + matrixB[i][j];

                if (j + 1 < size) {
                    System.out.print(total[i][j] + " ");
                } else {
                    System.out.print(total[i][j]);
                }
            }
            System.out.println();
        }
    }
}
