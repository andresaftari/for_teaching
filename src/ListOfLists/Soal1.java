package ListOfLists;

import java.util.Stack;

public class Soal1 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String input = "a+b*(c^d-e)^(f+g*h)-i";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char karakter = input.charAt(i);

            if (Character.isLetterOrDigit(karakter)) {
                output.append(karakter);
            } else if (karakter == '(') {
                stack.push(karakter);
            } else if (karakter == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && prioritas(karakter) <= prioritas(stack.peek())) {
                    output.append(stack.peek());
                    stack.pop();
                }
                stack.push(karakter);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                System.out.println("Invalid");
                return;
            }
            output.append(stack.peek());
            stack.pop();
        }

        System.out.println(output);
    }

    private static int prioritas(char operator) {
        switch (operator) {
            case '-':
            case '+':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }

        return -1;
    }
}
