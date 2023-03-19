package isd;


public class Barang implements Comparable<Barang> {
    private final String kode, jenis;
    private String nama;
    int stok;

    public Barang(String kode, String jenis, String nama, int stok) {
        this.kode = kode;
        this.jenis = jenis;
        this.nama = nama;
        this.stok = stok;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Barang{" +
                "kode='" + kode + '\'' +
                ", jenis='" + jenis + '\'' +
                ", nama='" + nama + '\'' +
                ", stok=" + stok +
                '}';
    }

    public String getKode() {
        return kode;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int compareTo(Barang o) {
        return 0;
    }
}
