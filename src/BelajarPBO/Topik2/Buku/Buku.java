package BelajarPBO.Topik2.Buku;

public class Buku {
    String isbn, judulBuku, pengarang, tahunTerbit;
    double harga;
    float rating;

    public Buku(String isbn, String judulBuku, String pengarang, String tahunTerbit, double harga, float rating) {
        this.isbn = isbn;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }

    public Buku(String judulBuku, String pengarang, String tahunTerbit, double harga, float rating) {
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public float getRating() {
        return rating;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "isbn='" + isbn + '\'' +
                ", judulBuku='" + judulBuku + '\'' +
                ", pengarang='" + pengarang + '\'' +
                ", tahunTerbit='" + tahunTerbit + '\'' +
                ", harga=" + harga +
                ", rating=" + rating +
                '}';
    }
}