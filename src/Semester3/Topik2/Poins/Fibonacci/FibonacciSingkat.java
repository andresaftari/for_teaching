package Semester3.Topik2.Poins.Fibonacci;

import java.util.Scanner;

public class FibonacciSingkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahDeret = scanner.nextInt();

        // Driver method
        System.out.println(fibonacci(jumlahDeret));
    }

    private static int fibonacci(int n) {
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}