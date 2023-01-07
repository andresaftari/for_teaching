package RespoIMA;

import java.util.Scanner;

public class Soal1New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sebuah integer input dari user menyatakan besar diamond
        int n = sc.nextInt();
        // inisialisasi spasi terkecil (nanti digunakan untuk pola)
        int space = 1;

        // spasi pertama bagian atas dinyatakan sebagai 
        // besar pola (n) dikurang 1 spasi
        space = n - 1;
        // for loop untuk menentukan step ke-berapa
        for (int i = 1; i <= n; i++)  {
            // for loop untuk membuat spasi
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // karena pola segitiga diamond disini bagian atas,
            // maka spasi selalu berkurang 1 setiap stepnya
            space--;

            // for loop ini membuat segitiga diamond bagian atas
            // syarat yang digunakan sesuai soal, yaitu 2*i-1
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");                
            }

            System.out.println();
        }

        // spasi pertama bagian bawah dinyatakan sebagai 1 spasi
        space = 1;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // karena pola segitiga diamond disini bagian bawah,
            // maka spasi selalu bertambah 1 setiap stepnya
            space++;

            // for loop ini membuat segitiga diamond bagian bawah
            // syarat yang digunakan adalah 2 * (besar pola - i) -1
            // karena program harus membuat pola mirror sebelum
            // segitiga ke bawahnya
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
