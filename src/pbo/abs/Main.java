package pbo.abs;

public class Main {
    public static void main(String[] args) {
        Trouser t = new Trouser();
        t.bahan = "Celana Chino";
        t.harga = 3000;
        // Let's say total terjual Rp30k
        System.out.println("Total penjualan " + t.bahan + ": " + t.totalPenjualan(30000) + " qty");
        t.stokTersedia(0);
        System.out.println("Stok " + t.bahan + ": " + t.stok());

        Dress d = new Dress();
        d.harga = 5000;
        d.model = "Dress Wedding";
        // Let's say total terjual Rp50k
        System.out.println("Total penjualan " + d.model + ": " + d.totalPenjualan(50000) + " qty");
        d.stokTersedia(5000);
        System.out.println("Stok " + d.model + ": " + d.stok());
    }
}
