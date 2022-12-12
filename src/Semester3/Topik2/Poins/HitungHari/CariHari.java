package Semester3.Topik2.Poins.HitungHari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// For 20 points
public class CariHari {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Pilihan Hari [1-7] : ");
        int inputHari = Integer.parseInt(br.readLine());

        tampilHariIni(inputHari);

        System.out.print("Jumlah hari : ");
        int jumlahHari = Integer.parseInt(br.readLine());

        hariKeN(jumlahHari, inputHari);
    }

    private static void tampilHariIni(int hari) {
        switch (hari) {
            case 1:
                System.out.println("Hari ini adalah hari Senin");
                break;

            case 2:
                System.out.println("Hari ini adalah hari Selasa");
                break;

            case 3:
                System.out.println("Hari ini adalah hari Rabu");
                break;

            case 4:
                System.out.println("Hari ini adalah hari Kamis");
                break;

            case 5:
                System.out.println("Hari ini adalah hari Jumat");
                break;

            case 6:
                System.out.println("Hari ini adalah hari Sabtu");
                break;

            case 7:
                System.out.println("Hari ini adalah hari Minggu");
                break;
        }
    }

    private static void hariKeN(int jumlah, int hari) {
        int jumlahDituju, hariBaru;

        jumlahDituju = (jumlah + 7) % 7;
        hariBaru = hari + jumlahDituju;

        switch (hariBaru) {
            case 1:
                System.out.println(jumlah + " hari lagi adalah hari Senin");
                break;

            case 2:
                System.out.println(jumlah + " hari lagi adalah hari Selasa");
                break;

            case 3:
                System.out.println(jumlah + " hari lagi adalah hari Rabu");
                break;

            case 4:
                System.out.println(jumlah + " hari lagi adalah hari Kamis");
                break;

            case 5:
                System.out.println(jumlah + " hari lagi adalah hari Jumat");
                break;

            case 6:
                System.out.println(jumlah + " hari lagi adalah hari Sabtu");
                break;

            case 0:
                System.out.println(jumlah + " hari lagi adalah hari Minggu");
                break;
        }
    }
}