package Semester3.Topik2.Poins.SigmaFX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// For 20 points
public class SigmaFungsi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Batas nilai : ");
        int inputan = Integer.parseInt(br.readLine());

        calculateFunction(inputan);
    }

    private static void calculateFunction(int input) {
        if (input <= 0) System.out.println("Batas minimal inputan adalah 1");
        else {
            int function = (int) (Math.pow(2, input) + 4 * input + 4);
            System.out.println("Jumlah : " + function);
        }
    }
}