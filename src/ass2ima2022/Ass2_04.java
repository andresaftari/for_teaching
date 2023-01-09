package ass2ima2022;

import java.util.Scanner;

public class Ass2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = sc.nextInt();
        String hasil = "";
        
        int[] arrAmsyong = new int[n];
        String[] arrHasil = new String[n];

        for (int i = 0; i < n; i++) {
            arrAmsyong[i] = sc.nextInt();
        }

        for (int i = 0; i < arrAmsyong.length; i++) {
            int number1 = arrAmsyong[i];

            for (int j = i + 1; j < arrAmsyong.length; j++) {
                int number2 = arrAmsyong[j];

                int x = i + 1;
                int y = j + 1;

                if (number1 + number2 == total) {
                    hasil = x + " " + y;
                }
            }

            arrHasil[i] = hasil;
        }

        System.out.println(arrHasil[arrHasil.length - 1]);
    }
}
