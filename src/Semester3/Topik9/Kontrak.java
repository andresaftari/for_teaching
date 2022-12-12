package Semester3.Topik9;

// Anak kelas harus extend induknya
public class Kontrak extends Karyawan {
    private final int waktu;

    public Kontrak(String nama, int waktu, double gaDas) {
        super(nama, gaDas);
        this.waktu = waktu;
        this.nama = nama;
        this.gaDas = gaDas;
        this.status = 0;
    }

    public void display() {
        System.out.println("Nama karyawan : " + this.nama);
        System.out.println("Waktu kontrak : " + this.waktu);
        System.out.println("Gaji dasar : " + this.gaDas);
        System.out.println();
    }
}