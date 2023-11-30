package CobaIMA2022.latihanNestedFor.TP08;

import java.util.Scanner;

public class ZigZag {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int pattern = sc.nextInt();

        for (int i = 1; i <= pattern; i++) {
            for (int j = 1; j < i; j++) System.out.print(" ");
            System.out.print(i + " \n");
        }

        for (int i = pattern - 1; i > 0; i--) {
            for (int j = 2; j <= i; j++) System.out.print(" ");
            System.out.print(i + " \n");
        }
    }
}

