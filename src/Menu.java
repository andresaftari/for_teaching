import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nilai = scanner.nextInt();

        if (nilai >= 0 && nilai < 50) {
            System.out.println("index nilai : C");
        } else if (nilai >= 50 && nilai < 80) {
            System.out.println("index nilai : B");
        } else if (nilai >= 80 && nilai <= 100) {
            System.out.println("index nilai : A");
        } else {
            System.out.println("Input nilai 0 - 100");
        }
    }
}
