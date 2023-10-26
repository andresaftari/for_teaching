package pbo.responsi46;

public class ExternalComponent {
    private String brand;

    public ExternalComponent(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "External Component {" + brand + "}";
    }
}
