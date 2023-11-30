package CobaIMA2022.latihanNestedFor.Jurnal08;

import java.util.Scanner;

public class PiramidAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num);

                num++;
                if (num > 9) num = 0;
            }
            System.out.println();
        }
    }
}
