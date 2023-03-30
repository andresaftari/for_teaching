package isd;

import java.util.Scanner;

public class StackChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        String str = sc.next();

        for (int i = str.length() - 1; i >= 0; i--) {
            output.append(str.charAt(i));
        }
        System.out.println(output);
    }

//    private static void push(String input) {
//        parse.append(input);
//    }
//
//    private static char pop() {
//        StringBuilder output = new StringBuilder();
//
//        char result = parse.charAt(output.length() - 1);
//        output.append(parse.substring(0, output.length() - 2));
//
//        return result;
//    }
}
