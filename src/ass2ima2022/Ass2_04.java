package ass2ima2022;

import java.util.Scanner;

// not fixed
public class Ass2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = sc.nextInt();

        int[] arrNum = new int[n];

        for (int i = 0; i < n; i++) {
            arrNum[i] = sc.nextInt();
        }

        for (int i = 0; i < arrNum.length; i++) {
            int num1 = arrNum[i];
            
            for (int j = i + 1; j < arrNum.length; j++) {
                int num2 = arrNum[j];

                int x = i + 1;
                int y = j + 1;

                if (num1 + num2 == total) {
                    System.out.println(x + " " + y);
                }
            }
        }
    }
}
