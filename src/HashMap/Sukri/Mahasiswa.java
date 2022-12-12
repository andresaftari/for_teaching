package HashMap.Sukri;

public class Mahasiswa {
    private final String NIM;
    private final String kelas;
    private final String nama;

    //agar nim bisa dipanggil
    public String getNIM() {
        return NIM;
    }

    //agar kelas bisa dipanggil
    public String getKelas() {
        return kelas;
    }

    //agar nama bisa dipanggil
    public String getNama() {
        return nama;
    }

    //berfungsi untuk mensetting atau mengisi value nim,kelas,nama
    public Mahasiswa(String NIM, String kelas, String nama){
        this.NIM = NIM;
        this.kelas = kelas;
        this.nama = nama;
    }

    //membuat hashing
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //perbandingan antar key
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //mengkonver ke string
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "NIM='" + NIM + '\'' +
                ", kelas='" + kelas + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }
}
