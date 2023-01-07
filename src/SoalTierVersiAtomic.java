import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SoalTierVersiAtomic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        AtomicInteger tier1 = new AtomicInteger();
        AtomicInteger tier2 = new AtomicInteger();
        AtomicInteger tier3 = new AtomicInteger();

        Arrays.stream(arr).forEach(it -> {
            if (it >= 0 && it < 4) tier1.getAndIncrement();
            if (it >= 5 && it < 9) tier2.getAndIncrement();
            if (it == 10) tier3.getAndIncrement();
        });

        System.out.println("\nTier 1:");
        for (int i = 0; i < tier1.get(); i++) System.out.print("*");

        System.out.println("\nTier 2:");
        for (int i = 0; i < tier2.get(); i++) System.out.print("*");

        System.out.println("\nTier 3:");
        for (int i = 0; i < tier3.get(); i++) System.out.print("*");
    }
}
