package Bebas;

import java.util.Scanner;

public class Deret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            if (i == input) System.out.print(i + "");
            else System.out.print(i + "+");
        }
    }
}
