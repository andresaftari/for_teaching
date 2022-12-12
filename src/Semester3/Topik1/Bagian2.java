package Semester3.Topik1;

public class Bagian2 {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 300000.0);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000.0);

        System.out.println(buku1.getJudul() + " | " + buku1.getPengarang() + " | " + buku1.getHarga());
        System.out.println(buku2.getJudul() + " | " + buku2.getPengarang() + " | " + buku2.getHarga());
    }
}

// This class is an Object Class used to store data as data class, this Object class also known as
// POJO (Plain Old Java Object)
class Buku {
    String judul, pengarang;
    double harga;

    // It's the three parameter constructor
    public Buku(String judul, String pengarang, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    // These are called "getter and setter", which will be used as the "access code" for the other class
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
