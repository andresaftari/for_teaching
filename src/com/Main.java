package com;

public class Main {
    public static void main(String[] args) {
        Barang barang1 = new Barang("BRG-001", "Tas Gucci");
        barang1.setHarga(1200);
        Barang barang2 = new Barang("BRG-002", "Printer");
        barang2.setHarga(200);
        Barang barang3 = new Barang("BRG-003", "Koper", 150);
        Barang barang4 = new Barang("BRG-004", "Helm", 20);

        double total = barang1.getHarga() + barang3.getHarga() + barang4.getHarga();
        System.out.println("Total harga dari " + barang1.getIdProduk() + ", "
                + barang3.getIdProduk() + ", "
                + barang4.getIdProduk() + " = " + total);
    }
}
