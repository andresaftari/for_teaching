package Semester3.Topik1;

/*
* Prasidya Pramadresana Saftari
* 6706193049
* D3IF-43-01
 */
public class Bagian1 {
    public static void main(String[] args) {
        // Two parameters Constructor
        Barang brg001 = new Barang("BRG-001", "Tas Gucci");
        Barang brg002 = new Barang("BRG-002", "Printer Epson L355");
        brg001.setHarga(1200.0);
        brg002.setHarga(200.0);

        // Three parameters Constructors
        Barang brg003 = new Barang("BRG-003", "Koper", 150.0);
        Barang brg004 = new Barang("BRG-004", "Helm", 20.0);

        double total = brg001.getHarga() + brg004.getHarga() + brg003.getHarga();
        System.out.println("\nTotal harga BRG-001, BRG-003 dan BRG-004: $" + total);
    }
}

class Barang {
    private final String idProduk;
    private String nama;
    private double harga;

    // It's the three parameter constructor
    public Barang(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    // It's the two parameter constructor
    public Barang(String idProduk, String nama) {
        this.idProduk = idProduk;
        this.nama = nama;
    }

    public String getIdProduk() {
        return idProduk;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}