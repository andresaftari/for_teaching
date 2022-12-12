package Bebas.LatihanTLX;

import java.util.Scanner;

public class TOKIidol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nilai1 = scanner.nextInt();
        int nilai2 = scanner.nextInt();
        int nilai3 = scanner.nextInt();

        int total = nilai1 + nilai2 + nilai3;

        if (nilai1 >= 50 && nilai2 >= 50 && nilai3 >= 50) {
            if (total >= 200) System.out.println("Lolos");
            else System.out.println("Tidak Lolos");
        } else System.out.println("Tidak Lolos");
    }
}
