package RespoIMA.whileloop;

import java.util.Scanner;

public class Amoebaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minutes = 0;

        while (n > 30) {
            minutes += 15;
            n /= 2;
        }

        System.out.println(minutes);
    }
}
