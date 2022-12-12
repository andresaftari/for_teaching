package BelajarPBO.Topik3;

import java.util.ArrayList;

public class Jurusan {
    String nama, kode;
    ArrayList<Mahasiswa> mhs = new ArrayList<>();

    public Jurusan(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }

    public void addMhs(Mahasiswa m) {
        getMhs().add(m);
    }

    public void displayAll() {
        System.out.println("\nKode: " + this.getKode() + "\nNama: " + this.getNama() + "\nDaftar mahasiswa : ");
        for (int i = 0; i < getMhs().size(); i++) System.out.println((i + 1) + ". " + getMhs().get(i).toString());
    }

    public ArrayList<Mahasiswa> getMhs() {
        return mhs;
    }

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }
}

class Mahasiswa {
    String nim, nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}