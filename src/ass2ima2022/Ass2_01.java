package ass2ima2022;

import java.util.Scanner;

public class Ass2_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String state1 = "", state2 = "";
        int n = sc.nextInt();
        int[] arrSaklar = new int[n];

        for (int i = 0; i < n; i++) {
            arrSaklar[i] = sc.nextInt();
        }

        for (int i = 0; i < arrSaklar.length; i++) {
            switch (arrSaklar[i] % 4) {
                case 0:
                    state1 = "MATI";
                    state2 = "MATI";
                    break;
                case 1: 
                    state1 = "HIDUP";
                    state2 = "MATI";
                    break;
                case 2: 
                    state1 = "HIDUP";
                    state2 = "HIDUP";
                    break;
                case 3: 
                    state1 = "MATI";
                    state2 = "HIDUP";
                    break;
            }

            System.out.println(state1 + " " + state2);
        }
    }
}
