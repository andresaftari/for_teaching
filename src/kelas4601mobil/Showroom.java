package kelas4601mobil;

import java.util.ArrayList;

// GENERIC
public class Showroom {
    private static final ArrayList<Mobil> listBMW = new ArrayList<>();
    private static final ArrayList<Mobil> listJeep = new ArrayList<>(); // B

    public void addMobil(Mobil mobil) {
        if (mobil.getBrand().equals("BMW")) listBMW.add(mobil); // barang.getKode == "A"
        if (mobil.getBrand().equals("Jeep")) listJeep.add(mobil); // barang.getKode == "B"
    }

    public void editMobil(String brandDicari) {
        if (brandDicari.contains("A")) {
            for (int i = 0; i < listBMW.size(); i++) {
                if (listBMW.get(i).getBrand().equals(brandDicari)) {
                    // mulai ngedit
                    listBMW.set(i, new Mobil(
                        listBMW.get(i).getBrand(), "warna baru", 3000)
                    );
                }
            }
        }
    }

    public void deleteMobil(String brandDicari) {
        if (brandDicari.contains("A")) {
            for (int i = 0; i < listBMW.size(); i++) {
                if (listBMW.get(i).getBrand().equals(brandDicari)) {
                    listBMW.remove(i);
                }
            }
        }
    }

    public void display() {
        for (Mobil mobil : listBMW) {
            System.out.println(mobil);
        }
    }
}
