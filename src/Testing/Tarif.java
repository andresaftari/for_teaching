package Testing;

import java.util.Scanner;

public class Tarif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tarif3km1 = 4000;
        int tarif4km2 = 3000;
        int tarif5km3 = 2000;
        int lebihnya = 1750;

        String namaPenumpang = scanner.nextLine();
        int jarakTempuh = scanner.nextInt();

        System.out.println("Hello, " + namaPenumpang + "\nini tarif anda: ");

        int price = 0;

        if (jarakTempuh < 3) System.out.println(jarakTempuh * tarif3km1);
        if (jarakTempuh >= 3) {
            int firsttrip = jarakTempuh - 3;
            System.out.println("I'm here");

            price = (jarakTempuh - firsttrip) * tarif3km1;

            if (firsttrip >= 4 || jarakTempuh >= 4) {
                int secondtrip = firsttrip - 4;
                System.out.println("I'm here");
                price = price + (firsttrip - secondtrip) * tarif4km2;

                if (secondtrip >= 5 || jarakTempuh >= 5) {
                    int thirdtrip = secondtrip - 5;
                    System.out.println("I'm here");

                    if (thirdtrip <= 0) price = price + secondtrip * tarif5km3;
                    else price = price + (secondtrip - thirdtrip) * tarif5km3;

                    if (thirdtrip >= 0) {
                        System.out.println("I'm here");
                        price = price + (thirdtrip) * lebihnya;
                    }
                }
            }
        }
        System.out.println(price);
    }
}