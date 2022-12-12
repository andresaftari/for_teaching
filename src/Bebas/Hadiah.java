package Bebas;

import java.util.Scanner;

public class Hadiah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();

        int firstSquare = (int) Math.pow(b, c);
        int secondSquare = (int) Math.pow(a, firstSquare);

        System.out.println(secondSquare % n + 1);
    }
}