package pbo.assessment.packb;

public class Pegawai {
    private String nip, nama, level;
    private Gaji gaji;

    public Pegawai(String nip, String level, String nama) {
        this.nip = nip;
        this.nama = nama;
        this.level = level;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getLevel() {
        return level;
    }

    public Gaji getGaji() {
        return gaji;
    }

    public void setGaji(Gaji gajiBln) {
        this.gaji = gajiBln;
    }
}
