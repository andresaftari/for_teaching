package TP11;

import java.util.Scanner;

public class Contoh {
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
            for (int j = 0; j < size - 1; j++) {
                System.out.print("Current: " + matrix[i][j]);
            }

            for (int j = size - 1; j > 0; j--) {
                System.out.print("Current: " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
