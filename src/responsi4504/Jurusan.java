package responsi4504;

import java.util.ArrayList;

public class Jurusan {
    private String nama;
    private ArrayList<Mahasiswa> listMhs = new ArrayList<>();
    
    public Jurusan(String nama) {
        this.nama = nama;
    }

    public void inputData(Mahasiswa mahasiswa) {
        listMhs.add(mahasiswa);
    }

    public void displayAll() {
        for (Mahasiswa mahasiswa : listMhs) {
            mahasiswa.display();
        }
    }

    public void displayAlumni() {
        for (Mahasiswa mahasiswa : listMhs) {
            if (mahasiswa instanceof Alumni) {
                mahasiswa.display();
            }
        }
    }

    public void displayNamaMahasiswaAktif() {
        for (Mahasiswa mahasiswa : listMhs) {
            if (mahasiswa instanceof MahasiswaAktif) {
                String result = ((MahasiswaAktif) mahasiswa).nama;
                System.out.println(result);
            }
        }
    }
}
