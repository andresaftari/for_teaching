package Semester3.Topik2.Poins.SelisihDuaWaktu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// For 30 points
public class SelisihDuaWaktu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat oneDayFormat = new SimpleDateFormat("HH:mm:ss"); // Fungsi untuk 24jam:menit:detik

        long difference;
        long s = 1000; // ms
        long m = 60 * s;
        long h = 60 * m;

        System.out.println("Waktu 1 : ");
        int hour1 = scanner.nextInt(); // scanner.nextInt();
        int minute1 = scanner.nextInt(); // scanner.nextInt();
        int second1 = scanner.nextInt(); // scanner.nextInt();

        System.out.println("\nWaktu 2 : ");
        int hour2 = scanner.nextInt(); // scanner.nextInt();
        int minute2 = scanner.nextInt(); // scanner.nextInt();
        int second2 = scanner.nextInt(); // scanner.nextInt();

        String time1 = hour1 + ":" + minute1 + ":" + second1; // Buat format waktu 1
        String time2 = hour2 + ":" + minute2 + ":" + second2; // Buat format waktu 2

        try {
            // Parsing to date format
            Date waktu1 = oneDayFormat.parse(time1);
            Date waktu2 = oneDayFormat.parse(time2);

            if (waktu2.getTime() > waktu1.getTime()) {
                difference = waktu2.getTime() - waktu1.getTime();
            }
            else {
                difference = waktu1.getTime() - waktu2.getTime();
            }

            System.out.print("Selisih antara " + time1 + " dan " + time2 + " adalah ");

            // Output
            System.out.printf("%02d", difference / h);
            System.out.printf(":%02d", (difference % h) / m);
            System.out.printf(":%02d", (difference % m) / s);

        } catch (ParseException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}