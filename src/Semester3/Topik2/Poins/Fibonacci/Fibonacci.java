package Semester3.Topik2.Poins.Fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// For 40 points
public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nilai 1 : ");
        int nilai1 = Integer.parseInt(br.readLine());
        System.out.print("Nilai 2 : ");
        int nilai2 = Integer.parseInt(br.readLine());
        System.out.print("Jumlah : ");
        int jumlah = Integer.parseInt(br.readLine());

        sequencer(nilai1, nilai2, jumlah);
    }

    private static void sequencer(int nilai1, int nilai2, int jumlah) {
        if (jumlah < 3) System.out.println("Jumlah deret minimal 3");
        else {
            System.out.println("Deret Fibonacci : ");
            for (int i = 1; i <= jumlah; i++) {
                System.out.print(nilai1 + " ");

                int sum = nilai1 + nilai2;
                nilai1 = nilai2;
                nilai2 = sum;
            }
        }
    }
}