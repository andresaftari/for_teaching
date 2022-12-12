package Semester3.Ass2.crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    static ArrayList<String> arrOfName = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input;

        do {
            System.out.print(
                    "\nInput:" +
                            "\n1. Tambah" +
                            "\n2. Edit" +
                            "\n3. Display" +
                            "\n4. Delete" +
                            "\nPilihan : "
            );
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    String name = scanner.next();
                    addName(name);
                    break;

                case 2:
                    String editName = scanner.next();
                    editName(editName);
                    break;

                case 3:
                    displayName();
                    break;

                case 4:
                    String deleteName = scanner.next();
                    deleteName(deleteName);
                    break;
            }
        } while (input < 5);
    }

    public static void addName(String name) {
        arrOfName.add(name);
    }

    public static void editName(String name) {
        String editName = scanner.next();

        for (int i = 0; i < arrOfName.size(); i++) {
            if (name.equalsIgnoreCase(arrOfName.get(i))) {
                arrOfName.set(i, editName);
            }
        }
    }

    public static void displayName() {
        for (String name : arrOfName) {
            System.out.println(name);
        }
    }

    public static void deleteName(String name) {
        for (int i = 0; i < arrOfName.size(); i++) {
            if (arrOfName.get(i).equalsIgnoreCase(name)) {
                arrOfName.remove(i);
            }
        }
    }
}
