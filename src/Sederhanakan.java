import java.util.Scanner;

public class Sederhanakan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pembilang = scanner.nextInt();
        int penyebut = scanner.nextInt();

        int n = pecahan(pembilang, penyebut);
        if (n > 1) {
            int pemb = pembilang / n;
            int peny = penyebut / n;

            System.out.println(pemb + " " +  peny);
        } else {
            System.out.println("Tidak");
        }
    }

    static int pecahan(int pemb, int peny) {
        int s = 2, t = 2;
        int a = pemb, b = peny;

        while (a != b) {
            if (a > b) {
                while ((pemb % s) != 0) {
                    s++;
                }
                a = pemb / s;
                s++;
            } else {
                while ((peny % t) != 0) {
                    t++;
                }
                b = peny / t;
                t++;
            }
        }

        return a;
    }
}