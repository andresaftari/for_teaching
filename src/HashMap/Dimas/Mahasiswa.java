package HashMap.Dimas;

public class Mahasiswa {
    private String NIM;
    private String kelas;
    private String nama;

    public Mahasiswa(String NIM, String kelas, String nama) {
        this.NIM = NIM;
        this.kelas = kelas;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "NIM='" + NIM + '\'' +
                ", kelas='" + kelas + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
