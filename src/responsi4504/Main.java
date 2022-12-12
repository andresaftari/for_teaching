package responsi4504;

public class Main {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("D3 Rekayasa Perangkat Lunak Aplikasi");

        MahasiswaAktif mAktif = new MahasiswaAktif("6706211234", "Rijik", "VII3B4");
        Alumni mAlumni = new Alumni("6706193049", "Dre", true);
        
        jurusan.inputData(mAlumni);
        jurusan.inputData(mAktif);

        System.out.println("Menampilkan semua: ");
        jurusan.displayAll();

        System.out.println("\nMenampilkan seluruh alumni: ");
        jurusan.displayAlumni();

        System.out.println("\nMenampilkan nama mahasiswa aktif: ");
        jurusan.displayNamaMahasiswaAktif();
    }
}