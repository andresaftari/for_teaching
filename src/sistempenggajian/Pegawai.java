package sistempenggajian;

public class Pegawai {
    private String nama, nip;
    private int statusKepegawaian, jumlahHariKerja;
    private double gajiPokok, gajiTotal, uangMakan;

    public Pegawai(String nama, String nip, int statusKepegawaian, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.statusKepegawaian = statusKepegawaian;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getStatusKepegawaian() {
        return statusKepegawaian;
    }

    public void setStatusKepegawaian(int statusKepegawaian) {
        this.statusKepegawaian = statusKepegawaian;
    }

    public int getJumlahHariKerja() {
        return jumlahHariKerja;
    }

    public void setJumlahHariKerja(int jumlahHariKerja) {
        this.jumlahHariKerja = jumlahHariKerja;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getGajiTotal() {
        return gajiTotal;
    }

    public void setGajiTotal(double gajiTotal) {
        this.gajiTotal = gajiTotal;
    }

    public double getUangMakan() {
        return uangMakan;
    }

    public void setUangMakan(double uangMakan) {
        this.uangMakan = uangMakan;
    }

    public void hitungGaji(int jumlahHariKerja) {
        this.jumlahHariKerja = jumlahHariKerja;
        this.uangMakan = jumlahHariKerja * 20000;
        this.gajiTotal = gajiPokok * uangMakan;
    }


}
