package com.company.lms;

import java.util.ArrayList;
import java.util.Scanner;

public class Buku {
    static ArrayList<DataBuku> dataBuku = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        String isbn, judulBuku, pengarang, tahunTerbit, harga;
        float rating;
        do {
            System.out.println
                    (
                            "==========[Pilih Menu]========= \n" +
                                    "1. Insert Buku \n" +
                                    "2. Ubah Data Buku \n" +
                                    "3. Lihat Buku \n" +
                                    "4. Cari Buku Berdasarkan ISBN \n" +
                                    "5. Hapus Buku \n" +
                                    "6. Keluar! \n" +
                                    "==============================="
                    );
            System.out.print("Menu ke - ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Jumlah Buku");
                    System.out.print("ISBN : ");
                    isbn = scanner.next();
                    System.out.print("Judul : ");
                    judulBuku = scanner.next();
                    System.out.print("Pengarang : ");
                    pengarang = scanner.next();
                    System.out.print("Tahun Terbit : ");
                    tahunTerbit = scanner.next();
                    System.out.print("Harga : ");
                    harga = scanner.next();
                    System.out.print("Rating : ");
                    rating = scanner.nextInt();
                    dataBuku.add(new DataBuku(isbn, judulBuku, pengarang, tahunTerbit, harga, rating));
                    System.out.println("Berhasil Menambahkan Buku!");
                    break;
                case 2:
                    if (dataBuku.size() == 0) {
                        System.out.println("Tidak ada data buku!");
                    } else {
                        System.out.print("Masukkan ISBN: ");
                        isbn = scanner.next();
                        int index = 0;
                        for (DataBuku buku : dataBuku) {
                            if (!isbn.equals(buku.getIsbn())) {
                                index++;
                            } else if (isbn.equals(buku.getIsbn())) {
                                System.out.print("Ubah Data Buku\n" +
                                        "Judul: ");
                                judulBuku = scanner.next();
                                System.out.print("Pengarang: ");
                                pengarang = scanner.next();
                                System.out.print("Tahun terbit: ");
                                tahunTerbit = scanner.next();
                                System.out.print("Harga: ");
                                harga = scanner.next();
                                System.out.print("Rating: ");
                                rating = scanner.nextFloat();
                                dataBuku.set(index, new DataBuku(isbn, judulBuku, pengarang, tahunTerbit, harga, rating));
                                System.out.println("Update Buku Berhasil!");
                            }
                        }
                    }
                    break;
                case 3:
                    if (dataBuku.isEmpty())
                        System.out.println("Tidak ada data buku!");
                    else
                        for (DataBuku data : dataBuku)
                            System.out.println(
                                    "ISBN : " + data.getIsbn() + "\n" +
                                            "Judul Buku : " + data.getJudulBuku() + "\n" +
                                            "Pengarang : " + data.getPengarang() + "\n" +
                                            "Tahun Terbit : " + data.getTahunTerbit() + "\n" +
                                            "Harga : " + data.getHarga() + "\n" +
                                            "Rating : " + data.getRating() + "\n"

                            );
                    break;
                case 4:
                    if (dataBuku.isEmpty())
                        System.out.println("Tidak ada data buku!");
                    else
                        for (DataBuku data : dataBuku) {
                            System.out.print("Masukkan ISBN: ");
                            isbn = scanner.next();
                            if (isbn.equals(data.getIsbn())) {
                                System.out.println(
                                        "ISBN : " + data.getIsbn() + "\n" +
                                                "Judul Buku : " + data.getJudulBuku() + "\n" +
                                                "Pengarang : " + data.getPengarang() + "\n" +
                                                "Tahun Terbit : " + data.getTahunTerbit() + "\n" +
                                                "Harga : " + data.getHarga() + "\n" +
                                                "Rating : " + data.getRating() + "\n"
                                );
                            } else {
                                System.out.println("Buku dengan ISBN : " + isbn + " tidak ditemukan.");
                            }
                        }
                    break;
                case 5:
                    System.out.print("Masukkan ISBN :");
                    isbn = scanner.next();

                    deleteBuku(isbn);
                    if (dataBuku.size() != 0) for (DataBuku listBuku : dataBuku) System.out.println(listBuku);

                    break;
                default:
                    System.out.println("Keluar!");
                    System.exit(0);
            }
        } while (true);
    }

    private static void deleteBuku(String findISBN) {
        int index = dataBuku.size() - 1;

        if (dataBuku.size() == 0) System.out.println("Data buku kosong");
        else {
            for (int i = 1; i <= dataBuku.size(); i++) {
                if (findISBN.equalsIgnoreCase(dataBuku.get(index).getIsbn())) {
                    dataBuku.remove(index);
                    System.out.println("Data berhasil dinghapus");
                } else {
                    System.out.println("Judul tidak ditemukan");
                }
            }
        }
    }
}