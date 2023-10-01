package isd;

public class Mobil {
    private String brand, color, plate;

    public Mobil(String brand, String color, String plate) {
        this.brand = brand;
        this.color = color;
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getPlate() {
        return plate;
    }
}

class Status {
    public static void main(String[] args) {
        Status status = new Status();
        System.out.println(status.method1());
    }

    private String method1() {
        return "Method 1";
    }
}
