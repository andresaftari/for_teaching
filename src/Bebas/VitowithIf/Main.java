package Bebas.VitowithIf;

public class Main {
    public static void main(String[] Args) {
        try {
            Tugas.barang();
        } catch (Exception e) {
            System.out.println("Terjadi error dalam barang(): " + e.getMessage());
        }
    }
}
