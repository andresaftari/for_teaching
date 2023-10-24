package pbo.responsi46;

public class Analyst {
    private String nama;
    private int gaji;

    public Analyst(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return gaji;
    }

    @Override
    public String toString() {
        return "Analyst{" +
                "nama='" + nama + '\'' +
                ", gaji=" + gaji +
                '}';
    }
}
