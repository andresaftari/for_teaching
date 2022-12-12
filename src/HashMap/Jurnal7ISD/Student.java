package HashMap.Jurnal7ISD;

public class Student {
    private final String nim;
    private final String nama;
    private final String kelas;
    // Komponen key kita

    public Student(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }
    // Construct setiap Key

    @Override
    public int hashCode() {
        final int hash_multiplier = 13;
        // Merupakan pengali dalam bentuk hashCode, untuk hasil maksimal gunakan prime number
        int hash1 = nama.hashCode();
        int hash2 = nim.hashCode();
        int hash3 = kelas.hashCode();
        int hash = hash_multiplier * hash1 + hash2;
        hash = hash_multiplier * hash + hash3;
        return hash;
        // Buat hashCode function
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return getNama().equals(other.getNama()) && getNim().equals(other.getNim())
                && getKelas().equals(other.getKelas());
        // Algoritma untuk synchronizes setiap key
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    @Override
    public String toString() {
        return "NIM = " + getNim() + "|" + "Nama = " + getNama() + "|" + "Kelas = " + getKelas();
    }
}
