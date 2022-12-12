package BelajarPBO.Basic.Model;

public class Mobil {
    private String jenisBensin;
    private final String brand;

    public Mobil(String jenisBensin, String brand) {
        this.jenisBensin = jenisBensin;
        this.brand = brand;
    }

    public Mobil(String brand) {
        this.brand = brand;
    }

    public String getJenisBensin() {
        return jenisBensin;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        if (this.jenisBensin == null) {
            return "Mobil brand " + getBrand();
        } else {
            return "Mobil brand " + getBrand() + " khusus " + getJenisBensin();
        }
    }
}
