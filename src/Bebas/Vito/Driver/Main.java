package Bebas.Vito.Driver;

import Bebas.Vito.Hitung.TotalBeli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final TotalBeli totalBeli = new TotalBeli();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Selamat datang di Warung Jancuk, lu mau ngapain nyet?\n1. Beli barang lah\n2. Ngopi dulu lah\n3. Gak jadi HEHE");
            System.out.print("Pilih opsi 1, 2 atau 3 : ");
            int option = Integer.parseInt(br.readLine());

            switch (option) {
                case 1:
                    totalBeli.beli();
                    break;

                case 2:
                    System.out.println("\nOke nih, gw buatin kopi luwak buat lu nyet");
                    break;

                case 3:
                    System.out.println("\nYeuuuu, ngapain dateng bangsyul");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ga ada pilihan" + option + " bodoooh");
            }
        }
        while (true);
    }
}
