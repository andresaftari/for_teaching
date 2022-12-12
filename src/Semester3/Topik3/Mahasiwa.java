package Semester3.Topik3;

public class Mahasiwa {
    String nama, nim;

    public Mahasiwa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return this.getNim() + " - " + this.getNama();
    }
}