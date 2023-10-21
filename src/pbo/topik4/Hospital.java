package pbo.topik4;

public class Hospital {
    private int id;
    private String nama;
    // Berikan size array minimal 2, sebagai contoh size array 3, artinya isinya maksimum 3
    private Nurse[] nurses = new Nurse[3];

    public Hospital(int id, String nama, Nurse[] nurses) {
        this.id = id;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public Nurse[] getNurses() {
        return nurses;
    }
}
