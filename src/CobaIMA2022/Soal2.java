package CobaIMA2022;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();
        int day = sc.nextInt();

        while (day >= 10) {
            int count = 1;
            day /= 10;

            do {
                num *= 0.5;
                count++;
            } while (count <= day);

            System.out.printf("%.3f", num);
        }
    }
}
