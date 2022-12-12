package Bebas;

import java.util.Scanner;

public class MenghitungHari {
    static String[] input = new String[2];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menentukan hari ke-N\n");

        System.out.print("Masukan : ");
        String hari = scanner.next();
        String jarakHari = scanner.next();

        input[0] = hari;
        input[1] = jarakHari;

        hitungHarinya(input[0], input[1]);
    }

    private static void hitungHarinya(String hari, String jarakHari) {
        int hariIni = 0;
        int jarak = Integer.parseInt(jarakHari);
        int hariDituju;

        switch (hari) {
            case "Senin":
                hariIni = 1;
                break;

            case "Selasa":
                hariIni = 2;
                break;

            case "Rabu":
                hariIni = 3;
                break;

            case "Kamis":
                hariIni = 4;
                break;

            case "Jumat":
                hariIni = 5;
                break;

            case "Sabtu":
                hariIni = 6;
                break;

            case "Minggu":
                hariIni = 7;
                break;
        }

        if (jarak > 7) hariDituju = jarak % 7;
        else hariDituju = jarak;

        int nextDay = hariIni + hariDituju;

        switch (nextDay) {
            case 1:
                System.out.print("Output : Senin");
                break;

            case 2:
                System.out.print("Output : Selasa");
                break;

            case 3:
                System.out.print("Output : Rabu");
                break;

            case 4:
                System.out.print("Output : Kamis");
                break;

            case 5:
                System.out.print("Output : Jumat");
                break;

            case 6:
                System.out.print("Output : Sabtu");
                break;

            case 0:
                System.out.print("Output : Minggu");
                break;
        }
    }
}
