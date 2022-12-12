package Semester3.Topik2.Poins.SewaKendaraan;

public class Motor {
    String namaPenyewa, jenisMotor;
    int jamBerangkat, jamKembali, menitBerangkat, menitKembali;
    double harga;

    public Motor(String namaPenyewa, String jenisMotor, int jamBerangkat, int jamKembali, int menitBerangkat, int menitKembali, double harga) {
        this.namaPenyewa = namaPenyewa;
        this.jenisMotor = jenisMotor;
        this.jamBerangkat = jamBerangkat;
        this.jamKembali = jamKembali;
        this.menitBerangkat = menitBerangkat;
        this.menitKembali = menitKembali;
        this.harga = harga;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public int getJamBerangkat() {
        return jamBerangkat;
    }

    public int getJamKembali() {
        return jamKembali;
    }

    public int getMenitBerangkat() {
        return menitBerangkat;
    }

    public int getMenitKembali() {
        return menitKembali;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        String berangkat, kembali;
        if (menitBerangkat == 0) berangkat = "00";
        else berangkat = String.valueOf(getMenitBerangkat());

        if (menitKembali == 0) kembali = "00";
        else kembali = String.valueOf(getMenitKembali());

        return "Terima kasih " + getNamaPenyewa() + ". Anda telah menyewa " + getJenisMotor() + " dari pukul " +
                getJamBerangkat() + ":" + berangkat + "-" + getJamKembali() + ":" + kembali + " dengan total biaya sewa Rp"
                + getHarga();
    }
}