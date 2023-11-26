package CobaIMA2022.latihanNestedFor;

public class Soal123 {
    public static void main(String[] args) {
        // i = 4
        for (int i = 1; i <= 5; i++) {
            String result = "";

            // j = 1, i = 4
            for (int j = 1; j <= i; j++) {
                if (j < i) System.out.print(" ");
                else System.out.print(j);
            }

            System.out.println();
        }
    }
}

// 1
// 22
// 333
// 4444
// BISA APAAAA VANIDISINI?