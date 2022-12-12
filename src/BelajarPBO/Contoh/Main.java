package BelajarPBO.Contoh;

public class Main {
    static Master master = new Master();

    public static void main(String[] args) {
        Item item = new Item(1, 5, "Barang", 500000);
        master.tambahItem(item);
    }
}
