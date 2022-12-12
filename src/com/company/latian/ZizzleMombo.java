package com.company.latian;

import java.util.Scanner;

public class ZizzleMombo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zizzle = "Zizzle";
        String wombo = "Wombo";
        String yelpish = "Yelpish";

        System.out.print("Alvin is a ");
        String name = scanner.next();

        if (name.equals(zizzle)) System.out.println("Equals a " + wombo + " and " + yelpish);
        else if (name.equals(wombo)) System.out.println("Equals a " + yelpish);
        else System.out.println("Not a " + zizzle);
    }
}
