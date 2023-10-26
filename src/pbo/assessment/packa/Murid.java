package pbo.assessment.packa;

import java.util.ArrayList;

public class Murid {
    private String nama, nim;
    private int umur;
    private ArrayList<Komputer> arrKomputer;
    private ArrayList<String> arrGuru;

    public Murid(String nama, String nim, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
        this.arrKomputer = new ArrayList<>();
        this.arrGuru = new ArrayList<>();
    }

    public void addGuru(String namaGuru) {
        arrGuru.add(namaGuru);
    }

    public void addAsset(Komputer komputer) {
        arrKomputer.add(komputer);
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getUmur() {
        return umur;
    }

    public String getListGuru() {
        StringBuilder str = new StringBuilder();

        for (String guru : arrGuru) {
            if (guru.equals(arrGuru.get(arrGuru.size() - 1))) str.append(guru);
            else str.append(guru).append(" - ");
        }

        return str.toString();
    }

    public int getNilaiAsetKomputer() {
        int total = 0;

        if (!arrKomputer.isEmpty()) {
            for (Komputer komputer : arrKomputer) total += komputer.getHargaKomponen() + komputer.getHarga();
        }

        return total;
    }

    public void showListAset() {
        for (int i = 0; i < arrKomputer.size(); i++) {
            System.out.println((i + 1) + " - Komputer : "
                    + arrKomputer.get(i).getMerk() + " "
                    + arrKomputer.get(i).getTipe() + " (Ryo " + arrKomputer.get(i).getHarga() + ")"
            );
            arrKomputer.get(i).showAssetKomputer();
        }
    }
}
