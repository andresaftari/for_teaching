package ListOfLists.DoublyLinked;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static final LinkedList<Song> list = new LinkedList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opsi;

        do {
            System.out.println("1. Input Data\n2. Hapus Data\n3. Menampilkan Data\n4. Exit");
            opsi = sc.nextInt();

            switch (opsi) {
                case 1:
                    System.out.println("Judul lagu: ");
                    String judul = sc.next();

                    addData(new Song(judul));
                    break;

                case 2:
                    removeData();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Bye!");
                    System.exit(0);
            }
        } while (true);
    }

    private static void addData(Song song) {
        list.add(song);
    }

    private static void removeData() {
        int opsi2;
        do {
            System.out.println("1. Hapus lagu terakhir\n2. Hapus lagu dengan judul\n3. Exit");
            opsi2 = sc.nextInt();

            switch (opsi2) {
                case 1:
                    list.removeLast();
                    System.out.println("Hapus lagu terakhir berhasil");
                    break;
                case 2:
                    System.out.println("Judul lagu yang mau dihapus: ");
                    String title = sc.next();

                    ListIterator<Song> iterator = list.listIterator();
                    Song song = iterator.next();

                    while (iterator.hasNext()) {
                        if (song.getTitle().equals(title)) {
                            iterator.remove();
                        }
                    }
                    break;

                default:
                    return;
            }
        } while (true);
    }

    private static void display() {
        ListIterator<Song> iter1 = list.listIterator();

        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }

        while (iter1.hasPrevious()) {
            System.out.println(iter1.previous());
        }
    }
}
