package Semester3.Topik2.Poins.WarungSederhana;

public class Daging {
    private int total;

    public Daging() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHarga() {
        int harga = 5000;
        return harga * getTotal();
    }
}