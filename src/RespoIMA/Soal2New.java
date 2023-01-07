package RespoIMA;

import java.util.Scanner;

public class Soal2New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // sebuah integer input n menyatakan jumlah toples yang tersedia
        int n = sc.nextInt();
        // sebuah integer input total menyatakan total jumlah yang diinginkan
        int total = sc.nextInt();

        // array untuk menampung jumlah permen dari setiap toples yang ada
        int[] arrToples = new int[n];

        // for loop untuk mengisi jumlah permen ke dalam tiap toples
        for (int i = 0; i < arrToples.length; i++) {
            arrToples[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arrToples.length; i++) {
            // catat jumlah permen, nyatakan sebagai toples pertama
            int toples1 = arrToples[i];

            for (int j = i + 1; j < arrToples.length; j++) {
                // catat jumlah permen, nyatakan sebagai toples kedua 
                int toples2 = arrToples[j];
                // nomor toples pertama
                int num1 = i + 1;
                // nomor toples kedua
                int num2 = j + 1;

                // jumlah permen dari toples pertama dan kedua harus sama 
                // seperti jumlah total yang diinginkan
                if (toples1 + toples2 == total) {
                    if (num1 > num2)
                        // sesuai soal, apabila nomor toples pertama
                        // lebih besar daripada toples kedua,
                        // outputnya harus toples kedua dulu (terkecil)
                        System.out.println(num2 + " " + num1);
                    else if (num2 > num1)
                        // sesuai soal, vice versa (kebalikan if-nya)
                        System.out.println(num1 + " " + num2);
                }
            }
        }
    }
}
