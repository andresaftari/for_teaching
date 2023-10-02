package HTree;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeaptreeV2 {
    private static PriorityQueue<Kerjaan> tree = new PriorityQueue<>(1, new Kerjaan());

    public static void main(String[] args) {
        insert(5, "ISD"); // 5
        insert(8, "UKM"); // 8
        insert(3, "SBD"); // 3

        done();
        done();
    }

    private static void insert(int tanggal, String namaTugas) {
        tree.add(new Kerjaan(tanggal, namaTugas));
        if (!tree.isEmpty()) System.out.println("Task terdekat yang harus diselesaikan: " + tree.peek().namaTugas);
    }

    private static void done() {
        if (tree.isEmpty()) System.out.println("To do list kosong!");
        else {
            System.out.print(tree.poll().namaTugas + " selesai dilaksanakan");
            if (!tree.isEmpty()) System.out.print(", berikutnya: " + tree.peek().namaTugas);
        }
    }
}

class Kerjaan implements Comparator<Kerjaan> {
    int tanggal;
    String namaTugas;

    public Kerjaan() {}

    public Kerjaan(int tanggal, String namaTugas) {
        this.tanggal = tanggal;
        this.namaTugas = namaTugas;
    }

    @Override
    public int compare(Kerjaan k1, Kerjaan k2) {
        return Integer.compare(k1.tanggal, k2.tanggal);
    }
}

// auto constructor:
// vscode -> CTRL . atau COMMAND .
// intellij -> ALT INSERT

// kalo merah:
// vscode -> CTRL . atau COMMAND .
// intellij -> ALT ENTER