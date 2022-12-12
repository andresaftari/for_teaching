package Semester3.Topik5.Segitiga;

import java.util.Scanner;

public class Main {
    static SegitigaSisi segitigaSisi;
    static SegitigaTinggi segitigaTinggi;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("\n1. Hitung luas dan keliling dengan alas dan sisi\n" +
                    "2. Hitung luas dan keliling dengan alas dan tinggi\n" +
                    "3. Ketik 'keluar' untuk exit program");

            input = scanner.next();

            switch (input) {
                case "1":
                    System.out.print("Input alas : ");
                    int inputAlas1 = scanner.nextInt();
                    System.out.print("Input sisi : ");
                    int inputSisi = scanner.nextInt();

                    segitigaSisi = new SegitigaSisi(inputAlas1, inputSisi);
                    segitigaSisi.displayLuas();
                    segitigaSisi.displayKeliling();
                    break;

                case "2":
                    System.out.print("Input alas : ");
                    int inputAlas2 = scanner.nextInt();
                    System.out.print("Input sisi : ");
                    int inputTinggi2 = scanner.nextInt();

                    segitigaTinggi = new SegitigaTinggi(inputAlas2, inputTinggi2);
                    segitigaTinggi.displayLuas();
                    segitigaTinggi.displayKeliling();
                    break;
            }
        } while (!input.equalsIgnoreCase("Keluar"));
    }
}