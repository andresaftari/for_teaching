package pbo.responsi46.Example;

public class BangunRuang {
    protected int panjang;
    protected int lebar;
    protected int tinggi;

    public BangunRuang(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public BangunRuang(int tinggi) {
        this.tinggi = tinggi;
    }

    public void hitungVolume(int p, int l, int t) {
        // Isian hitung volume
    }

    public void hitungVolume(int p) {
        // Isian hitung volume
    }
}

class Block extends BangunRuang {
    public Block(int panjang, int lebar, int tinggi) {
        super(panjang, lebar, tinggi);
    }

    @Override
    public void hitungVolume(int p, int l, int t) {
        int volume = p * l * t;
        System.out.println("Volume Balok = " + volume);
    }
}

class Cone extends BangunRuang {
    private double radius;
    private final float PI = 3.14f;

    public Cone(int tinggi, double radius) {
        super(tinggi);
        this.radius = radius;
    }

    @Override
    public void hitungVolume(int t) {
        double volume = (PI * radius * radius) * t / 3;
        System.out.println("Volume Cone = " + volume);
    }
}