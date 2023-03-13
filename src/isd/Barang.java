package isd;

import org.jetbrains.annotations.NotNull;

public class Barang implements Comparable<Barang> {
    private String kode, jenis, nama;
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

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public int compareTo(@NotNull Barang barang) {
        return 0;
    }
}
