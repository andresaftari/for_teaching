package Semester3.Topik3;

public class Topik3 {
    static Jurusan jurusan1 = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
    static Jurusan jurusan2 = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

    public static void main(String[] args) {
        // Input data jurusan
        Mahasiwa mhs1 = new Mahasiwa("Rendi", "6701");
        Mahasiwa mhs2 = new Mahasiwa("Chaca", "6702");
        Mahasiwa mhs3 = new Mahasiwa("Agus", "6703");
        Mahasiwa mhs4 = new Mahasiwa("Ridwan", "6301");
        Mahasiwa mhs5 = new Mahasiwa("Siska", "6302");
        Mahasiwa mhs6 = new Mahasiwa("Zayn", "6303");
        Mahasiwa mhs7 = new Mahasiwa("Rahmat", "6304");

        // Input data nama dan nim
        jurusan1.addStudent(mhs1);
        jurusan1.addStudent(mhs2);
        jurusan1.addStudent(mhs3);

        jurusan2.addStudent(mhs4);
        jurusan2.addStudent(mhs5);
        jurusan2.addStudent(mhs6);
        jurusan2.addStudent(mhs7);

        // Display sesuai format di soal
        jurusan1.displayAll();
        jurusan2.displayAll();
    }
}