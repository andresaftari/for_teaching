package BelajarPBO.Topik2.Buku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Buku> listBuku = new ArrayList<>();
        int inputOption;

        do {
            System.out.println("\n1. Input data\n2. Mengubah data\n3. Tampilkan semua\n" +
                    "4. Tampilkan sesuai ISBN\n5. Menghapus Data\n6. Exit");

            inputOption = Integer.parseInt(br.readLine());
            switch (inputOption) {
                case 1:
                    System.out.println("Berapa banyak buku?");
                    int banyakBuku = Integer.parseInt(br.readLine());
                    int[] arrayBuku = new int[banyakBuku];

                    for (int i = 0; i < arrayBuku.length; i++) {
                        System.out.print("\nInput ISBN: ");
                        String isbn = br.readLine();

                        System.out.print("Input Judul: ");
                        String judul = br.readLine();

                        System.out.print("Input Pengarang: ");
                        String pengarang = br.readLine();

                        System.out.print("Input Tahun: ");
                        String tahun = br.readLine();

                        System.out.print("Input Harga: ");
                        double harga = Double.parseDouble(br.readLine());

                        System.out.print("Input Rating: ");
                        float rating = Float.parseFloat(br.readLine());

                        listBuku.add(new Buku(isbn, judul, pengarang, tahun, harga, rating));
                    }
                    break;

                case 2:
                    int index = listBuku.size() - 1;

                    if (index < 0) System.out.println("Data buku kosong");
                    else {
                        System.out.print("Isbn yang ingin dicari : ");
                        String findISBN = br.readLine();

                        for (Buku buku : listBuku) {
                            if (findISBN.equals(listBuku.get(index).getIsbn())) {
                                System.out.print("Input Judul baru: ");
                                String editJudul = br.readLine();

                                System.out.print("Input Pengarang baru: ");
                                String editPengarang = br.readLine();

                                System.out.print("Input Tahun baru: ");
                                String editTahun = br.readLine();

                                System.out.print("Input Harga baru: ");
                                double editHarga = Double.parseDouble(br.readLine());

                                System.out.print("Input Rating baru: ");
                                float editRating = Float.parseFloat(br.readLine());

                                listBuku.set(index, new Buku(editJudul, editPengarang, editTahun, editHarga, editRating));
                            } else {
                                System.out.println("ISBN tidak ditemukan");
                                System.out.println("List buku yang ada : " + buku.toString());
                            }
                        }
                    }
                    break;

                case 3:
                    for (Buku kumpulanBuku : listBuku) System.out.println(kumpulanBuku.toString());
                    break;

                case 4:
                    System.out.print("Isbn yang ingin dicari : ");
                    String findISBN = br.readLine();

                    for (Buku buku : listBuku) {
                        if (findISBN.equals(buku.getIsbn())) System.out.println(buku.toString());
                        else System.out.println("Periksa kembali daftar buku yang ada");
                    }
                    break;

                case 5:
                    int indexHapus = listBuku.size() - 1;

                    System.out.print("Judul yang ingin dicari : ");
                    String findJudul = br.readLine();

                    if (indexHapus < 0) System.out.println("Data buku kosong");
                    else for (int i = 1; i <= listBuku.size(); i++) {
                        if (findJudul.equalsIgnoreCase(listBuku.get(indexHapus).getJudulBuku())) {
                            listBuku.remove(indexHapus);
                            System.out.println("Data berhasil dinghapus");
                        } else System.out.println("Judul tidak ditemukan");
                    }
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Input menunya yang bener anj");
            }
        } while (true);
    }
}