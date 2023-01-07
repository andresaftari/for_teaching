package RespoIMA;

import java.util.Scanner;

public class Soal3New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sebuah integer input n menyatakan dimensi row matriks
        int n = sc.nextInt();

        // matriks berupa array 2D dengan besar row adalah n, 
        // dan besar column-nya 2
        int[][] arrMatrix = new int[n][2];
        // array hasil berupa array 1D dengan besar n
        int[] arrResult = new int[n];

        for (int i = 0; i < n; i++) {
            // isi matriks dengan pola i di row-nya 
            // dan 0 atau 1 sebagai column-nya
            arrMatrix[i][0] = sc.nextInt();
            arrMatrix[i][1] = sc.nextInt();
            
            // reverse tiap elemen matriks yang tadi diinput
            // sehingga tiap elemen merupakan kebalikannya
            // (misal matrix[0][0] adalah 25 menjadi 52)
            int x = reverse(arrMatrix[i][0]);
            int y = reverse(arrMatrix[i][1]);
            int res = x + y;
            
            // semua hasil kebalikan diisi ke dalam array hasil 
            arrResult[i] = res;
        }

        // tampilkan array hasil menggunakan foreach
        for (int res : arrResult) {
            System.out.println(res);
        }
    }

    private static int reverse(int x) {
        int reversed = 0;

        // gunakan while loop untuk membalik sebuah bilangan
        // selama bilangan tersebut bisa dibagi 
        // (atau bisa disebut sebagai bilangan lebih dari 0)
        while (x > 0) {
            int last = x % 10;
            reversed = reversed * 10 + last;
            x /= 10;
        }

        return reversed;
    }
}
