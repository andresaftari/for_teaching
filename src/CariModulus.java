import java.util.Scanner;

public class CariModulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input angka
        long input = scanner.nextLong();

        if (input >= 10) {
            System.out.println((input / 1000) + " ribu");
            System.out.println((input % 1000 / 100) + " ratusan");
            System.out.println((input % 100 / 10) + " puluhan");
            System.out.println((input % 10) + " satuan");
        } else System.out.println(input + " satuan");
    }
}
