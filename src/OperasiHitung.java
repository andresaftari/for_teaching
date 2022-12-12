import java.util.Scanner;

public class OperasiHitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilanganA = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int bilanganB = scanner.nextInt();

        switch (operator) {
            case '+':
                int jumlah = bilanganA + bilanganB;
                System.out.println(jumlah);
                break;

            case '-':
                int kurang = bilanganA - bilanganB;
                System.out.println(kurang);
                break;

            case '*':
                int kali = bilanganA * bilanganB;
                System.out.println(kali);
                break;

            case '/':
                float bagi = (float) bilanganA / bilanganB;
                System.out.println(bagi);
                break;
        }
    }
}