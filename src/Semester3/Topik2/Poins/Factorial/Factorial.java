package Semester3.Topik2.Poins.Factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// For 20 points
public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Faktorial");
        System.out.print("\nNilai : ");
        int numberToCount = Integer.parseInt(br.readLine());

        if (numberToCount < 0) System.out.println("\nInputan harus berupa nilai positif lebih dari 1");
        else if (numberToCount == 0) System.out.println("\nInputan harus berupa nilai positif lebih dari 1");
        else {
            System.out.print("\nOutput : " + numberToCount + "! = ");
            int i;
            int factorial = 1;
            for (i = 1; i <= numberToCount; i++) factorial *= i;

            for (int j = numberToCount; j > 0; j--) {
                if (j == 1) System.out.print(1);
                else System.out.print(j + "*");
            }

            System.out.println(" = " + factorial);
        }
    }
}
