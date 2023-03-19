package kelas4601;

// geeksforgeeks
// javatpoint
// petanikoding
// tlx.toki.id

// 083870992897

import java.util.ArrayList;

public class Main {
    private static ArrayList<Barang> listA = new ArrayList<>();
    private static ArrayList<Barang> listB = new ArrayList<>();
    private static ArrayList<Barang> listC = new ArrayList<>();

    public static void main(String[] args) {
        addData(new Barang("A001", "ATK", "Bruhhhhh", 2));
        addData(new Barang("A003", "ATK", "Bruhh", 2));
        addData(new Barang("A005", "ATK", "Haaah", 2));

        System.out.println("sebelum diedit");
        display();

        editData("A003", "ATK", "Ihhh", 3);
        System.out.println("ini udah diedit");
        display();

        deleteData("A005");
        System.out.println("ini udah diapus");
        display();
    }

    private static void addData(Barang barang) {
        listA.add(barang);
    }

    private static void editData(
        String kodeDicari,
        String jenisEdit,
        String namaEdit,
        int stokEdit
        ) {
        if (kodeDicari.startsWith("A")) {
            for (int i = 0; i < listA.size(); i++) {
                if (listA.get(i).kodeBarang.equals(kodeDicari)) {
                    listA.set(i, new Barang(listA.get(i).kodeBarang, jenisEdit, namaEdit, stokEdit));
                }
            }
        }
    }

    private static void deleteData(String kodeDicari) {
        if (kodeDicari.startsWith("A")) {
            for (int i = 0; i < listA.size(); i++) {
                if (listA.get(i).kodeBarang.equals(kodeDicari)) {
                    listA.remove(i);
                }
            }
        }
    }

    private static void display() {
        System.out.println("ATK: ");
        for (Barang atk : listA) {
            System.out.println(atk);
        }
    }
}
