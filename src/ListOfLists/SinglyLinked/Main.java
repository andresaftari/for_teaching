package ListOfLists.SinglyLinked;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyList list = new SinglyList();

        list.insertBack(new Student("1234", "ABC"));
        list.insertFront(new Student("321", "CAD"));
        list.insertFront(new Student("432", "HAAA"));

//        list.removeFront();
        list.traverse();

    }
}
