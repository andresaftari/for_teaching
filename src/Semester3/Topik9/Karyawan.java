package Semester3.Topik9;

// - artinya private
// + artinya public
// # protected

// Kelas induk jadikan abstract class
public abstract class Karyawan {
    protected double gaDas;
    protected String nama;
    protected int status;

    public Karyawan(String nama, double gaDas) {
        this.nama = nama;
        this.gaDas = gaDas;
    }

    public void display() {
        // Nothing to do here :)
    }
}