package SeparateChainingwithCollision;

import java.util.LinkedList;

public class SeparateVer01 {
    private static final String[] array = new String[13];
    private static final int arraysize = array.length;

    public static void main(String[] args) {
        String[] elementToAdd = {"3", "27", "41", "13", "6", "51", "9", "45", "21", "14", "8"};
        LinkedList<String> elementTemp = new LinkedList<>();

        for (String elementValue : elementToAdd) {
            // Lakukan looping terhadap seluruh value dalam Array element, dan tampung masing-masing value ke dalam
            // bentuk variable baru, yaitu elementValue
            int arrayIndex = (Integer.parseInt(elementValue) * 3) % arraysize;
            // Untuk menentukan index, gunakan syarat yang ada di soal, yaitu newElement (x3) modulus 13
            if (array[arrayIndex] != null) {
                elementTemp.add(array[arrayIndex]);
                // Apabila arrayIndex ke-n sesuai adalah index ke-n yang kosong pada Array utama, maka masukkan Array
                // utama dengan arrayIndex ke-n tersebut ke dalam LinkedList dengan method List.add()
            }

            elementTemp.add(elementValue);
            // Selanjutnya setelah keluar dari if, tambahkan elementValue ke dalam LinkedList dengan method list.add()
            String allElement = elementTemp.toString();
            // Karena dalam LinkedList kita ini adalah Integer, ubahlah ke String dengan method toString()

            allElement = allElement.replaceAll("\\[", "").replaceAll("]", "")
                    .replaceAll(",", "");
            // Apabila ada element yang Collision, tidak perlu diberikan tanda apa-apa

            array[arrayIndex] = allElement;
            // Lalu deskripsikan bahwa Array utama dengan index ke-arrayIndex berisi element collision
            elementTemp.clear();
            // Kalau sudah tidak ada collision, hapus LinkedList
        }

        int index = 0;
        for (String value : array) {
            System.out.println("Index " + index + " untuk value " + value);
            // Lakukan foreach loop untuk Looping ke Array utama dan mencetak semua element sesuai indexnya
            index++;
            // Berikan increment pada index agar sesuai dengan urutan elementnya
        }
        System.out.println();
    }
}
