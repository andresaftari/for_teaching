package CobaIMA2022;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // INPUT DARI USER
        int num = sc.nextInt();

        // TEMPORARY VARIABLE ADALAH INPUT DARI USER YANG AKAN DIJADIKAN SYARAT WHILE LOOP
        // LAST VARIABLE DIGUNAKAN UNTUK DIGIT TERAKHIR
        // TOTAL ADALAH VARIABLE YANG MENJADI SUM / JUMLAH DARI FAKTORIAL NANTI
        int temp = num, last, total = 0;

        do {
            // GUNAKAN i = 1 DAN fact = 1, INI YANG NANTI MENJADI ITERASI SELAMA DIGIT MASIH ADA DAN BELUM SAMPAI DIGIT
            // TERAKHIR (BELUM SAMPAI LAST)
            int i = 1, fact = 1;
            // NAH, UNTUK MENDAPATKAN DIGIT TERAKHIR, GUNAKAN MODULUS 10, KARENA AKAN MENGHASILKAN SISA DIGIT TERAKHIR
            last = temp % 10;

            // GUNAKAN WHILE YANG MELAKUKAN LOOPING SELAMA i SAMPAI DI DIGIT TERAKHIR
            while (i <= last) {
                // GUNAKAN RUMUS FAKTORIAL PADA UMUMNYA, NAMUN GANTI DIGIT DENGAN i SEBAGAI PENGALINYA
                fact *= i;
                // UPDATE i UNTUK MENDAPATKAN DIGIT DIGIT BERIKUTNYA SAMPAI DIGIT TERAKHIR
                // (INI SIFATNYA DIGIT TERTINGGI SAMPAI DIGIT TERAKHIR)
                i++;
            }

            // TOTAL ATAU SUM DIDAPATKAN DARI FAKTORIAL YANG DITAMBAHKAN
            total += fact;
            // SELANJUTNYA TEMPORARY VARIABLE HARUS DIBAGI 10, KARENA UNTUK MENGHENTIKAN LOOPING KETIKA SUDAH SAMPAI
            // DIGIT TERAKHIR
            temp /= 10;
            // TUTUP WHILE DENGAN temp > 0, KARENA LOOPING HARUS TERJADI SELAMA DIGIT BELUM HABIS
            // (BELUM SAMPAI DIGIT TERAKHIR)
        } while (temp > 0);

        // KALAU TOTAL SUMMARY NYA SAMA DENGAN INPUT, BALIKANNYA YA
        if (total == num) System.out.println("YA");
        // LALU VICE VERSA
        else System.out.println("BUKAN");
    }
}
