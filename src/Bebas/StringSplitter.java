package Bebas;

public class StringSplitter {
    public static void main(String[] args) {
        String speech = "This code is sample";
        int count = 0;

        String[] result = speech.split("\\s");

        if (count < result.length) {
            for (int i = 0; i < 2; i++) {
                if (count == i) System.out.println(result[count]);
                else System.out.println((" " + result[count]));
                count++;
            }
        }
    }
}
