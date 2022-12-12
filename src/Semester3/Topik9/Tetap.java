package Semester3.Topik9;

// Anak kelas harus extend induknya
public class Tetap extends Karyawan {
    private final double tuDas;

    public Tetap(String nama, double tuDas, double gaDas) {
        super(nama, gaDas);
        this.tuDas = tuDas;
        this.nama = nama;
        this.gaDas = gaDas;
        this.status = 1;
    }

    public void display() {
        System.out.println("Nama karyawan : " + this.nama);
        System.out.println("Gaji dasar : " + this.gaDas);
        System.out.println("Tunjangan dasar : " + this.tuDas);
        System.out.println();
    }
}