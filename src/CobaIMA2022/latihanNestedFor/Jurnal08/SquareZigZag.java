package CobaIMA2022.latihanNestedFor.Jurnal08;

public class SquareZigZag {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) System.out.print(" ");

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
