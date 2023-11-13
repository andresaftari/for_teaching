package RespoIMA.whileloop;

import java.util.Scanner;

public class InReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 123
        int sisa;
        int reversed = 0;

        while (n > 0) {
            sisa = n % 10;
//            System.out.println("sisa: " + sisa);
            reversed = reversed * 10 + sisa;
//            System.out.println("reversed: " + reversed);
            n /= 10;
        }

        System.out.println(reversed);
    }
}
