package TP11;

import java.util.Random;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] arrPeserta = new String[n];

        for (int i = 0; i < n; i++) {
            arrPeserta[i] = input.next();
        }

        Random random = new Random();

        System.out.println(arrPeserta[random.nextInt(n)]);
    }
}
