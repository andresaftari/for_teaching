package RespoIMA;

import java.util.Scanner;

public class Soal2New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = sc.nextInt();

        int[] arrToples = new int[n];

        for (int i = 0; i < arrToples.length; i++) {
            arrToples[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arrToples.length; i++) {
            int toples1 = arrToples[i];

            for (int j = i + 1; j < arrToples.length; j++) {
                int toples2 = arrToples[j];

                if (toples1 + toples2 == total) {
                    if ((i + 1) > (j + 1))
                        System.out.println((j + 1) + " " + (i + 1));
                    else if ((j + 1) > (i + 1))
                        System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
    }
}
