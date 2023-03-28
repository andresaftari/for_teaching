package ListOfLists;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        StringBuilder result = new StringBuilder();
        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (Character.isLetterOrDigit(symbol)) {
                result.append(symbol);
            } else if (symbol == '(') {
                stack.push(symbol);
            } else if (symbol == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && setPriority(symbol) <= setPriority(stack.peek())) {
                    result.append(stack.peek());
                    stack.pop();
                }
                stack.push(symbol);
            }
        }

        while (!stack.isEmpty()) {
           if (stack.peek() == '(') {
               System.out.println("Invalid");
               return;
           }
           result.append(stack.peek());
           stack.pop();
        }

        System.out.println(result);
    }

    private static int setPriority(char symbol) {
        switch (symbol) {
            case '+':
            case '-':
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
