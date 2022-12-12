package Semester3.Topik9;

public class Main {
    public static void main(String[] args) {
        Karyawan karyawanTetap = new Tetap("Fikry", 50, 100);
        Karyawan karyawanKontrak1 = new Kontrak("Andre", 100, 150);

        Departemen departemen = new Departemen("Kominfo");
        departemen.addKaryawan(karyawanTetap);
        departemen.addKaryawan(karyawanKontrak1);

        departemen.displayAll();
        departemen.displayTetap();
        departemen.displayKontrak();
    }
}