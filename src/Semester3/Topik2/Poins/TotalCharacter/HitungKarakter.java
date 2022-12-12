package Semester3.Topik2.Poins.TotalCharacter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// For 20 points
public class HitungKarakter {
    static String huruf;
    static int totalHurufKonsonan = 0;
    static int totalHurufVokal = 0;
    static int totalAngka = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print("Huruf : ");
            huruf = br.readLine();

            isVokalorKonsonan(huruf);
            isNumber(huruf);
        } while (!huruf.equalsIgnoreCase("x"));

        System.out.println("Jumlah huruf vokal : " + totalHurufVokal);
        System.out.println("Jumlah huruf konsonan : " + totalHurufKonsonan);
        System.out.println("Jumlah angka : " + totalAngka);
    }

    private static void isVokalorKonsonan(String huruf) {
        if (huruf.equalsIgnoreCase("a") || huruf.equalsIgnoreCase("e")
                || huruf.equalsIgnoreCase("i") || huruf.equalsIgnoreCase("o")
                || huruf.equalsIgnoreCase("u")) {

            totalHurufVokal++;
        } else if (huruf.equalsIgnoreCase("b") || huruf.equalsIgnoreCase("c")
                || huruf.equalsIgnoreCase("d") || huruf.equalsIgnoreCase("f")
                || huruf.equalsIgnoreCase("g") || huruf.equalsIgnoreCase("h")
                || huruf.equalsIgnoreCase("j") || huruf.equalsIgnoreCase("k")
                || huruf.equalsIgnoreCase("l") || huruf.equalsIgnoreCase("m")
                || huruf.equalsIgnoreCase("n") || huruf.equalsIgnoreCase("p")
                || huruf.equalsIgnoreCase("q") || huruf.equalsIgnoreCase("r")
                || huruf.equalsIgnoreCase("s") || huruf.equalsIgnoreCase("t")
                || huruf.equalsIgnoreCase("v") || huruf.equalsIgnoreCase("w")
                || huruf.equalsIgnoreCase("x") || huruf.equalsIgnoreCase("y")
                || huruf.equalsIgnoreCase("z")) {

            totalHurufKonsonan++;
        }
    }

    private static void isNumber(String huruf) {
        for (int i = 0; i <= 500; i++) if (huruf.equalsIgnoreCase(String.valueOf(i))) totalAngka++;
    }
}