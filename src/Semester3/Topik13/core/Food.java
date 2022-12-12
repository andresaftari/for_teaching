package Semester3.Topik13.core;

public class Food {
    private String namaMakanan, jenis, kalori;
    private int rating;

    public Food(String namaMakanan, String jenis, int rating, String kalori) {
        this.namaMakanan = namaMakanan;
        this.jenis = jenis;
        this.rating = rating;
        this.kalori = kalori;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public String getJenis() {
        return jenis;
    }

    public int getRating() {
        return rating;
    }

    public String getKalori() {
        return kalori;
    }
}
