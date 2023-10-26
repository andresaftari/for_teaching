package pbo.assessment.packb;

public class Main {
    public static void main(String[] args) {
        // Set gaji dasar
        Gaji g = new Gaji("Oktober", 5000000);

        // Pegawai dengan level Manajer
        Pegawai p1 = new Pegawai("0001", "Manajer", "Koyomi");

        // Set gaji pegawai
        g.setTotalGaji(p1.getLevel());
        p1.setGaji(g);

        // Tampilkan pegawai

        System.out.println("NIP pegawai: " + p1.getNip()
                + " dengan nama: " + p1.getNama()
                + " dan level pekerjaan " + p1.getLevel()
        );

        System.out.println("Memiliki gaji: " + p1.getGaji());
    }
}
