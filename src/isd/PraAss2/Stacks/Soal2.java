package isd.PraAss2.Stacks;

import java.util.Stack;

public class Soal2 {
    // Stack (LIFO) => siapa yang terakhir, siapa yang pertama keluar
    
    // pop() => ngapus di TOP
    // push() => nambah di TOP
    // peek() => liat TOP
    // TOP AJA

    private static final Stack<String> forwardStack = new Stack<>();
    private static final Stack<String> backStack = new Stack<>();

    public static void main(String[] args) {
        tambahTab("https://www.google.com/search?q=comparable+java+integer");
        tambahTab("https://www.javatpoint.com/java-integer-compareto-method");
        tambahTab("https://www.javatpoint.com/java-integer-compareunsigned-method");

        backHistory();
        forwardHistory();
    }

    private static void tambahTab(String link) {
        backStack.push(link);
        forwardStack.clear();

        System.out.println("Website " + link + " dibuka");
    }

    private static void backHistory() {
        if (backStack.isEmpty()) {
            System.out.println("Tidak bisa back lagi");
        } else {
            String link = backStack.pop();
            forwardStack.push(link);

            System.out.println("Mundur ke alamat " + link);
        }
    }

    private static void forwardHistory() {
        if (forwardStack.isEmpty()) {
            System.out.println("Tidak bisa back lagi");
        } else {
            String link = forwardStack.pop();
            backStack.push(link);

            System.out.println("Kembali lagi ke alamat " + link);
        }
    }
}
