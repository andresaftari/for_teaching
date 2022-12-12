package Bebas.LatihanTLX;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class TukarArr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrStr = new ArrayList<>();

        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            arrStr.add(br.readLine());
        }

        if (size % 2 == 0) {
            for (int i = 0; i < arrStr.size(); i++) {
                for (int j = i; j < arrStr.size(); j += 2) {
                    Collections.swap(arrStr, i, j);
                }
            }

            Collections.reverse(arrStr);
            arrStr.forEach(System.out::println);
        } else {
            ArrayList<String> listSementara = new ArrayList<>();

            for (int i = 0; i < arrStr.size() - 1; i++) {
                for (int j = i; j < arrStr.size() - 1; j += 2) {
                    Collections.swap(arrStr, i, j);
                }
                listSementara.add(arrStr.get(i));
            }

            Collections.reverse(listSementara);
            for (int i = 0; i < arrStr.size() - 1; i++) {
                System.out.println(listSementara.get(i));
            }
            System.out.println((arrStr.get(size - 1)));
        }
    }
}
