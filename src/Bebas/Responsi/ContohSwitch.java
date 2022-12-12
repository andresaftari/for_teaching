package Bebas.Responsi;

import java.util.Scanner;

public class ContohSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Anda kuliah dimana?\nA. Bandung\nB. Jakarta\nC. Lainnya");
        String ekspektasi = scanner.next();

        switch (ekspektasi) {
            case "A":
                System.out.println("Anda kuliah di Bandung");
                break;

            case "B":
                System.out.println("Anda kuliah di Jakarta");
                break;

            default:
                System.out.println("Anda kuliah di tempat lain");
        }
    }
}