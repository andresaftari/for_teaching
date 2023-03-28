package isd.PraAss;

import java.util.LinkedList;

public class PraAses {
    private static final LinkedList<Buku> list = new LinkedList<>();
    public static void main(String[] args) {
        Buku buku1 = new Buku("Hai, Miiko!", "Eriko Ono", "M&c! publisher", 15);
        Buku buku2 = new Buku("Hai, Miiko!", "Eriko Ono", "M&c! publisher", 13);
        Buku buku3 = new Buku("Hai, Miiko!", "Eriko Ono", "M&c! publisher", 14);
        Buku buku4 = new Buku("Hai, Miiko!", "Eriko Ono", "M&c! publisher", 10);
        Buku buku5 = new Buku("Hai, Miiko!", "Eriko Ono", "M&c! publisher", 5);
        Buku buku6 = new Buku("Hai, Miiko!", "Eriko Ono", "M&c! publisher", 6);
        Buku buku7 = new Buku("Hai, Miiko!", "Eriko Ono", "M&c! publisher", 7);
        Buku buku8 = new Buku("Hai, Miiko!", "Eriko Ono", "M&c! publisher", 8);

        insert(buku1);
        insert(buku2);
        insert(buku3);
        insert(buku4);
        insert(buku5);
        insert(buku6);
        insert(buku7);
        insert(buku8);
    }

    private static void insert(Buku buku) {
        if (list.isEmpty()) {
            list.add(buku);
        } else {
            list.add(buku);

            Buku temporary;
            // for 1: untuk melihat jilid sekarang
            for (int i = 0; i < list.size(); i++) {
                // for 2: untuk melihat jilid berikutnya
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).jilid > list.get(j).jilid) {
                        temporary = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temporary);
                    }
                }
            }
        }
    }
}
