package TP11;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] point = new int[num];

        for (int i = 0; i < num; i++) {
            point[i] = input.nextInt();
        }

        int[] arr = Arrays.stream(point).sorted().toArray();

        for (int i = num - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
