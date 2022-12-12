package Semester3.Topik2.Poins.SewaKendaraan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// For 80 points
public class Penyewa {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Motor> listMotor = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        do {
            System.out.println("\nSelamat Datang di 24Garage");
            System.out.println("\n1. Lihat kode motor\n2. Input data\n3. Selesai transaksi\n4. Exit");
            int option = Integer.parseInt(br.readLine());

            switch (option) {
                case 1:
                    System.out.println("M01: Untuk motor sport - Rp5.000" +
                            "\nM02: Untuk motor bebek - Rp4.600" +
                            "\nM03: Untuk motor matic - Rp3.500");
                    break;

                case 2:
                    inputData();
                    break;

                case 3:
                    showBill();
                    break;

                default:
                    System.exit(0);
            }
        } while (true);
    }

    private static void inputData() {
        String jenis;
        double totalHarga = 0.00;
        double biaya = 0.00;
        System.out.println("Isi data penyewa");

        try {
            System.out.print("Nama user : ");
            String nama = br.readLine();
            System.out.print("Kode motor : ");
            String kode = br.readLine();
            System.out.print("Jam berangkat : ");
            String jamBerangkat = br.readLine();
            System.out.print("Menit berangkat : ");
            String menitBerangkat = br.readLine();
            System.out.print("Jam kembali : ");
            String jamKembali = br.readLine();
            System.out.print("Menit kembali : ");
            String menitKembali = br.readLine();

            switch (kode) {
                case "M01":
                    jenis = "Motor Sport";
                    biaya = 5000.00;
                    break;

                case "M02":
                    jenis = "Motor Bebek";
                    biaya = 4600.00;
                    break;

                case "M03":
                    jenis = "Motor Matic";
                    biaya = 3500.00;
                    break;

                default:
                    System.out.println(jenis = "Hanya ada M01, M02 ataupun M03");
                    System.exit(0);
            }

            int selisihJam = Integer.parseInt(jamKembali) - Integer.parseInt(jamBerangkat);

            int minutes = (60 * selisihJam) + (Integer.parseInt(menitKembali) - Integer.parseInt(menitBerangkat));
            double harga = biaya * minutes;
            double total = harga / 60;

            if (total >= 15000.00 || total < 25000.00) {
                double getDiskon = total * 0.05;
                totalHarga = total - getDiskon;
            }
            if (total < 15000.00) totalHarga = total;
            if (total >= 25000.00) {
                double getDiskon = total * 0.10;
                totalHarga = total - getDiskon;
            }

            listMotor.add(
                    new Motor(
                            nama,
                            jenis,
                            Integer.parseInt(jamBerangkat),
                            Integer.parseInt(jamKembali),
                            Integer.parseInt(menitBerangkat),
                            Integer.parseInt(menitKembali),
                            (totalHarga)
                    )
            );
        } catch (Exception e) {
            System.out.println("Failed! " + e.getMessage());
        }
    }

    private static void showBill() {
        for (Motor motor : listMotor) System.out.println(motor.toString());
    }
}
