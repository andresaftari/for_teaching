package pbo.assessment.packa;

public class Main {
    public static void main(String[] args) {
        // Data Mahasiswa
        Murid m1 = new Murid("2301", "Naruto", 20);

        // Data Guru
        Guru d1 = new Guru("Kakashi", "Wakasek I");
        Guru d2 = new Guru("Jiraya", "Kepala Sekolah");
        Guru d3 = new Guru("Yamato", "Wakasek II");

        // Data Aset
        Komputer lp1 = new Komputer("Acer", "Predator", 10000);
        lp1.addKomponen(
                new Mouse("Rexus", "ARKA-II", 200),
                new Keyboard("Rexus", "DAIVA-68SF", 400)
        );
        Komputer lp2 = new Komputer("Asus", "ROG", 12000);
        lp2.addKomponen(
                new Mouse("Fantech", "ARIA-XD7", 800),
                new Keyboard("Fantech", "MAXFIT-67", 1000)
        );

        // Input Data ke Murid m1
        m1.addGuru(d1.getNama());
        m1.addGuru(d2.getNama());
        m1.addGuru(d3.getNama());
        m1.addAsset(lp1);
        m1.addAsset(lp2);

        // Menampilkan Data Murid m1
        System.out.println("\n---------- Data Mahasiswa -----------");
        System.out.println("Nama : " + m1.getNama() + " ("
                + m1.getUmur() + " tahun)\nNIM : " + m1.getNim());

        System.out.println("Pernah diajar oleh : " + m1.getListGuru());
        System.out.println("Total Nilai Aset : Ryo " + m1.getNilaiAsetKomputer());
        System.out.println("--------- Aset yang Dimiliki --------");

        m1.showListAset();
    }
}
