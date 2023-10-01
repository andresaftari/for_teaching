package isd.PraAss2.Queues;

public class Pelanggan {
    // VS CODE:
    // CTRL . || COMMAND .

    // INTELLIJ
    // ALT INSERT || OPTION/CONTROL INSERT

    int noPanggilan, jumlah;
    String namaPelanggan, namaPesanan;

    public Pelanggan(
            int noPanggilan,
            String namaPelanggan,
            String namaPesanan,
            int jumlah
    ) {
        this.noPanggilan = noPanggilan;
        this.namaPelanggan = namaPelanggan;
        this.namaPesanan = namaPesanan;
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "Pelanggan{" +
                "noPanggilan=" + noPanggilan +
                ", jumlah=" + jumlah +
                ", namaPelanggan='" + namaPelanggan + '\'' +
                ", namaPesanan='" + namaPesanan + '\'' +
                '}';
    }
}
