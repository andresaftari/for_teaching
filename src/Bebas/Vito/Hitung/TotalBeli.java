package Bebas.Vito.Hitung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalBeli {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static final Diskon diskon = new Diskon();

    public void beli() throws IOException {
        System.out.println("\nKita cuma jual Pulpen Hitam\nKalo mau beli tulis Pulpen Hitam di bawah : ");
        String namaBarang = br.readLine();
        System.out.println("Tulis jumlahnya : ");
        int jumlah = Integer.parseInt(br.readLine());
        int bayar;

        if (namaBarang.equalsIgnoreCase("Pulpen Hitam")) {
            if (jumlah > 5) {
                System.out.println("Lu lagi beli :\nNama Barang = " + namaBarang + "\nJumlah = " + jumlah);

                diskon.diskonPulpen();
                System.out.print("\nBerapa lu mau bayar? ");
                bayar = Integer.parseInt(br.readLine());

                int result = bayar - diskon.diskonPulpen();

                if (result >= 0) System.out.println("\nKembalian lu : " + result + ", thanks nyet\n");
                else System.out.println("\nUang lu ga cukup bego!\n");


            } else { // Kalo gak diskon
                System.out.println("Lu lagi beli :\nNama Barang = " + namaBarang + "\nJumlah = " + jumlah);
                System.out.print("\nBerapa lu mau bayar? ");
                bayar = Integer.parseInt(br.readLine());

                int hargaPulpen = 20000;
                int result = bayar - hargaPulpen;
                if (result >= 0) System.out.println("\nKembalian lu : " + result + ", thanks nyet\n");
                else System.out.println("\nUang lu ga cukup bego!\n");

            }
        } else System.out.println("\nGa ada barang " + namaBarang + " bege, cuma jual pulpen aja cok!\n");

    }
}
