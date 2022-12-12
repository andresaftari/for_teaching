package BelajarPBO.Contoh;

public class Item {
    int id, jumlah;
    String nama;
    double harga, hargaBentukKaleng; // tambah hargaBentukKaleng
    boolean adaBentukKaleng; // tambah adaBentukKaleng

    // Ini buat makanan
    public Item(int id, int jumlah, String nama, double harga) {
        this.id = id;
        this.jumlah = jumlah;
        this.nama = nama;
        this.harga = harga;
        this.adaBentukKaleng = false;
        this.hargaBentukKaleng = 0.0;
    }

    // Ini buat minuman
    public Item(int id, int jumlah, String nama, double harga, boolean adaBentukKaleng, double hargaBentukKaleng) {
        this.id = id;
        this.jumlah = jumlah;
        this.nama = nama;
        this.harga = harga;
        this.adaBentukKaleng = adaBentukKaleng;
        this.hargaBentukKaleng = hargaBentukKaleng;
    }
}