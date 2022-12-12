package Semester3;

import java.util.ArrayList;

public class Main {
    static Jurusan d3if = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
    static Jurusan d3si = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Rendi", "6701");
        Mahasiswa mhs2 = new Mahasiswa("Chaca", "6702");
        Mahasiswa mhs3 = new Mahasiswa("Agus", "6703");

        Mahasiswa mhs4 = new Mahasiswa("Ridwan", "6301");
        Mahasiswa mhs5 = new Mahasiswa("Siska", "6302");
        Mahasiswa mhs6 = new Mahasiswa("Zayn", "6303");
        Mahasiswa mhs7 = new Mahasiswa("Rahmat", "6304");

        d3if.addMhs(mhs1);
        d3if.addMhs(mhs2);
        d3if.addMhs(mhs3);

        d3si.addMhs(mhs4);
        d3si.addMhs(mhs5);
        d3si.addMhs(mhs6);
        d3si.addMhs(mhs7);

        d3if.displayAll();
        d3si.displayAll();
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

    @Override
    public String toString() {
        return this.getNim() + " - " + this.getNama();
    }
}

class Jurusan {
    String kode, nama;
    ArrayList<Mahasiswa> mhs = new ArrayList<>();

    public Jurusan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public void addMhs(Mahasiswa mahasiswa) {
        getMhs().add(mahasiswa);
    }

    public void displayAll() {
        System.out.println("\nKode: " + this.getKode() + "\nNama: " + this.getNama() + "\nDaftar mahasiswa : ");
        for (int i = 0; i < mhs.size(); i++) System.out.println((i + 1) + ". " + getMhs().get(i).toString());
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Mahasiswa> getMhs() {
        return mhs;
    }
}