package ListOfLists.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        String input = sc.next();

        for (int i = 0; i < input.length(); ++i) {
            char character = input.charAt(i);

            if (Character.isLetterOrDigit(character)) {
                // karakter atau digit adalah highest priority, setiap huruf/alfabet atau digit harus adalah OPERAND
                // yang harus ditampilkan sebelum OPERATOR
                result.append(character);
            } else if (character == '(') {
                // kalau ada buka kurung, langsung jadiin priority
                stack.push(character);
            } else if (character == ')') {
                // kalau ditemuin penutup kurung, semua yang di dalam kurung harus jadi priority
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            } else {
                // Kalau ternyata inputnya simbol aritmatika, buat priority sesuai dengan mathematic operators. Cara kerjanya,
                // setiap ditemukan simbol aritmatika yang levelnya lebih kecil, simbol itu DI-PUSH ke dalam stack, sedangkan
                // simbol yang lebih besar levelnya DI-POP
                while (!stack.isEmpty() && setPriority(character) <= setPriority(stack.peek())) {
                    result.append(stack.peek());
                    stack.pop();
                }
                stack.push(character);
            }
        }

        // Kalau semua syarat priority sudah dicek, tanda kurung buka ( harus dicek apakah ada penutupnya ) atau tidak, 
        // kalau tidak maka output adalah INVALID
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
