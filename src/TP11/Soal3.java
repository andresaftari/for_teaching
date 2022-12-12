package TP11;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] deret = new int[num];

        for (int i = 0; i < num; i++) {
            deret[i] = input.nextInt();
        }

        int max = deret[0];
        for (int i = 1; i < num; i++) {
            if (deret[i] > max) {
                max = deret[i];
            }
        }
        System.out.println("Max: " + max + "\n");

        int min = deret[num - 1];
        for (int i = num - 1; i >= 1; i--) {
            if (deret[i] < min) {
                min = deret[i];
            }
        }
        System.out.println("Min: " + min + "\n");

        double total = 0.00;
        for (int i = 0; i < num; i++) {
            total += deret[i];
        }
        System.out.format("Avg: %.2f", total / num);
    }
}
