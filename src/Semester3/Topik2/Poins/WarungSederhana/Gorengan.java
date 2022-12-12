package Semester3.Topik2.Poins.WarungSederhana;

public class Gorengan {
    private int total;

    public Gorengan() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHarga() {
        int harga = 1000;
        return harga * getTotal();
    }
}