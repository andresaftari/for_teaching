package RespoIMA;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int space = 1;
        int n = sc.nextInt();

        space = n - 1;
        for (int i = 1; i <= n; i++)  {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            space--;

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");                
            }

            System.out.println();
        }

        space = 1;

        for (int j = 1; j <= n - 1; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            
            space++;

            for (int i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}