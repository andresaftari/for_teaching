package Semester3.Ass1;

public class MarketPlace {
    // Normal
    private int noTransaksi;
    private String namaPenjual, alamatPenjual, namaPembeli, alamatPembeli, namaEkspedisi, noResi;
    private double ongkosKirim;

    // Asuransi
    private double nominalAsuransi;
    private boolean statusAsuransi = false;

    // Dropshipper
    private String namaDropshipper, alamatDropshipper;
    private boolean statusDropshipper = false;

    // KONSTRUKTOR NORMAL
    public MarketPlace(
            int noTransaksi,
            String namaPenjual,
            String alamatPenjual,
            String namaPembeli,
            String alamatPembeli,
            String namaEkspedisi,
            String noResi,
            double ongkosKirim
    ) {
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.ongkosKirim = ongkosKirim;
    }

    // KONSTRUKTOR NORMAL + ASURANSI
    public MarketPlace(
            int noTransaksi,
            String namaPenjual,
            String alamatPenjual,
            String namaPembeli,
            String alamatPembeli,
            String namaEkspedisi,
            String noResi,
            double ongkosKirim,
            double nominalAsuransi
    ) {
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.ongkosKirim = ongkosKirim;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = true;
    }

    // KONSTRUKTOR NORMAL + DROPSHIPPER
    public MarketPlace(
            int noTransaksi,
            String namaPembeli,
            String alamatPembeli,
            String namaEkspedisi,
            String noResi,
            double ongkosKirim,
            String namaDropshipper,
            String alamatDropshipper
    ) {
        this.noTransaksi = noTransaksi;
        this.namaPenjual = "";
        this.alamatPenjual = "";
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.ongkosKirim = ongkosKirim;
        this.namaDropshipper = namaDropshipper;
        this.alamatDropshipper = alamatDropshipper;
        this.statusDropshipper = true;
    }

    // KONSTRUKTOR NORMAL + ASURANSI + DROPSHIPPER
    public MarketPlace(
            int noTransaksi,
            String namaPembeli,
            String alamatPembeli,
            String namaEkspedisi,
            String noResi,
            double ongkosKirim,
            double nominalAsuransi,
            String namaDropshipper,
            String alamatDropshipper
    ) {
        this.noTransaksi = noTransaksi;
        this.namaPembeli = namaPembeli;
        this.namaPenjual = "";
        this.alamatPenjual = "";
        this.alamatPembeli = alamatPembeli;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.ongkosKirim = ongkosKirim;
        this.nominalAsuransi = nominalAsuransi;
        this.namaDropshipper = namaDropshipper;
        this.alamatDropshipper = alamatDropshipper;
        this.statusAsuransi = true;
        this.statusDropshipper = true;
    }

    public void display() {
        if (!this.statusAsuransi && !this.statusDropshipper) {
            System.out.println(
                    "\nNormal" +
                            "\nNo Transaksi : " + noTransaksi +
                            "\nNo Resi : " + noResi +
                            "\nNama Ekspedisi : " + namaEkspedisi +
                            "\nOngkos Kirim : " + ongkosKirim +
                            "\nNama Pengirim : " + namaPenjual +
                            "\nAlamat Pengirim : " + alamatPenjual +
                            "\nNama Penerima : " + namaPembeli +
                            "\nAlamat Penerima : " + alamatPembeli
            );
        }
        if (this.statusAsuransi) {
            System.out.println(
                    "\nAsuransi" +
                            "\nNo Transaksi : " + noTransaksi +
                            "\nNo Resi : " + noResi +
                            "\nNama Ekspedisi : " + namaEkspedisi +
                            "\nOngkos Kirim : " + ongkosKirim +
                            "\nNama Pengirim : " + namaPenjual +
                            "\nAlamat Pengirim : " + alamatPenjual +
                            "\nNama Penerima : " + namaPembeli +
                            "\nAlamat Penerima : " + alamatPembeli
                    // + nominal asuransi
            );
        }
        if (this.statusDropshipper) {
            System.out.println(
                    "\nDropshipper" +
                            "\nNo Transaksi : " + noTransaksi +
                            "\nNo Resi : " + noResi +
                            "\nNama Ekspedisi : " + namaEkspedisi +
                            "\nOngkos Kirim : " + ongkosKirim +
                            "\nNama Dropshipper : " + namaDropshipper +
                            "\nAlamat Dropshipper : " + alamatDropshipper +
                            "\nNama Penerima : " + namaPembeli +
                            "\nAlamat Penerima : " + alamatPembeli
                    // + nominal dropshipper
            );
        }
        if (this.statusDropshipper && this.statusAsuransi) {
            System.out.println(
                    "\nAsuransi & Dropshipper" +
                            "\nNo Transaksi : " + noTransaksi +
                            "\nNo Resi : " + noResi +
                            "\nNama Ekspedisi : " + namaEkspedisi +
                            "\nOngkos Kirim : " + ongkosKirim +
                            "\nNama Dropshipper : " + namaDropshipper +
                            "\nAlamat Dropshipper : " + alamatDropshipper +
                            "\nNama Penerima : " + namaPembeli +
                            "\nAlamat Penerima : " + alamatPembeli
                    // + nominal dropshipper
                    // + nominal asuransi
            );
        }
    }
}
