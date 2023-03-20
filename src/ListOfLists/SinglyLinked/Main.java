package ListOfLists.SinglyLinked;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomList list = new CustomList();

        list.insertMiddle(15);
        list.insertMiddle(12);
        list.insertMiddle(20);
        list.insertMiddle(17);
        list.insertMiddle(14);

        list.traverse();
        // SinglyList list = new SinglyList();

//         list.insertBack(new Student("1234", "ABC"));
//         list.insertFront(new Student("321", "CAD"));
//         list.insertFront(new Student("432", "HAAA"));

// //        list.removeFront();
//         list.traverse();

    }
}

class CustomList {
    private CustomNode head;
    private CustomNode tail;

    public CustomList() {
        head = tail = null;
    }

    public void insertMiddle(Integer integer) {
        int temp;
        CustomNode current = head;
        CustomNode berikutnya = null;

        CustomNode node = new CustomNode(integer);

        if (head == null && tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }


        while (current != null) {
            berikutnya = current.next;

            while (berikutnya != null) {
                if (current.data > berikutnya.data) {
                    temp = current.data;
                    current.data = berikutnya.data;
                    berikutnya.data = temp;
                }
                berikutnya = berikutnya.next;
            }
            current = current.next;
        }

    }

    public void traverse() {
        CustomNode node = head;

        if (head == null && tail == null) {
            System.out.println("List is empty");
            return;
        }

        while (node != null) {
            System.out.println(node);
            node = node.next;
        }
    }
}

class CustomNode {
    Integer data;
    CustomNode next;

    public CustomNode(Integer data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
