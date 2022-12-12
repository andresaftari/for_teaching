package com.company.latian;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner any = new Scanner(System.in);
        LinkedList<Buku> list = new LinkedList<>();
        int menu;
        String isbn, judul, pengarang, tahun, harga;
        float rating;

        do {
            System.out.println("-- Masukkan Menu --");
            System.out.println("1. Masukkan Data");
            System.out.println("2. Ubah Data");
            System.out.println("3. Tampilkan Semua Data");
            System.out.println("4. Tampilkan Data Berdasarkan ISBN");
            System.out.println("5. Hapus Data");
            System.out.println("6. Keluar");
            System.out.print("Masukkan Menu : ");

            menu = any.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Masukkan ISBN : ");
                    isbn = any.next();
                    System.out.println("Masukkan Judul : ");
                    judul = any.next();
                    System.out.println("Masukkan Pengarang : ");
                    pengarang = any.next();
                    System.out.println("Masukkan Tahun Terbit : ");
                    tahun = any.next();
                    System.out.println("Masukkan Harga : ");
                    harga = any.next();
                    System.out.println("Masukkan Rating : ");
                    rating = any.nextFloat();

                    Buku buku = new Buku(isbn, judul, pengarang, tahun, harga, rating);
                    list.add(buku);

                    break;

                case 2:
                    // Untuk menu kedua, ntar isi disini nih... tadi kan belom kamu isi ya ga?
                    break;

                case 3:
                    if (list.isEmpty()) System.out.println("Data kosong, Silahkan isi data");
                    else {
                        for (Buku value : list) {
                            value.tampil();
                        }
                    }
                    break;

                case 4:
                    // Untuk menu keempat, ntar isi disini nih... tadi kan belom kamu isi ya ga?
                    break;

                case 5:
                    // Gini aja nih lebih gampang deletenya gw :
                    System.out.println("Masukkan ISBN : ");
                    String cariIsbn = any.next();

                    int index = list.size() - 1;

                    if (list.size() == 0) System.out.println("Tidak ada data itu");
                    else {
                        for (int i = 1; i <= list.size(); i++) {
                            if (cariIsbn.equalsIgnoreCase(list.get(index).getIsbn())) {
                                list.remove(index).tampil();
                                System.out.println("Data terhapus");
                            } else {
                                System.out.println("ISBN tidak ditemukan");
                            }
                        }
                    }

//                    String tampung;
//
//                    for (int i = 1; i <= list.size(); i++) {
//                        if (cariIsbn.equals(list.get(i).getIsbn())) {
//                            list.remove(i).tampil();
//                            break;
//                        } else tampung = "Tidak ada data itu";
//                        if (tampung.equals("")) {
//                            System.out.println("Data terhapus");
//                        } else {
//                            System.out.println(tampung);
//                        }
//                    }
                    break;

                case 6:
                    System.out.println("Gomawo :)");
                    System.exit(0);

                default:
                    System.out.println("Yang betul la bossq\n");
                    break;
            }
        }
        while (true);
    }
}

class Buku {
    private final String isbn;
    private String judulBuku;
    private String pengarang;
    private String tahunTerbit;
    private String harga;
    private float rating;

    public Buku(String isbn, String judulBuku, String pengarang, String tahunTerbit, String harga, float rating) {
        this.isbn = isbn;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void tampil() {
        System.out.println("ISBN : " + getIsbn());
        System.out.println("Judul : " + getJudulBuku());
        System.out.println("Pengarang : " + getPengarang());
        System.out.println("Tahun Terbit : " + getTahunTerbit());
        System.out.println("Harga : " + getHarga());
        System.out.println("Rating : " + getRating());
        System.out.println("~~~~~~~~~~~~~~");
    }
}