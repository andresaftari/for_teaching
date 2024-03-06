package singlylist;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    // Tambah di awal
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        // kasi tau program kalau setelah node sekarang
        // adalah node "head"

        // jadi apapun Node yang ditambah di awal adalah head
        head = node;
    }

    public void addLast(int data) {
        Node node, temp;

        node = new Node(data);
        node.next = null;

        if (isEmpty()) {
            head = tail = node;
            head.next = null;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = tail = node;
        }
    }

    public Node deleteFirst() {
        if (!isEmpty()) {
            Node temp = head;
            head = head.next;

            return temp;
        } else {
            return null;
        }
    }

    public Node deleteLast() {
        if (!isEmpty()) {
            Node temp, current;
            current = head;

            while (current.next.next != null) {
                current = current.next;
            }

            temp = current.next;
            current.next = null;

            return temp;
        } else {
            Node temp = head;
            head = tail = null;

            return temp;
        }
    }

    public void tampilkan() {
        Node current = head;

        if (current == null)
            System.out.println("kosong");
        else {
            while (current != null) {
                current.tampil();
                current = current.next;
            }

            System.out.println();
        }
    }
}