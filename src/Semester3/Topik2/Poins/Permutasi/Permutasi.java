package Semester3.Topik2.Poins.Permutasi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// For 30 points
public class Permutasi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Permutasi");

        System.out.print("\nNilai1 : ");
        int nilai1 = Integer.parseInt(br.readLine());
        System.out.print("Nilai2 : ");
        int nilai2 = Integer.parseInt(br.readLine());

        permutationCount(nilai1, nilai2);
    }

    private static int factorialCount(int numberToCount) {
        int i;
        int factorial = 1;
        for (i = 1; i <= numberToCount; i++) factorial *= i;

        return factorial;
    }

    private static void permutationCount(int number1, int number2) {
        if (number1 < 0 || number2 < 0) System.out.println("Nilai 1 dan nilai 2 harus bilangan bulat positif");
        else if (number1 < number2) System.out.println("Nilai 1 harus lebih besar dari nilai 2");
        else {
            // Count the permutation
            int rumus = factorialCount(number1) / factorialCount((number1 - number2));
            System.out.println("\nPermutasi (" + number1 + "," + number2 + ") = " + number1 + "! / (" + number1 + "-" + number2 + ")! = " + rumus);
        }
    }
}