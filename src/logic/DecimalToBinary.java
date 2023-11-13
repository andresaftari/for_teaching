package logic;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String result = "";

        while (n > 0) {
            int a = n % 2;
            result += a;
            n = n / 2;
        }

        int i = result.length() - 1;
        while (i >= 0) {
            System.out.print(result.charAt(i));
            i--;
        }
    }
}
