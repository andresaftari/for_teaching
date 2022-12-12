package Bebas.VitowithIf;

import java.io.*;

class Tugas {
    static void barang() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String z;
            int Jumlah1 = 0, Jumlah2 = 0, Jumlah3 = 0, Jumlah4 = 0;
            int Total1 = 0, Total2 = 0, Total3 = 0, Total4 = 0;
            int A = 20000, B = 20500, C = 64500, D = 20000;

            System.out.println("=====================================");
            System.out.println("\tToko Buku Sejahtera  ");
            System.out.println("=====================================");
            System.out.println("1. Buku Gambar A3             Rp. 20.000");
            System.out.println("2. Buku Tulis Sinar Dunia 32  Rp. 20.500");
            System.out.println("3. Buku Batik Folio 100       Rp. 64.500");
            System.out.println("4. Ballpoint Standard AE-7    Rp. 20.000");
            System.out.println("=====================================\n");

            System.out.println("Nama Pelanggan\t: ");
            String Nama = br.readLine();
            System.out.println("Nomor Telepon Pelaggan\t: ");
            String Nomor = br.readLine();

            // equalsIgnoreCase() artinya tidak perlu memikirkan Y (kapital) ataupun y (non-kapital)
            // sama seperti menuliskan z.equals("Y") || z.equals("y");
            for (z = "y"; z.equalsIgnoreCase("Y"); ) {
                System.out.println();
                System.out.print("Nama Barang: ");
                String Nama_br = br.readLine();
                System.out.print("Harga Barang: ");
                int Harga = Integer.parseInt(br.readLine());

                // Nama_br.contains berfungsi untuk menampung kata kunci, sehingga kita tidak perlu menuliskan
                // nama barang secara lengkap, cukup kata kunci berikut saja
                if (Harga == 20000 && Nama_br.contains("Buku Gambar") || Nama_br.contains("buku gambar")) {
                    System.out.println("Jumlah beli\t: ");
                    Jumlah1 = Integer.parseInt(br.readLine());
                    Total1 += A;
                    Total1 *= Jumlah1;
                    System.out.println("Buku Gambar A3 (" + Jumlah1 + ") = Rp." + Total1);

                } else if (Harga == 20500 && Nama_br.contains("Buku Tulis") || Nama_br.contains("buku tulis")) {
                    System.out.println("Jumlah beli\t: ");
                    Jumlah2 = Integer.parseInt(br.readLine());
                    Total2 += B;
                    Total2 *= Jumlah2;
                    System.out.println("Buku Tulis Sinar Dunia 32 (" + Jumlah2 + ") = Rp." + Total2);

                } else if (Harga == 64500 && Nama_br.contains("Buku Batik") || Nama_br.contains("buku batik")) {
                    System.out.println("Jumlah beli\t: ");
                    Jumlah3 = Integer.parseInt(br.readLine());
                    Total3 += C;
                    Total3 *= Jumlah3;
                    System.out.println("Buku Batik Folio 100 (" + Jumlah3 + ") = Rp." + Total3);

                } else if (Harga == 20000 && Nama_br.contains("Ballpoint") || Nama_br.contains("ballpoint")) {
                    System.out.println("Jumlah beli\t: ");
                    Jumlah4 = Integer.parseInt(br.readLine());
                    Total4 += D;
                    Total4 *= Jumlah4;
                    System.out.println("Ballpoint Standard AE-7 (" + Jumlah4 + ") = Rp." + Total4);
                }

                {
                    System.out.print("\nApakah ingin membeli barang lagi? Y/T : ");
                    z = br.readLine();
                }

                if (z.equalsIgnoreCase("T")) {
                    System.out.println();
                    int Total = Total1 + Total2 + Total3 + Total4;
                    int Jumlah = Jumlah1 + Jumlah2 + Jumlah3 + Jumlah4;
                    System.out.println("=====================================");
                    System.out.println("\t\tNOTA");
                    System.out.println("\tToko Buku Sejahtera  ");
                    System.out.println("=====================================");
                    System.out.println("Nama Pelanggan\t: " + Nama);
                    System.out.println("Nomor Telepon Pelaggan\t: " + Nomor);
                    System.out.println("Total Pembelian Barang : " + Jumlah);
                    System.out.println("Total Harga Pembelanjaan : Rp. " + Total);
                    System.out.println("TERIMA KASIH ");
                    System.out.println("============================================");
                }
            }
        } catch (Exception e) {
            System.out.println("Terjadi error dalam barang(): " + e.getMessage());
        }
    }
}