import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ContohArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();

        int[] arrayOfNum = new int[arrSize];

        for (int i = 0; i < arrayOfNum.length; i++) {
            int element = scanner.nextInt();
            arrayOfNum[i] = element;
        }

        for (int element : arrayOfNum) {
            System.out.print(element + " ");
        }

        System.out.println();

        for (int i = arrayOfNum.length - 1; i >= 0; i--) {
            System.out.print(arrayOfNum[i] + " ");
        }

        System.out.println();

        System.out.print("cari : ");
        int numberToFind = scanner.nextInt();
        for (int i = 0; i < arrayOfNum.length; i++) {
            if (arrayOfNum[i] == numberToFind) {
                System.out.println("angka " + numberToFind + " ditemukan");
                System.out.println("angka " + numberToFind + " ditemukan pada indeks ke " + i);
            } else {
                System.out.println("angka " + numberToFind + " tidak ditemukan");
            }
        }

        // Ascending (logical sorting - kalo mau pake ini yang Collections hapus, import Arrays dan Collections juga hapus)
        int tempMax;
        for (int i = 0; i < arrSize; i++) {
            for (int j = i + 1; j < arrSize; j++) {
                if (arrayOfNum[i] > arrayOfNum[i + 1]) {
                    tempMax = arrayOfNum[i];
                    arrayOfNum[i] = arrayOfNum[i + 1];
                    arrayOfNum[i + 1] = tempMax;
                }
            }
        }

        for (int nums: arrayOfNum) {
            System.out.print(nums + " ");
        }

        System.out.println();

        // Descending (logical sorting - kalo mau pake ini yang Collections hapus, import Arrays dan Collections juga hapus)
        int tempMin;
        for (int i = 0; i < arrSize; i++) {
            for (int j = i + 1; j < arrSize; j++) {
                if (arrayOfNum[i] < arrayOfNum[j]) {
                    tempMin = arrayOfNum[i];
                    arrayOfNum[i] = arrayOfNum[j];
                    arrayOfNum[j] = tempMin;
                }
            }
        }

        for (int nums: arrayOfNum) {
            System.out.print(nums + " ");
        }

        // Ascending (Collections sorting - kalo mau pake ini yang logical hapus)
//        Arrays.sort(arrayOfNum);
//
//        for (int element : arrayOfNum) {
//            System.out.print(element + " ");
//        }

        // Descending (Collections sorting - kalo mau pake ini yang logical hapus)
//        Arrays.sort(arrayOfNum, Collections.reverseOrder());
//
//        for (int element : arrayOfNum) {
//            System.out.print(element + " ");
//        }
    }
}