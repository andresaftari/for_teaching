package Bebas.LatihanTLX;

public class TukarBilangan {
    public static void main(String[] args) {
        int container;
        int num1 = 25;
        int num2 = 50;

        container = num1;
        num1 = num2;
        num2 = container;

        System.out.println("bilangan1: " + num1);
        System.out.println("bilangan2: " + num2);
    }
}
