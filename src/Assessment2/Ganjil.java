package Assessment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ganjil {
    public static void main(String[] args) {
        PhoneBook.simpanTelp("+6281310931175", "Rita");
        PhoneBook.referensiNegara("+6281310931175");

        PhoneBook.simpanTelp("+6281510451171", "Nina");
        PhoneBook.referensiNegara("+6281510451171");

        PhoneBook.simpanTelp("+62857310931175", "Meta");
        PhoneBook.referensiNegara("+62857310931175");

        PhoneBook.simpanTelp("+44773429438455", "Diki");
        PhoneBook.referensiNegara("+44773429438455");

        PhoneBook.simpanTelp("+6051310931175", "Datuk Sri");
        PhoneBook.referensiNegara("+6051310931175");

        PhoneBook.simpanTelp("+6051310931175", "Siti Nurhaliza");
        PhoneBook.referensiNegara("+6051310931175");

        PhoneBook.printAll();
    }
}

class PhoneBook {
    private static final Map<String, String> mapper = new HashMap<>();
    private static final ArrayList<User> array = new ArrayList<>();

    static void simpanTelp(String nomor, String nama) {
        User user = new User(nama, nomor);
        array.add(user);
    }

    static void referensiNegara(String number) {
        String code = number.substring(0, 3);
        switch (code) {
            case "+62":
                mapper.put(code, "Indonesia");
                System.out.println(code + " kode dari " + mapper.get(code));
                break;
            case "+44":
                mapper.put(code, "UK");
                System.out.println(code + " kode dari " + mapper.get(code));
                break;
            case "+60":
                mapper.put(code, "Malaysia");
                System.out.println(code + " kode dari " + mapper.get(code));
                break;
            default:
                System.out.println("Nomor kontak salah");
        }
    }

    static void printAll() {
        for (User user : array) {
            System.out.println(user);
        }
    }
}

class User {
    private static String name;
    private static String number;

    User(String name, String number) {
        User.name = name;
        User.number = number;
    }

    private static String getName() {
        return name;
    }

    private static String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "noTelp = " + getNumber() + ", nama = " + getName();
    }
}
