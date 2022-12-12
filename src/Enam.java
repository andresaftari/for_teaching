import java.util.Scanner;

public class Enam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilanganBulat = scanner.nextInt();

        if (bilanganBulat % 6 == 0) {
            System.out.println("Kelipatan enam");
        } else {
            System.out.println("Bukan kelipatan enam");
        }
    }
}
