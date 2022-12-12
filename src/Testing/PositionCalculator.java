package Testing;

import java.util.Scanner;

public class PositionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();

        switch (position % 8) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("You are in " + (position % 8));
                break;
        }
    }
}
