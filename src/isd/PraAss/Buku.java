package isd.PraAss;

public class Buku {
    String judul, pengarang, penerbit;
    int jilid;

    public Buku(String judul, String pengarang, String penerbit, int jilid) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.jilid = jilid;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "judul='" + judul + '\'' +
                ", pengarang='" + pengarang + '\'' +
                ", penerbit='" + penerbit + '\'' +
                ", jilid=" + jilid +
                '}';
    }
}
