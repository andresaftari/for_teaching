package com.company.latian;

import java.util.Scanner;

public class MenghitungPenghasilan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long pajak;
        long besarPajak;
        long penghasilanBersih;
        
        long penghasilanKotor = scanner.nextInt();

        if (penghasilanKotor >= 0 && penghasilanKotor <= 50) pajak = 5;
        else if (penghasilanKotor >= 51 && penghasilanKotor <= 250) pajak = 15;
        else if (penghasilanKotor >= 251 && penghasilanKotor <= 500) pajak = 25;
        else pajak = 30;

        System.out.println("Penghasilan Kotor = " + penghasilanKotor + " Juta Rupiah");

        penghasilanKotor *= 1000000;
        besarPajak = (penghasilanKotor * pajak) / 100;
        penghasilanBersih = penghasilanKotor - besarPajak;

        System.out.println("Pajak " + pajak + "% = Rp." + besarPajak);
        System.out.println("Penghasilan Bersih = Rp." + penghasilanBersih);
    }
}