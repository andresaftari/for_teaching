package kelas4601mobil;

public class Main {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();

        Mobil mobilBMW = new Mobil("BMW", "Item", 3000);
        Mobil mobilRubicon = new Mobil("Jeep", "Item", 4000);
        Mobil mobilSupra = new Mobil("Toyota", "Putih", 5000);

        showroom.addMobil(mobilBMW);
        showroom.addMobil(mobilRubicon);
        showroom.addMobil(mobilSupra);

        showroom.display();
    }
}
