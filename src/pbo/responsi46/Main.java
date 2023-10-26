package pbo.responsi46;

public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera("Canon", "EOS M100");

        // Lens to Camera is COMPOSITION
        camera.addCompatibleLens(new Lens("Canon RF 50mm f/1.8 STM", 50));
        camera.addCompatibleLens(new Lens("Canon RF 10-24mm f/4L IS USM", 24));

        // ExternalComponent to Camera is AGGREGATION
        ExternalComponent adapter = new ExternalComponent("Canon RF-EF adapter");
        ExternalComponent exFlash = new ExternalComponent("Canon Speedlite Portable Flash");
        camera.addExternalComponent(adapter);
        camera.addExternalComponent(exFlash);

        // ExternalFilter to Camera is ASSOCIATION
        ExternalFilter ndFilter = new ExternalFilter();
        ndFilter.setType("ND-500 Filter");
        ExternalFilter cplFilter = new ExternalFilter();
        cplFilter.setType("Polarizer Filter");
        camera.addExternalFilter(ndFilter);
        camera.addExternalFilter(cplFilter);
    }
}
