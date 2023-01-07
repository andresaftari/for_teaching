import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Soal2Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // 1. modus | 2. modus terbesar (max)
        int maxVal = 0, mode = 0, input;

        do {
            input = sc.nextInt();
            numList.add(input);
        } while (input != -1);

        Collections.sort(numList);
        Collections.reverse(numList);

        for (int a : numList) {
            int count = 0;
            for (int b : numList) if (b == a) count++;

            if (count > mode) {
                mode = count;
                maxVal = a;
            }
        }
        System.out.println(maxVal);
    }
}
