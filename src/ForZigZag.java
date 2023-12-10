import java.util.Scanner;

public class ForZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // i UNTUK PRINT KE BAWAH
        for (int i = 1; i <= n; i++) {
            // j UNTUK PRINT SPASINYA
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // \n artinya new line atau println()
            System.out.println(i);
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }

            // \n artinya new line atau println()
            System.out.println(i);
        }
    }
}

// LOOP ADA 2:
// LOOP YANG DIBATASI
// for (int)

// LOOP YANG TIDAK DIBATASI:
// while (boolean)
// do while (boolean)