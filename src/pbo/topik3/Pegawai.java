package pbo.topik3;

public class Pegawai {
    private String id, nama, alamat, dept;
    private int gaji;

    public Pegawai(String id, String nama, String alamat, String dept, int gaji) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.dept = dept;
        this.gaji = gaji;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getDept() {
        return dept;
    }

    public int getGaji() {
        return gaji;
    }

    @Override
    public String toString() {
        return "Pegawai{"
                + "id=" + id
                + ", nama=" + nama + ", alamat="
                + alamat + ", dept="
                + dept + ", gaji="
                + gaji + '}';
    }
}
