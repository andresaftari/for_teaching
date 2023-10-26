package pbo.assessment.packa;

public class Keyboard {
    private String merk, seri;
    private int harga;

    public Keyboard(String merk, String seri, int harga) {
        this.merk = merk;
        this.seri = seri;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public String getSeri() {
        return seri;
    }

    public int getHarga() {
        return harga;
    }
}
