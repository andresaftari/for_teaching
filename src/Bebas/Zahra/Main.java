package Bebas.Zahra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static final ArrayList<Objects> barang = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String kodebarang, namaBarang;
        int hargaBarang, jumlahBarang, pilihan;

        do {
            System.out.println("1. Input data barang\n2. Scan barcode pembeli\n3. Tampilkan semua barang dengan harganya\n4. Exit");
            System.out.print("Silakan pilih opsi : ");
            pilihan = Integer.parseInt(br.readLine());

            switch (pilihan) {
                case 1:
                    System.out.println();
                    System.out.print("Input kode barang : ");
                    kodebarang = br.readLine();
                    System.out.print("Input nama barang : ");
                    namaBarang = br.readLine();
                    System.out.print("Input harga barang : ");
                    hargaBarang = Integer.parseInt(br.readLine());

                    barang.add(new Objects(kodebarang, namaBarang, hargaBarang));

                    break;

                case 2:
                    System.out.println();
                    System.out.print("Input kode barang : ");
                    kodebarang = br.readLine();
                    System.out.print("Input nama barang : ");
                    namaBarang = br.readLine();
                    System.out.print("Input harga barang : ");
                    hargaBarang = Integer.parseInt(br.readLine());
                    System.out.print("Input jumlah barang : ");
                    jumlahBarang = Integer.parseInt(br.readLine());

                    for (Objects harga : barang)
                        if (harga.getKodeBarang().equalsIgnoreCase(kodebarang) ||
                                harga.getNamaBarang().equalsIgnoreCase(namaBarang) ||
                                harga.getHargaBarang() == hargaBarang)
                            System.out.println("Total harga yang harus dibayar : " + hargaBarang * jumlahBarang);
                    break;

                case 3:
                    System.out.println();
                    for (Objects listBarang: barang) System.out.println(listBarang);
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("GAK ADA OPSI " + pilihan + " BEGE!");
            }
        }
        while (true);
    }
}