package kontakwa;

import java.util.LinkedList;
import java.util.List;

public class Whatsapp {
    private static final List<Kontak> listContact = new LinkedList<>();

    public static void main(String[] args) {
        isiContact();

        listContact.forEach(it -> System.out.println(it.toString()));
    }

    private static void isiContact() {
        listContact.add(new Kontak("Yaumil", "Okeoke"));
        listContact.add(new Kontak("Rum", "Thanks"));
        listContact.add(new Kontak("Group WA A", "Ann: Yoa"));
    }
}

class Kontak {
    private String name, lastMessage;

    public Kontak(String name, String lastMessage) {
        this.name = name;
        this.lastMessage = lastMessage;
    }

    public String getName() {
        return name;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    @Override
    public String toString() {
        return getName() + "\nMessage: " + getLastMessage() + "\n=====================================";
    }
}

