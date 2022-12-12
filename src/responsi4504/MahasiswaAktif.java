package responsi4504;

public class MahasiswaAktif extends Mahasiswa {
    private String kodeMatakuliah;

    public MahasiswaAktif(String nim, String nama, String kodeMatakuliah) {
        super(nim, nama);
        this.kodeMatakuliah = kodeMatakuliah;
    }

    public String getKodeMatakuliah() {
        return kodeMatakuliah;
    }

    @Override
    public void display() {
        System.out.println("Mahasiswa " + super.nama + 
        " - NIM " + super.nim + 
        " - Kode Matakuliah " + this.kodeMatakuliah);
    }
}
