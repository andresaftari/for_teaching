import java.util.Scanner;

public class ContohAja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                if (number == 1) {
                    System.out.println("ini satu");
                }
                break;

            case 2:
                int inputanLain = scanner.nextInt();
                if (inputanLain != 2 ) {
                    System.out.println(inputanLain);
                }
                break;
        }
    }
}
