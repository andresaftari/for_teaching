package Semester3.Topik2.Poins.BilanganPrima;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// For 40 poins
public class BilanganPrima {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Daftar Bilangan Prima");

        System.out.print("Batas Nilai : ");
        int batasNilai = Integer.parseInt(br.readLine());

        prima(batasNilai);
    }

    private static void prima(int nilaiBatas) {
        int bilangan;

        if (nilaiBatas < 2) System.out.println("Batas minimal inputan adalah 2");
        else {
            for (int i = 0; i <= nilaiBatas; i++) {
                bilangan = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        bilangan = bilangan + 1;
                    }
                }
                if (bilangan == 2) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}