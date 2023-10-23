package pbo.topik4;

public class Nurse {
    private String nama;
    private int id;

    public Nurse(int id, String nama) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nurse " + nama + " (" + id + ")";
    }
}
