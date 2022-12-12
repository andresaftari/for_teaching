package Bebas.Responsi;

import java.util.Scanner;

public class ContohIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai Anda : ");
        int nilai = scanner.nextInt();

        if (nilai <= 10) {
            System.out.println("Tidak lulus");
        }
        else if (nilai > 11 && nilai < 45) {
            System.out.println("Indexnya C");
        }
        else if (nilai >= 46 && nilai <= 80) {
            System.out.println("Indexnya B");
        }
        else if (nilai >= 81 && nilai <= 100){
            System.out.println("Indexnya A");
        }
        else {
            System.out.println("Index tidak melebihi batas");
        }
    }
}