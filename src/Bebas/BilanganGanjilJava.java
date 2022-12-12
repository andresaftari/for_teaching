package Bebas;

public class BilanganGanjilJava {
    public static void main(String[] args) {
        System.out.println("Bilangan ganjil 1 - 20: ");
        for (int bilangan = 1; bilangan <= 20; bilangan++) {
            if (bilangan % 2 == 1) System.out.println(bilangan);
        }
    }
}