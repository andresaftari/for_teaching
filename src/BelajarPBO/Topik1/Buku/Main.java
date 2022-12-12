package BelajarPBO.Topik1.Buku;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 300000);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000);

        System.out.println(buku1.toString());
        System.out.println(buku2.toString());
    }
}