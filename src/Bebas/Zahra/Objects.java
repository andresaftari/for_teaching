package Bebas.Zahra;

public class Objects {
    private final String kodeBarang;
    private final String namaBarang;
    private final Integer hargaBarang;

    public Objects(String kodeBarang, String namaBarang, Integer hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public Integer getHargaBarang() {
        return hargaBarang;
    }

    @Override
    public String toString() {
        return "Kode barang : " + getKodeBarang() + "\n" +
                "Nama barang : " + getNamaBarang() + "\n" +
                "Harga barang : " + getHargaBarang();
    }

}
