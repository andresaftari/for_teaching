package CobaIMA2022.latihanNestedFor;

import java.util.Scanner;

public class ZigZag {
    public static void main(final String[] args) {
        Scanner fio = new Scanner(System.in);
        int pola = fio.nextInt();
        for (int i = 1; i <= pola; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(i + " \n");
        }
        for (int i = pola - 1; i > 0; i--) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print(i + " \n");
        }
    }
}

