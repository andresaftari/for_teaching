package Semester3.Topik2.Poins.HitungHari;

import java.util.Scanner;

public class CariHariSimple {
    public static void main(String[] args) {
        int hariIni = 0;
        Scanner scanner = new Scanner(System.in);

        String hari = scanner.nextLine();
        int hariTujuan = scanner.nextInt();

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

        int hariDituju = (hariIni + 7) % 7;
        hariDituju = hariDituju + hariTujuan;

        switch (hariDituju) {
            case 1:
                System.out.println("hari Senin");
                break;

            case 2:
                System.out.println("hari Selasa");
                break;

            case 3:
                System.out.println("hari Rabu");
                break;

            case 4:
                System.out.println("hari Kamis");
                break;

            case 5:
                System.out.println("hari Jumat");
                break;

            case 6:
                System.out.println("hari Sabtu");
                break;

            case 7:
                System.out.println("hari Minggu");
                break;
        }
    }
}