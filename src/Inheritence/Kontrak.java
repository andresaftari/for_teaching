package Inheritence;

// KELAS WARISAN => MEWARISI SUPERCLASS (MODEL/ENTITY)
public class Kontrak extends Karyawan {
    private final int waktu;

    public Kontrak(String nama, int waktu, double gaDas) {
        super(nama, gaDas);
        this.nama = nama;
        this.waktu = waktu;
        this.gaDas = gaDas;
        this.status = 0;
    }

    @Override
    public void display() {
        System.out.println(
                "\nNama karyawan : " + this.nama +
                "\nWaktu kontrak : " + this.waktu +
                "\nGaji dasar : " + this.gaDas
        );
    }
}
