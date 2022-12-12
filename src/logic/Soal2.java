package logic;

import java.util.*;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        
        int num = input.nextInt();

        do {
            arrList.add(num);
            num = input.nextInt();
        } while (num != -1);

        int modus = 0, count = 0;
        for (int i : arrList) {
            int temp = 0;

            for (int j : arrList) {
                if (i == j) temp++;

                if (temp > count) {
                    count = temp;
                    modus = i;
                } else if (temp == count) {
                    if (modus < i) modus = i;
                }
            }
        }
        System.out.println(modus);
    }
}
