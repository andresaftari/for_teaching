package HTree;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Htreeeeeeee {
    static PriorityQueue<Todooo> heap = new PriorityQueue<>(1, new HTComp());

    public static void main(String[] args) {
        insert(5, "ISD");
        insert(8, "UKM");
        insert(3, "SBD");
        done();
        done();
        done();
    }

    private static void insert(int tanggal, String name) {
        heap.add(new Todooo(tanggal, name));
        if (!heap.isEmpty()) System.out.println("Task terdekat yang harus diselesaikan: " + heap.peek().name);
    }

    private static void done() {
        if (heap.isEmpty()) System.out.println("Todo List kosong");
        else {
            System.out.print(heap.poll().name + " selesai dilaksanakan");
            if (!heap.isEmpty()) System.out.print(", berikutnya " + heap.peek().name);
        }
    }
}

class HTComp implements Comparator<Todooo> {
    @Override
    public int compare(Todooo t1, Todooo t2) {
        return Integer.compare(t1.tanggal, t2.tanggal);
    }
}

class Todooo {
    int tanggal;
    String name;

    public Todooo(int tanggal, String name) {
        this.tanggal = tanggal;
        this.name = name;
    }
}
