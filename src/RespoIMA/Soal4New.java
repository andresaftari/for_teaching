package RespoIMA;

import java.util.Scanner;

public class Soal4New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sebuah integer input n menyatakan banyaknya elemen array
        int n = sc.nextInt();

        // buat 2 buah String array 1D, salah satu sebagai array utama
        // dan salah satu sebagai array hasil
        String[] arrStr = new String[n];
        String[] arrRes = new String[n];

        for (int i = 0; i < n; i++) {
            // isi array utama dengan elemen String
            arrStr[i] = sc.next();
        }

        // for loop untuk index genap
        for (int i = 0; i < arrStr.length; i += 2) {
            if (i != n - 1) {
                // apabila index belum mencapai index terakhir, isi
                // index+1 array hasil dengan elemen index-i array utama 
                arrRes[i + 1] = arrStr[i];
            } else {
                // apabila index sudah di index terakhir, isi
                // elemen terakhir array hasil dengan elemen terakhir array utama 
                arrRes[n - 1] = arrStr[n - 1];
            }
        }

        // for loop untuk index ganjil
        for (int i = 1; i < arrStr.length; i += 2) {
            // isi index-1 array hasil dengan elemen index-i array utama
            arrRes[i - 1] = arrStr[i];
        }

        // tampilkan array hasil menggunakan foreach
        for (String str : arrRes) {
            System.out.println(str);
        }
    }
}
