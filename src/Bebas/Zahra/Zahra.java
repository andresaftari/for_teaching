package Bebas.Zahra;
import java.io.*;

public class Zahra {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Kode barang : ");
        String kode = br.readLine();

        System.out.print("Nama barang : ");
        String nama = br.readLine();

        System.out.print("Harga barang : ");
        Integer harga = Integer.parseInt(br.readLine());

        System.out.print("Jumlah barang : ");
        Integer jumlah = Integer.parseInt(br.readLine());

        System.out.print("\nKode barang dibeli : " + kode + "\n");
        System.out.print("Nama barang dibeli : " + nama + "\n");
        System.out.print("Harga barang dibeli : " + harga + "\n");
        System.out.print("\n==========================================\n");

        System.out.println("Total harga yang harus di bayar : " + jumlah * harga);
    }
}