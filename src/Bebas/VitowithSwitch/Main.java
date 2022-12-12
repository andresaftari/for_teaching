package Bebas.VitowithSwitch;

public class Main {
    public static void main(String[] args) {
        try {
            Store.barang();
        } catch (Exception e) {
            System.out.println("Terjadi error dalam barang(): " + e.getMessage());
        }
    }
}
