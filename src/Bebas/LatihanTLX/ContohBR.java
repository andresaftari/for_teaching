package Bebas.LatihanTLX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohBR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // kalo mau input string
        String inputStr = br.readLine();

        // kalo mau input int
        int inputInt = Integer.parseInt(br.readLine());

        // kalo mau input double
        double inputDouble = Double.parseDouble(br.readLine());

        // kalo mau input float
        float inputFloat = Float.parseFloat(br.readLine());

        // kalo mau input boolean
        boolean inputBool = Boolean.parseBoolean(br.readLine());
    }
}
