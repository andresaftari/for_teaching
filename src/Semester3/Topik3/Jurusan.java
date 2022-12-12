package Semester3.Topik3;

import java.util.ArrayList;

public class Jurusan {
    private final String kode;
    private final String nama;
    private final ArrayList<Mahasiwa> mhs = new ArrayList<>();

    public Jurusan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    void addStudent(Mahasiwa mahasiwa) {
        this.mhs.add(mahasiwa);
    }

    void displayAll() {
        System.out.println("\nKode: " + this.getKode() + "\nNama: " + this.getNama() + "\nDaftar mahasiswa : ");
        for (int i = 0; i < mhs.size(); i++) System.out.println((i + 1) + ". " + getMhs().get(i).toString());
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Mahasiwa> getMhs() {
        return mhs;
    } // Ini gak berguna sebenernya, tapi soal yang minta jadi gw buat
}