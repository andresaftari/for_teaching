package singlylist;

public class Main {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();

        link.addFirst(1);
        link.addFirst(2);
        link.addLast(3);
        link.addLast(4);
        link.tampilkan();
        link.deleteLast();
        link.tampilkan();
        link.deleteFirst();
        link.tampilkan();
        link.addLast(8);
        link.addFirst(11);
        link.tampilkan();
    }
}