package Semester3.Topik2.Poins.HitungSuhu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// For 20 points
public class HitungSuhu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan suhu dalam Celcius\nInputan : ");
        int inputTemp = Integer.parseInt(br.readLine());

        do {
            System.out.println("\nPilihan konversi");
            System.out.println("a. Fahrenheit\nb. Reamur\nc. Kelvin");

            System.out.print("\nInputan : ");
            String option = br.readLine();

            switch (option) {
                case "a":
                    calculateFahrenheit(inputTemp);
                    break;

                case "b":
                    calculateReamur(inputTemp);
                    break;

                case "c":
                    calculateKelvin(inputTemp);
                    break;

                default:
                    System.out.println("Inputan pilihan yang anda masukkan tidak dikenal");
                    System.exit(0);
            }
        } while (true);
    }

    private static void calculateFahrenheit(int tempInCelcius) {
        int fahrenheit = (9 * tempInCelcius) / 5 + 32;
        System.out.println(tempInCelcius + " derajat Celcius adalah sama dengan " + fahrenheit + " derajat Fahrenheit");
    }

    private static void calculateReamur(int tempInCelcius) {
        int reamur = (4 * tempInCelcius) / 5;
        System.out.println(tempInCelcius + " derajat Celcius adalah sama dengan " + reamur + " derajat Reamur");
    }

    private static void calculateKelvin(int tempInCelcius) {
        int kelvin = tempInCelcius + 273;
        System.out.println(tempInCelcius + " derajat Celcius adalah sama dengan " + kelvin + " Kelvin");
    }
}