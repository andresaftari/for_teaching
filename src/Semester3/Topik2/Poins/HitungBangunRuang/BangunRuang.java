package Semester3.Topik2.Poins.HitungBangunRuang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// For 40 points
public class BangunRuang {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Menu pilihan\n1. Persegi\n2. Lingkaran\n3. Balok");
            System.out.println("\nMasukkan pilihan Anda [1-3]");
            System.out.print("Inputan : ");

            int input = Integer.parseInt(br.readLine());
            System.out.println();

            switch (input) {
                case 1:
                    System.out.println("Masukkan masing-masing komponen persegi");
                    System.out.print("Panjang : ");
                    int panjangP = Integer.parseInt(br.readLine());

                    System.out.print("Lebar : ");
                    int lebarP = Integer.parseInt(br.readLine());

                    persegi(panjangP, lebarP);
                    break;

                case 2:
                    System.out.println("Masukkan komponen lingkaran");
                    System.out.print("Jari-jari : ");

                    int radius = Integer.parseInt(br.readLine());

                    lingkaran(radius);
                    break;

                case 3:
                    System.out.println("Masukkan masing-masing komponen balok");
                    System.out.print("Panjang : ");
                    int panjangB = Integer.parseInt(br.readLine());

                    System.out.print("Lebar : ");
                    int lebarB = Integer.parseInt(br.readLine());

                    System.out.print("Tinggi : ");
                    int tinggiB = Integer.parseInt(br.readLine());

                    balok(panjangB, lebarB, tinggiB);
                    break;

                default:
                    System.out.println("Inputan pilihan yang Anda masukkan tidak dikenal");
                    System.exit(0);
            }
        } while (true);
    }

    private static void persegi(int panjang, int lebar) {
        int keliling = 2 * (panjang + lebar);
        int luas = panjang * lebar;

        System.out.println("Keliling persegi : " + keliling);
        System.out.println("Luas persegi : " + luas + " satuan persegi\n");
    }

    private static void lingkaran(int radius) {
        double keliling = 2 * Math.PI * radius;
        double luas = Math.PI * radius * radius;

        System.out.println("Keliling lingkaran : " + keliling);
        System.out.println("Luas lingkaran : " + luas + " satuan persegi\n");
    }

    private static void balok(int panjang, int lebar, int tinggi) {
        int luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        int volume = panjang * lebar * tinggi;

        System.out.println("Luas permukaan balok : " + luasPermukaan + " satuan persegi");
        System.out.println("Volume : " + volume + " satuan kubik\n");
    }
}
