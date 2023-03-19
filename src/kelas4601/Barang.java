package kelas4601;

public class Barang {
    // atribut
    String kodeBarang, jenisBarang, namaBarang;
    int stok;
    
    // konstruktor
    public Barang(String kodeBarang, String jenisBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    // toString()
    @Override
    public String toString() {
        return "Barang {kodeBarang = " + kodeBarang + ", jenisBarang = " + jenisBarang + ", namaBarang = " + namaBarang
                + ", stok = " + stok + "}";
    }
}
