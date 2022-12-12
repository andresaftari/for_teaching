package Bebas.LatihanTLX;

import java.util.Scanner;

public class TinggiBebek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[3];
        for (int i = 0; i < 3; i++) array[i] = scanner.nextInt();

        if (array[0] > array[1] && array[0] > array[2] && array[1] > array[2])
            System.out.println(array[2] + "\n" + array[0] + "\n" + array[1]);

        if (array[0] > array[1] && array[0] > array[2] && array[2] > array[1])
            System.out.println(array[1] + "\n" + array[0] + "\n" + array[2]);

        if (array[1] > array[0] && array[1] > array[2] && array[0] > array[2])
            System.out.println(array[2] + "\n" + array[1] + "\n" + array[0]);

        if (array[1] > array[0] && array[1] > array[2] && array[2] > array[0])
            System.out.println(array[0] + "\n" + array[1] + "\n" + array[2]);

        if (array[2] > array[0] && array[2] > array[1] && array[1] > array[0])
            System.out.println(array[0] + "\n" + array[2] + "\n" + array[1]);

        if (array[2] > array[0] && array[2] > array[1] && array[0] > array[1])
            System.out.println(array[1] + "\n" + array[2] + "\n" + array[0]);
    }
}
