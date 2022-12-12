package Inheritence;

// # => protected
// KELAS INDUK (SUPERCLASS) => SELALU ABSTRACT

// DAO (DATA ACCESS OBJECT)
public abstract class Karyawan {
    protected String nama;
    protected double gaDas;
    protected int status;

    public Karyawan(String nama, double gaDas) {
        this.nama = nama;
        this.gaDas = gaDas;
    }

    public void display() {
        // Ini gausah ada isinya
    }
}
