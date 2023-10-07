package pbo.tugas1;

import java.util.ArrayList;
import java.util.Collections;

public class Bagian2 {
    static ArrayList<Integer> listKelas01 = new ArrayList<>();
    static ArrayList<Integer> listKelas02 = new ArrayList<>();

    public static void main(String[] args) {
        // Buat menu pilihan dengan do while dan switch case
    }

    public static void tambahNilai01(int nilai) {
        listKelas01.add(nilai);
    }

    public static void tambahNilai02(int nilai) {
        listKelas02.add(nilai);
    }

    public static void statsKelas01() {
        // Buat pengecekan list kosong dulu sebelum melakukan perhitungan berikut
        int sum = 0;
        for (int nilai : listKelas01) {
            sum += nilai;
        }

        // Gunakan sum untuk nilai rata-rata, rumusnya rata-rata = sum / list.size
        // Print semua nilai, rata-rata, nilai tertinggi, dan nilai terendah
        int tertinggi = Collections.max(listKelas01);
        int terendah = Collections.min(listKelas01);
    }

    public static void statsKelas02() {
        // Buat pengecekan list kosong dulu sebelum melakukan perhitungan berikut
        int sum = 0;
        for (int nilai : listKelas02) {
            sum += nilai;
        }

        // Gunakan sum untuk nilai rata-rata, rumusnya rata-rata = sum / list.size
        // Print semua nilai, rata-rata, nilai tertinggi, dan nilai terendah
        int tertinggi = Collections.max(listKelas02);
        int terendah = Collections.min(listKelas02);
    }

    public static void statsKeseluruhan() {
        // Buat pengecekan list kosong dulu sebelum melakukan perhitungan berikut
        ArrayList<Integer> allKelas = new ArrayList<>();
        allKelas.addAll(listKelas01);
        allKelas.addAll(listKelas02);

        int sum = 0;
        for (int nilai : allKelas) {
            sum += nilai;
        };

        // Gunakan sum untuk nilai rata-rata, rumusnya rata-rata = sum / list.size
        // Print semua nilai, rata-rata, nilai tertinggi, dan nilai terendah
        int tertinggi = Collections.max(allKelas);
        int terendah = Collections.min(allKelas);
    }
}
