package pbo.responsi46;

public class Lens {
    public String brand;
    public int focalLength;

    public Lens(String brand, int focalLength) {
        this.brand = brand;
        this.focalLength = focalLength;
    }

    @Override
    public String toString() {
        return "Lens " + brand + " (" + focalLength + "mm)";
    }
}
