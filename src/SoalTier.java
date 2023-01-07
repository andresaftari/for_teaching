import java.util.Scanner;

public class SoalTier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), tier1 = 0, tier2 = 0, tier3 = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int it : arr) {
            if (it >= 0 && it < 4) tier1++;
            if (it >= 5 && it < 9) tier2++;
            if (it == 10) tier3++;
        }

        System.out.println("\nTier 1:");
        for (int i = 0; i < tier1; i++) System.out.print("*");

        System.out.println("\nTier 2:");
        for (int i = 0; i < tier2; i++) System.out.print("*");

        System.out.println("\nTier 3:");
        for (int i = 0; i < tier3; i++) System.out.print("*");
    }
}
