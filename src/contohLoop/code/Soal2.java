package contohLoop.code;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pembilang = sc.nextInt();
        int penyebut = sc.nextInt();

        int max = pecahan(pembilang, penyebut);

        if (max > 1) {
            int pemb = pembilang / max;
            int peny = penyebut / max;

            System.out.println(pemb + " " + peny);
        } else System.out.println("Tidak");
    }

    private static int pecahan(int pemb, int peny) {
        int s = 2, t = 2;
        int a = pemb, b = peny;

        while (a != b) {
            if (a > b) {
                while ((pemb % s) != 0) s++;
                a = pemb / s;
                s++;
            } else {
                while ((peny % t) != 0) t++;
                b = peny / t;
                t++;
            }
        }

        return a;
    }
}
