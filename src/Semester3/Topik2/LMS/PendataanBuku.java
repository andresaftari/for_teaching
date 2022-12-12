package Semester3.Topik2.LMS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PendataanBuku {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Buku> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        System.out.println("Selamat datang di program pendataan buku");
        System.out.println("Silakan pilih salah satu menu berikut:");

        do {
            System.out.println("\n1. Input data buku\n2. Edit data buku\n3. Tampilkan semua buku\n" +
                    "4. Tampilkan salah satu buku dengan isbn\n5. Hapus data buku");
            int option = Integer.parseInt(br.readLine());

            switch (option) {
                case 1:
                    inputBuku();
                    break;

                case 2:
                    System.out.println("Input judul buku yang ingin diedit: ");
                    String findJudultoEdit = br.readLine();

                    editBuku(findJudultoEdit);
                    break;

                case 3:
                    getAllBuku();
                    break;

                case 4:
                    System.out.println("Input ISBN buku yang ingin dicari: ");
                    String findISBN = br.readLine();

                    getBukuWithISBN(findISBN);
                    break;

                case 5:
                    System.out.println("Input judul buku yang ingin dihapus: ");
                    String findJudultoDelete = br.readLine();

                    deleteBuku(findJudultoDelete);
                    break;

                default:
                    System.out.println("Goodbye!");
                    System.exit(0);
            }
        } while (true);
    }

    private static void inputBuku() throws IOException {
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
            String harga = br.readLine();

            System.out.print("Input Rating: ");
            float rating = Float.parseFloat(br.readLine());

            list.add(new Buku(isbn, judul, pengarang, tahun, harga, rating));
        }
    }

    private static void editBuku(String judul) throws IOException {
        int index = list.size() - 1;

        if (index < 0) System.out.println("Data buku kosong");
        else for (Buku buku : list) {
            if (judul.equalsIgnoreCase(list.get(index).getJudul())) {
                String isbn = buku.getIsbn();

                System.out.print("Input Judul baru: ");
                String editJudul = br.readLine();

                System.out.print("Input Pengarang baru: ");
                String editPengarang = br.readLine();

                System.out.print("Input Tahun baru: ");
                String editTahun = br.readLine();

                System.out.print("Input Harga baru: ");
                String editHarga = br.readLine();

                System.out.print("Input Rating baru: ");
                float editRating = Float.parseFloat(br.readLine());

                list.set(index, new Buku(isbn, editJudul, editPengarang, editTahun, editHarga, editRating));
            } else System.out.println("Judul tidak ditemukan");
        }
    }

    private static void getAllBuku() {
        if (list.size() == 0) System.out.println("Data buku kosong");
        else for (Buku buku : list) System.out.println(buku.toString());
    }

    private static void getBukuWithISBN(String isbn) {
        for (Buku buku : list) {
            if (isbn.equals(buku.getIsbn())) System.out.println(buku.toString());
            else System.out.println("Periksa kembali daftar buku yang ada");
        }
    }

    private static void deleteBuku(String findJudul) {
        int index = list.size() - 1;

        if (list.size() == 0) System.out.println("Data buku kosong");
        else for (int i = 1; i <= list.size(); i++) {
            if (findJudul.equalsIgnoreCase(list.get(index).getJudul())) {
                list.remove(index);
                System.out.println("Data berhasil dinghapus");
            } else System.out.println("Judul tidak ditemukan");
        }
    }
}

class Buku {
    private final String isbn;
    private final String judul;
    private final String pengarang;
    private final String tahun;
    private final String harga;
    private final float rating;

    public Buku(String isbn, String judul, String pengarang, String tahun, String harga, float rating) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun = tahun;
        this.harga = harga;
        this.rating = rating;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public String getTahun() {
        return tahun;
    }

    public String getHarga() {
        return harga;
    }

    public String getPengarang() {
        return pengarang;
    }

    public float getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Judul Buku: " + getJudul() +
                "\nPengarang: " + getPengarang() +
                "\nISBN: " + getIsbn() +
                "\nTahun: " + getTahun() +
                "\nHarga: " + getHarga() +
                "\nRating: " + getRating() + "\n";
    }
}