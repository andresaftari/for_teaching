package contohLoop.code;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) data[i] = sc.nextInt();
        for (int i = data.length - 1; i >= 0; i--) {
            if (i == 0) System.out.print(data[i]);
            else System.out.print(data[i] + ",");
        }
    }
}