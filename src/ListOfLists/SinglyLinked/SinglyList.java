package ListOfLists.SinglyLinked;

public class SinglyList {
    private Node<Student> head;
    private Node<Student> tail;

    public SinglyList() {
        head = tail = null;
    }

    public void insertFront(Student data) {
        Node<Student> newNode = new Node<>(data);

        if (isEmpty()) {
            head = tail = new Node<>(data);
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertBack(Student data) {
        Node<Student> newNode = new Node<>(data);

        if (isEmpty()) {
            head = tail = new Node<>(data);
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeFront() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public Student removeBack() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        }

        Student temp = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            Node<Student> iterator = head;

            while (iterator.next != tail) {
                iterator = iterator.next;
            }

            tail = iterator;
            iterator.next = null;
        }

        return temp;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void traverse() {
        Node<Student> node = head;

        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        while (node != null) {
            System.out.println(node);
            node = node.next;
        }
    }
}

class Node<Student> {
    Student data;
    Node<Student> next;

    public Node(Student data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node " + data;
    }
}