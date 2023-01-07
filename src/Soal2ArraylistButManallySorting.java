import java.util.ArrayList;
import java.util.Scanner;

public class Soal2ArraylistButManallySorting {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // 1. modus | 2. modus terbesar (max)
        int maxVal = 0, mode = 0, input, temp;

        do {
            input = sc.nextInt();
            numList.add(input);
        } while (input != -1);

        for (int i = numList.size() - 1; i >= 0; i--) {
            for (int j = numList.size() - 1; j >= i + 1; j--) {
                if (numList.get(i) < numList.get(j)) {
                    temp = numList.get(i);
                    numList.set(i, numList.get(j));
                    numList.set(j, temp);
                }
            }
        }

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
