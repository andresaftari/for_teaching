package Semester3.Topik2.Poins.WarungSederhana;

public class Nasi {
    private int total;

    public Nasi() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHarga() {
        int harga = 3000;
        return harga * getTotal();
    }
}