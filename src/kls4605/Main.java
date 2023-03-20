package kls4605;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Lagu> list = new LinkedList<>();

        // nambah
        list.add(new Lagu("Itulah")); // 0
        list.addFirst(new Lagu("Iniiii")); // 1
        list.addLast(new Lagu("Inilah")); // 2
        list.add(1, new Lagu("Ini"));

        // hapus
        list.removeLast(); // ngapus akhir
        
        ListIterator<Lagu> iterator = list.listIterator();
        System.out.println("input yang mo dihapus: ");
        String judul = sc.next();
        
        while (iterator.hasNext()) {
            Lagu current = iterator.next();
            if (judul.equals(current.getTitle())) {
                iterator.remove();
            }
        }

        ListIterator<Lagu> iterator2 = list.listIterator();
        // nampilin dari depan1
        while (iterator2.hasNext()) {
            Lagu current = iterator2.next();
            System.out.println(current);
        }
    }
}
