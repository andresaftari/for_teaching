package Semester3.Topik2.Poins.Fibonacci;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int jumlahDeret = scanner.nextInt();

        for (int i = 1; i <= jumlahDeret; i++) {
            System.out.print(a + " ");

            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}