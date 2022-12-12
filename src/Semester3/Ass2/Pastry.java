package Semester3.Ass2;/*
 * Merupakan SubClass yang meng-extends abstract class Product
 */

public class Pastry extends Product {
    /*
     * Diturunkan dari konstruktor SuperClass-nya, yaitu abstract class Product
     */
    public Pastry(int uid, String nama, String type, String isAvailable, int qty, int harga) {
        super(uid, nama, type, isAvailable, qty, harga);
        this.uid = uid;
        this.type = type;
        this.isAvailable = isAvailable;
        this.qty = qty;
        this.nama = nama;
        this.harga = harga;
    }

    /*
     * Diturunkan dari method SuperClass-nya, sehingga terbentuklah Overriding Method untuk mengurangi jumlah Produk
     */
    @Override
    protected void kurangQty(int jumlahBeli) {
        if (this.qty >= jumlahBeli) {
            this.qty -= jumlahBeli;
            System.out.println("Berhasil membeli " + jumlahBeli + " pastry!");
        } else if (this.qty == 0) {
            System.out.println("Stok sisa habis!");
        }
    }

    /*
     * Diturunkan dari abstract method SuperClass-nya, sehingga terbentuklah Overriding Method untuk menampilkan data
     */
    @Override
    protected void displayInfo() {
        System.out.println(
                "\nUID : " + this.uid +
                        "\nJenis produk : " + this.type +
                        "\nNama produk : " + this.nama +
                        "\nStatus ketersediaan : " + this.isAvailable +
                        "\nHarga : " + this.harga +
                        "\nStok : " + this.qty
        );
    }
}