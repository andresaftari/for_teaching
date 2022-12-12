package Bebas.VitowithSwitch;

import java.io.*;

class Store {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String namaPelanggan, nomorPelanggan;
    private static String option;

    static void barang() {
        try {
            Integer hargaA = 20000, hargaB = 20500, hargaC = 64500, hargaD = 20000;
            Integer counterA = 0, counterB = 0, counterC = 0, counterD = 0;
            Integer totalA = 0, totalB = 0, totalC = 0, totalD = 0;

            do {
                System.out.println("=====================================");
                System.out.println("\tToko Buku Sejahtera  ");
                System.out.println("=====================================");
                System.out.println("Pilih menu :\n1. Beli barang\n2. Bayar barang");

                int option2 = Integer.parseInt(br.readLine());

                switch (option2) {
                    case 1:
                        System.out.print("Nama Pelanggan\t: ");
                        namaPelanggan = br.readLine();
                        System.out.print("Nomor Telepon Pelaggan\t: ");
                        nomorPelanggan = br.readLine();

                        System.out.println("=====================================");
                        System.out.println("\tToko Buku Sejahtera  ");
                        System.out.println("=====================================");
                        System.out.println("1. Buku Gambar A3             Rp. 20.000");
                        System.out.println("2. Buku Tulis Sinar Dunia 32  Rp. 20.500");
                        System.out.println("3. Buku Batik Folio 100       Rp. 64.500");
                        System.out.println("4. Ballpoint Standard AE-7    Rp. 20.000");
                        System.out.println("=====================================\n");

                        System.out.print("Silakan tulis nama barang sesuai pilihan di atas : ");
                        option = br.readLine();
                        switch (option) {
                            case "Buku Gambar A3":
                                System.out.print("Jumlah barang : ");
                                counterA = Integer.parseInt(br.readLine());
                                totalA += hargaA;
                                totalA *= counterA;
                                System.out.println("Buku Gambar A3 = Rp." + totalA);
                                break;

                            case "Buku Tulis Sinar Dunia 32":
                                System.out.print("Jumlah barang : ");
                                counterB = Integer.parseInt(br.readLine());
                                totalB += hargaB;
                                totalB *= counterB;
                                System.out.println("Buku Tulis Sinar Dunia 32 = Rp." + totalB);
                                break;

                            case "Buku Batik Folio 100":
                                System.out.print("Jumlah barang : ");
                                counterC = Integer.parseInt(br.readLine());
                                totalC += hargaC;
                                totalC *= counterC;
                                System.out.println("Buku Batik Folio 100 = Rp." + totalC);
                                break;

                            case "Ballpoint Standard AE-7":
                                System.out.print("Jumlah barang : ");
                                counterD = Integer.parseInt(br.readLine());
                                totalD += hargaD;
                                totalD *= counterD;
                                System.out.println("Ballpoint Standard AE-7 = Rp." + totalD);
                                break;

                            default:
                                System.out.println("Tidak ada barang dengan nomor " + option);
                        }
                        break;

                    case 2:
                        System.out.println();
                        int total = totalA + totalB + totalC + totalD;
                        int jumlah = counterA + counterB + counterC + counterD;
                        System.out.println("=====================================");
                        System.out.println("\tNOTA");
                        System.out.println("\tToko Buku Sejahtera  ");
                        System.out.println("=====================================");
                        System.out.println("Nama Pelanggan\t: " + namaPelanggan);
                        System.out.println("Nomor Telepon Pelaggan\t: " + nomorPelanggan);
                        System.out.println("Barang yang di beli\t: " + option);

                        System.out.println("Total Pembelian Barang : " + jumlah);
                        System.out.println("Total Harga Pembelanjaan : Rp. " + total);
                        System.out.println("TERIMA KASIH ");
                        System.out.println("=====================================");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Tidak ada opsi dengan nomor " + option);
                }
            }
            while (true);

        } catch (Exception e) {
            System.out.println("Terjadi error dalam barang(): " + e.getMessage());
        }
    }
}