package BelajarPBO.Contoh;

import java.util.ArrayList;

public class Master {
    public ArrayList<Item> listProdukVending = new ArrayList<>();

    public void tambahItem(Item item) {
        listProdukVending.add(item);
    }

    public void editItem(String nama, Item editedItem) {
        for (int i = 0; i < listProdukVending.size(); i++) {
            if (listProdukVending.get(i).nama.equals(nama)) {
                listProdukVending.set(i, editedItem);
            } else {
                System.out.println("Barangnya gaada");
            }
        }
    }

    public void hapusItem(String nama) {
        for (int i = 0; i < listProdukVending.size(); i++) {
            listProdukVending.removeIf(item -> item.nama.equals(nama));

            if (listProdukVending.isEmpty()) {
                System.out.println("Barangnya gaada");
            }
        }
    }

    public void displayItem() {
        for (Item item : listProdukVending) System.out.println(item);
    }
}
