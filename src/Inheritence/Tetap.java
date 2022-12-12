package Inheritence;

// (MODEL/ENTITY)
public class Tetap extends Karyawan {
    private final double tuDas;

    public Tetap(String nama, double tuDas, double gaDas) {
        super(nama, gaDas);
        this.nama = nama;
        this.tuDas = tuDas;
        this.gaDas = gaDas;
        this.status = 1;
    }

    @Override
    public void display() {
        System.out.println(
                "\nNama karyawan : " + this.nama +
                        "\nTunjangan dasar : " + this.tuDas +
                        "\nGaji dasar : " + this.gaDas
        );
    }
}
