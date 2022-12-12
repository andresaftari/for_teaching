package Semester3.Ass2;/*
 * Merupakan SuperClass yang akan diturunkan ke 3 SubClass, yaitu class Roti, Pastry dan Donut
 * Menyimpan data umum Product dan diextend untuk menyimpan data khusus anak kelasnya
 */

public abstract class Product {
    /*
     * Menggunakan protected variable agar dapat digunakan oleh SubClass (kelas turunan yang meng-extend)
     */
    protected int uid, qty, harga;
    protected String type, isAvailable, nama;

    /*
     * Merupakan konstruktor SuperClass yang akan diturunkan
     */
    public Product(int uid, String nama, String type, String isAvailable, int qty, int harga) {
        this.uid = uid;
        this.type = type;
        this.isAvailable = isAvailable;
        this.qty = qty;
        this.nama = nama;
        this.harga = harga;
    }

    /*
     * Merupakan abstract method yang akan diturunkan untuk mengurangi stok
     */
    protected abstract void kurangQty(int jumlahBeli);

    /*
     * Merupakan abstract method yang akan diturunkan untuk menampilkan data
     */
    protected abstract void displayInfo();
}