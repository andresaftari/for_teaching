package ListOfLists;

import java.util.*;

public class Soal2 {
    // Queue -> FIFO (FIRST IN, FIRST OUT)
    // ENQUEUE (ADD), DEQUEUE (POLL/REMOVE), PEEK (LIAT FRONT)
    // Queue -> FRONT (HEAD), BACK (TAIL)

    // Stack -> LIFO (LAST IN, FIRST OUT)
    // PUSH (ADD), POP (REMOVE), PEEK (LIAT TOP)
    // Stack -> TOP

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Menambah data
        queue.add("Ngoding ISD");
        queue.add("Ngerjain Kerjaan");
        queue.add("Ngepush Rank Apex");

        // Menampilkan data
        Iterator<String> iterator = queue.iterator();

        if (queue.isEmpty()) System.out.println("Queue kosong");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Menghapus data
        System.out.println("Pekerjaan " + queue.poll() + " selesai dilakukan\n");
    }
}
