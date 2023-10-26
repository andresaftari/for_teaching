package pbo.responsi46;

public class Developer {
    private String nama;
    private int gaji;

    public Developer(String nama, int gaji) {
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
        return "Developer{" +
                "nama='" + nama + '\'' +
                ", gaji=" + gaji +
                '}';
    }
}
