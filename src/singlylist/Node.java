package singlylist;

public class Node {
    int data;
    Node next; 

    public Node(int data) {
        this.data = data;
    }

    public void tampil() {
        System.out.println(data + " ");
    }
}