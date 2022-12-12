package Semester3.Topik5.Segitiga;

public class SegitigaSisi extends KomponenSegitiga {
    int alas, sisi;

    public SegitigaSisi(int alas, int sisi) {
        super(alas, sisi);
        this.alas = alas;
        this.sisi = sisi;
    }

    public int getAlas() {
        return alas;
    }

    public int getSisi() {
        return sisi;
    }

    public double getTinggi() {
        return (getSisi()) / 2f * Math.sqrt(3);
    }

    public void displayLuas() {
        double luas = (getAlas() * getTinggi()) / 2;
        System.out.println("Luas segitiga sama sisi adalah : " + luas);
    }

    public void displayKeliling() {
        double keliling = 3 * getSisi();
        System.out.println("Keliling segitiga sama sisi adalah : " + keliling);
    }
}