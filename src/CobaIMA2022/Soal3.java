package CobaIMA2022;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num, last, total = 0;

        do {
            int i = 1, fact = 1;
            last = temp % 10;

            while (i <= last) {
                fact *= i;
                i++;
            }

            total += fact;
            temp /= 10;
        } while (temp > 0);

        if (total == num) System.out.println("YA");
        else System.out.println("BUKAN");
    }
}
