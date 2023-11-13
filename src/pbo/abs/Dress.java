package pbo.abs;

public class Dress extends Pakaian implements Penjualan {
    public String model;

    @Override
    public int stokTersedia(int stokDibeli) {
        return super.stok - stokDibeli;
    }

    @Override
    public int stok() {
        return super.stok();
    }

    @Override
    public int totalPenjualan(int hargaTotal) {
        return hargaTotal / super.harga;
    }
}
