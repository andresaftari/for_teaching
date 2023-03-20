package ListOfLists.DLManual;

import ListOfLists.DoublyLinked.Song;

public class Main {
    public static void main(String[] args) {
        DList list = new DList();

        list.addList(new Song("aaa"));
        list.addList(new Song("bee"));
        list.addList(new Song("beeccc"));

        list.removeMid("bee");

        list.display();
    }
}