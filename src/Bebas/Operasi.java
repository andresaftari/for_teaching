package Bebas;

import java.util.Scanner;

public class Operasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputA = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int inputB = scanner.nextInt();

        switch (operator) {
            case '+':
                int jumlah = inputA + inputB;
                System.out.println(jumlah);
                break;

            case '-':
                int kurang = inputA - inputB;
                System.out.println(kurang);
                break;

            case '*':
                int kali = inputA * inputB;
                System.out.println(kali);
                break;

            case '/':
                float pembagian = inputA / (float) inputB;
                System.out.println(pembagian);
                break;
        }
    }
}
