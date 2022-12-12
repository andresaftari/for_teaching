package Phone;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.simpanTelp("+6083870992897", "Andre");
        phoneBook.simpanTelp("+9083870992897", "Andre");
        phoneBook.referensiNegara();
        phoneBook.cetakNegara();
    }
}
