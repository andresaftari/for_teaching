package ListOfLists;

import java.util.Scanner;
import java.util.Stack;

public class Haha {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            if (Character.isLetterOrDigit(character)) {
                result.append(character);
            } else if (character == '(') {
                stack.push(character);
            } else if (character == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && setPrioritas(character) <= setPrioritas(stack.peek())) {
                    result.append(stack.peek());
                    stack.pop();
                }
                stack.push(character);
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

    private static int setPrioritas(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;

            case '/':
            case '*':
                return 2;

            case '^':
                return 3;
        }

        return -1;
    }
}