public class ForZigZagMatrix {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n + 1; i++) {
            if (i % 2 == 0) System.out.print(" ");

            for (int j = 1; j <= n; j++) {
                if (j == n) System.out.print("*");
                else System.out.print("* ");
            }

            if (i < n + 1) System.out.println();
        }
    }
}