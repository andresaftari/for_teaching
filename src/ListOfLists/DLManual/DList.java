package ListOfLists.DLManual;

import ListOfLists.DoublyLinked.Song;

public class DList {
    private Nodes head;
    private Nodes tail;
    public int size = 0;

    public DList() {
        this.head = this.tail = null;
    }

    public void addList(Song song) {
        Nodes node = new Nodes(song);

        if (head == null && tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;

            tail = node;
            tail.next = null;
        }
    }

    public void removeMid(String judul) {
        if (head == null) {
            System.out.println("List kosong");
        }

//        Nodes temp = null;
        Nodes current = head;
        while (current != null) {
//           temp = current.next;
            if (current.next.data.getTitle().equals(judul)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                current = null;
            }
        }
    }

    public void display() {
        Nodes current = head;

        while (current.data != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

class Nodes {
    Nodes next, prev;
    Song data;

    public Nodes(Song song) {
        this.data = song;
    }

    @Override
    public String toString() {
        return data.getTitle();
    }
}
