package com.company.latian;

import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input x1 : ");
        int x1 = scanner.nextInt();
        System.out.print("Input x2 : ");
        int x2 = scanner.nextInt();
        System.out.print("Input y1 : ");
        int y1 = scanner.nextInt();
        System.out.print("Input y2 : ");
        int y2 = scanner.nextInt();

        int x = x1 - x2;
        int y = y1 - y2;

        System.out.println(Math.abs(x) + Math.abs(y));
    }
}