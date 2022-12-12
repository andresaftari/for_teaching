package CobaIMA2022;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, count = -1;
        double res, total = 0;

        do {
            input = sc.nextInt();
            total += input;
            ++count;
        } while (input != 0);

        res = total / count;
        System.out.println(res);
    }
}
