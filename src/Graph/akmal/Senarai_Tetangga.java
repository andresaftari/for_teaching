package Graph.akmal;

import java.util.HashMap;
import java.util.LinkedList;

public class Senarai_Tetangga {//Hashmap<Key, Value> 'isi tipe datanya' --> untuk key dan value
    static HashMap<String, LinkedList<String>> adjacList;

    //fungsi untuk menambah verteks
    static void tambah_Verteks(String verteksnya) {
        adjacList.put(verteksnya, new LinkedList<>());
    }

    //fungsi untuk menambah edges
    static void tambah_Edges(String verteksnya, String ke) {
        adjacList.get(verteksnya).add(ke);
    }

    static void cetak_Graph() {
        for (String verteksnya : adjacList.keySet()) {
            System.out.print(verteksnya + ": ");

            for (String tujuannya : adjacList.get(verteksnya)) {
                System.out.print("➞ " + tujuannya + " ");
            }

            //line baru setelah 'edges'
            System.out.println();
        }
    }

    //driver method
    public static void main(String[] args) {
        adjacList = new HashMap<>();
        tambah_Verteks("A");
        tambah_Verteks("B");
        tambah_Verteks("C");
        tambah_Verteks("D");
        tambah_Verteks("E");
        tambah_Verteks("F");
        tambah_Verteks("G");
        tambah_Verteks("H");
        tambah_Verteks("I");

        tambah_Edges("A", "B");
        tambah_Edges("A", "D");
        tambah_Edges("A", "E");

        tambah_Edges("B", "E");

        tambah_Edges("C", "B");

        tambah_Edges("D", "G");

        tambah_Edges("E", "F");
        tambah_Edges("E", "H");

        tambah_Edges("F", "C");
        tambah_Edges("F", "H");

        tambah_Edges("G", "H");

        tambah_Edges("H", "I");
        tambah_Edges("I", "F");

        //memanggil fungsi cetak graph
        cetak_Graph();
    }
}

/*
//Hashmap<Key, Value> 'isi tipe datanya' --> untuk key dan value
        LinkedHashMap<Character, Character> hashMap = new LinkedHashMap<>();

        // memasukkan nilainya
        hashMap.put('A','B');
        hashMap.put('A','D');
        hashMap.put('A','E');

        hashMap.put('B','E');

        hashMap.put('C','B');

        hashMap.put('D','G');

        hashMap.put('E','F');
        hashMap.put('E','H');

        hashMap.put('F','C');
        hashMap.put('F','H');

        hashMap.put('G','H');

        hashMap.put('H','I');

        hashMap.put('I','F');

        for (Map.Entry<Character, Character> mapElement : hashMap.entrySet()) {

            Character key = mapElement.getKey();

            // Finding the value
            Character value = mapElement.getValue();

            // print the key : value pair
            System.out.println(key + " : " + value);
        }
        */