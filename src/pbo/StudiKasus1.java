package pbo;

import java.util.ArrayList;

public class StudiKasus1 {
    public static void main(String[] args) {
        // Chat Room
        ChatRoom chatRoom = new ChatRoom();
        // Client
        Client conselee1 = new Client("Mei");
        Client conselee2 = new Client("Faiz");

        chatRoom.sendMessage(conselee1.getNama(), conselee2.getNama(), "Hollaaaa");
        chatRoom.sendMessage(conselee2.getNama(), conselee1.getNama(), "iya");
        chatRoom.sendMessage(conselee2.getNama(), conselee1.getNama(), "knp mei?");

        chatRoom.showMessage();
    }
}

class Message {
    private String text;
    private String namaReceiver;
    private String namaSender;

    public Message(String text, String sender, String receiver) {
        this.namaSender = sender;
        this.namaReceiver = receiver;
        this.text = text;
    }

    @Override
    public String toString() {
        return "{pesan: " + text + " | dari: " + namaSender + " | ke: " + namaReceiver + "}";
    }
}

class Client {
    private String nama;

    public Client(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class ChatRoom {
    private ArrayList<Message> chatlist = new ArrayList<>();

    public void sendMessage(String sender, String receiver, String message) {
        chatlist.add(new Message(message, sender, receiver));
    }

    public void showMessage() {
        for (Message message : chatlist) System.out.println(message);
    }
}


