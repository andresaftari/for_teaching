package pbo.responsi46;

import java.util.ArrayList;

public class Camera {
    private String brand, model;
    private ArrayList<Lens> compatibleLenses;
    private ArrayList<ExternalComponent> externalComponents;
    private ArrayList<ExternalFilter> externalFilters;

    public Camera(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.compatibleLenses = new ArrayList<>();
        this.externalComponents = new ArrayList<>();
        this.externalFilters = new ArrayList<>();
    }

    public void takePicture() {
        // TAKE PICTURE
    }

    public void takeVideo() {
        // TAKE VIDEO
    }

    public void timeLapse() {
        // TIME LAPSE
    }

    public void addCompatibleLens(Lens lens) {
        compatibleLenses.add(lens);
    }

    public void addExternalComponent(ExternalComponent component) {
        externalComponents.add(component);
    }

    public void addExternalFilter(ExternalFilter filter) {
        externalFilters.add(filter);
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", compatibleLenses=" + compatibleLenses +
                ", externalComponents=" + externalComponents +
                '}';
    }
}
