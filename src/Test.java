import java.util.Scanner;

public class Test {
    public Scanner sc = new Scanner(System.in);

    private void inputTest() {
        int number = sc.nextInt();
        System.out.println(number);
    }

    private void main() {
        int pil;

        do {
            System.out.println("1. Input Driver");
            System.out.println("2. Input Customer");
            System.out.println("3. Display");
            System.out.println("4. Top-up");
            System.out.println("5. Antar");
            System.out.println("6. Exit");

            System.out.println("Masukan pilihan : ");
            pil = sc.nextInt();

            switch (pil) {
                case 1:
                    inputTest();
                    break;

                case 2:
                    System.out.println("2");
                    break;

                case 3:
                    System.out.println("3");
                    break;

                case 4:
                    System.out.println("4");
                    break;

                case 5:
                    System.out.println("5");
                    break;

                case 6:
                    System.out.println("ada telah keluar :) ");
                    break;
            }
        } while (pil != 6);
    }

    public static void main(String[] args) {
        new Test().main();
    }
}
