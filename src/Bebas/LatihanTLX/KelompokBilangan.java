package Bebas.LatihanTLX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KelompokBilangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count;
        int qty = Integer.parseInt(br.readLine());

        int[] array = new int[qty];

        for (int i = 0; i < qty; i++) array[i] = Integer.parseInt(br.readLine());
        for (int i = 0; i < array.length - 1; i++)
            if (!(array[i] < 0)) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < 0) {
                        count = array[i];
                        array[i] = array[j];
                        array[j] = count;
                        break;
                    } else if (array[j] == 0) {
                        count = array[i];
                        array[i] = array[j];
                        array[j] = count;
                    }
                }
            }

        for (int data : array) System.out.println(data);
    }
}