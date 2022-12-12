package Semester3.Topik2.Poins.WarungSederhana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// For 80 points
public class Pembeli {
    static Nasi nasi = new Nasi();
    static Gorengan gorengan = new Gorengan();
    static Daging daging = new Daging();

    static int totalNasi = 0;
    static int totalGorengan = 0;
    static int totalDaging = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        do {
            System.out.println("\n\nMenu Makanan");
            System.out.println("1. Nasi\n2. Gorengan\n3. Daging\n4. Hitung Transaksi");

            System.out.print("Pilihan Anda  : ");
            int option = Integer.parseInt(br.readLine());

            switch (option) {
                case 1:
                    tambahNasi();
                    break;

                case 2:
                    tambahGorengan();
                    break;

                case 3:
                    tambahDaging();
                    break;

                case 4:
                    hitungHarga();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Tidak ada pilihan ini");
            }
        } while (true);
    }

    private static void tambahNasi() {
        System.out.print("Jumlah porsi nasi : ");
        try {
            int addRice = Integer.parseInt(br.readLine());
            totalNasi += addRice;

            nasi.setTotal(totalNasi);
            System.out.print("Jumlah nasi : " + nasi.getTotal());

        } catch (Exception e) {
            System.out.println("Failed! " + e.getMessage());
        }
    }

    private static void tambahGorengan() {
        System.out.print("Jumlah porsi gorengan : ");

        try {
            int addFries = Integer.parseInt(br.readLine());
            totalGorengan += addFries;

            gorengan.setTotal(totalGorengan);
            System.out.print("Jumlah gorengan : " + gorengan.getTotal());

        } catch (Exception e) {
            System.out.println("Failed! " + e.getMessage());
        }
    }

    private static void tambahDaging() {
        System.out.print("Jumlah porsi daging : ");

        try {
            int addFries = Integer.parseInt(br.readLine());
            totalDaging += addFries;

            daging.setTotal(totalDaging);
            System.out.print("Jumlah daging : " + daging.getTotal());
        } catch (Exception e) {
            System.out.println("Failed! " + e.getMessage());
        }
    }

    private static void hitungHarga() {
        int totalNasi = nasi.getTotal();
        int totalGorengan = gorengan.getTotal();
        int totalDaging = daging.getTotal();

        System.out.println("\n\nHitung total pembayaran");

        try {
            if (totalNasi != 0) System.out.println(totalNasi + " nasi : " + nasi.getHarga());
            if (totalGorengan != 0) System.out.println(totalGorengan + " gorengan : " + gorengan.getHarga());
            if (totalDaging != 0) System.out.println(totalDaging + " daging : " + daging.getHarga());

            System.out.println("-----------------------------------------------------------------------");
            int totalSemua = nasi.getHarga() + gorengan.getHarga() + daging.getHarga();
            System.out.println("Total : " + totalSemua);

            int payment;
            do {
                System.out.print("Uang bayar : ");
                payment = Integer.parseInt(br.readLine());

                if (payment < totalSemua) {
                    String jawab;

                    do {
                        System.out.print("Bayar lagi [y/n] ? ");
                        jawab = br.readLine();

                        switch (jawab) {
                            case "y":
                                break;

                            case "n":
                                System.out.println("Silakan bayar terlebih dahulu!");
                                break;
                        }
                    } while (jawab.equalsIgnoreCase("n"));
                } else {
                    System.out.println("Bukti transaksi");
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.println("Uang bayar : " + payment);
                    System.out.println("Total transaksi : " + totalSemua);
                    System.out.println("Uang kembalian : " + (payment - totalSemua));

                    System.out.println("Terima kasih :)");
                    System.exit(0);
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Failed! " + e.getMessage());
        }
    }
}