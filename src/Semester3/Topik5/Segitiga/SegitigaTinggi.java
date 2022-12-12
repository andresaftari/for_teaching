package Semester3.Topik5.Segitiga;

public class SegitigaTinggi extends KomponenSegitiga {
    int alas, tinggi;

    public SegitigaTinggi(int alas, int tinggi) {
        super(alas, tinggi);
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void displayLuas() {
        double luas = (getAlas() * getTinggi()) / 2f;
        System.out.println("Luas segitiga sama sisi adalah : " + luas);
    }

    public void displayKeliling() {
        double keliling = 3 * getAlas();
        System.out.println("Keliling segitiga sama sisi adalah : " + keliling);
    }
}