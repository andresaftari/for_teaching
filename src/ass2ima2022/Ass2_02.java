package ass2ima2022;

import java.util.Scanner;

public class Ass2_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine() + " ";

        String textBaru = text.replaceAll("[AIUEOaiueo]" + "[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz] ", " ");
        System.out.println(textBaru);
    }
}
