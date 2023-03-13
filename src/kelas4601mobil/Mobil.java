package kelas4601mobil;

// ADT / OBJECT / POJO
public class Mobil {
    // ATRIBUT (PRIVATE / DEFAULT)
    private String brand, warna;
    private int cc;

    // CONSTRUCTOR
    public Mobil(String brand, String warna, int cc) {
        this.brand = brand;
        this.warna = warna;
        this.cc = cc;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Mobil {brand =" + brand + ", warna =" + warna + ", cc =" + cc + "}";
    }
}
