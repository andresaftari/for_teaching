package RespoIMA;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // dimensi matrix nya (n * 2)

        int[][] arrMatrix = new int[n][2];
        int[] arrResult = new int[n];

        for (int i = 0; i < n; i++) {
            arrMatrix[i][0] = sc.nextInt();
            arrMatrix[i][1] = sc.nextInt();
            
            int x = reverse(arrMatrix[i][0]);
            int y = reverse(arrMatrix[i][1]);
            
            int res = x + y;
            arrResult[i] = res;
        }

        for (int res : arrResult) {
            System.out.println(res);
        }
    }

    private static int reverse(int x) {
        int reversed = 0;

        while (x > 0) {
            int last = x % 10;
            reversed = reversed * 10 + last;
            x /= 10;
        }

        return reversed;
    }
}
