package Semester3.Topik9;

import java.util.Arrays;

public class Departemen {
    private final String nama;
    private final Karyawan[] kar = new Karyawan[2];
    private int index = 0;

    public Departemen(String nama) {
        this.nama = nama;
    }

    public void addKaryawan(Karyawan karyawan) {
        kar[index] = karyawan;
        index++;
        index %= kar.length;
    }

    public void displayAll() {
        System.out.println("\n===========Seluruh Karyawan di Departemen " + getNama() + "===========\n");
        Arrays.stream(kar).forEach(Karyawan::display);
    }

    public void displayKontrak() {
        System.out.println("\n===========Karyawan Kontrak===========\n");
        Arrays.stream(kar).filter(it -> it.status == 0).forEach(Karyawan::display);

        for (Karyawan karyawan : kar) {
            if (karyawan.status == 0) karyawan.display();
        }
    }

    public void displayTetap() {
        System.out.println("\n===========Karyawan Tetap===========\n");
        Arrays.stream(kar).filter(it -> it.status == 1).forEach(Karyawan::display);
    }

    public String getNama() {
        return nama;
    }
}