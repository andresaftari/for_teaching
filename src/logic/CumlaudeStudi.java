package logic;

import java.util.Scanner;

public class CumlaudeStudi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int semester = sc.nextInt();
        double ipk = sc.nextDouble();
        int eprt = sc.nextInt();
        String ski = sc.nextLine();

        if (ipk >= 2.76 && ipk <= 3.00) System.out.println("Memuaskan");
        else if (ipk >= 3.01 && ipk <= 3.50) System.out.println("Sangat Memuaskan");
        else if (ipk >= 3.51) {
            if (semester == 6 && eprt >= 450 && ski.equalsIgnoreCase("Ada")) {
                System.out.println("Cumlaude");
            } else if (semester == 7) {
                System.out.println("Sangat Memuaskan");
            }
        }
    }
}


// utama
// 2.76 - 3.00 = memuaskan
// 3.01 - 3.50 = sangat memuaskan
// >= 3.51 = cumlaude

// kedua
// EPRT 450+ & Ket Industri / 6 semester = cumlaude