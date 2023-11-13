package pbo.abs;

public class Trouser extends Pakaian implements Penjualan {
    public String bahan;

    public Trouser() {
        super.stok = 100;
    }

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
        // 30000 : 3000 = 30 qty
        return hargaTotal / super.harga;
    }
}
