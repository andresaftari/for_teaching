package Bebas.LatihanTLX;

import java.util.Scanner;

/*
 * Note:
 * Masukkan 1 adalah jumlah kasus, masukan 2 jumlah snack, masukan 3 pembagiannya
 * -> Kalo ngebagi, harus sampe habis (gaboleh ada sisa)
 * -> Kalo ngebagi, harus sama rata
 */
public class Snack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCase = scanner.nextInt();

        int[] arrayOfCase = new int[numOfCase];

        for (int i = 1; i <= arrayOfCase.length; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num1 % num2 == 0) System.out.println("Kasus #" + i + ": ya");
            else System.out.println("Kasus #" + i + ": tidak");
        }
    }
}