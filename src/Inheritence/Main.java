package Inheritence;

public class Main {
    public static void main(String[] args) {
        Kontrak karyawanKontrak = new Kontrak("Andre", 5, 500.0);
        Tetap karyawanTetap = new Tetap("Dre", 200.0, 500.0);

        Departemen departemen = new Departemen();

        departemen.addKaryawan(karyawanTetap);
        departemen.addKaryawan(karyawanKontrak);
//        departemen.displayAll();
    }
}
