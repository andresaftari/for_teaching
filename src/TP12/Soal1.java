package TP12;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= 0; j--) {
                if (j != 0) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
            if (i < size - 1) {
                System.out.println();
            }
        }
    }
}
