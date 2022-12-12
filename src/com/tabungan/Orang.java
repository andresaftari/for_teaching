package com.tabungan;

import java.util.ArrayList;
import java.util.Random;

public class Orang {
    String nama;
    int nik;
    ArrayList<Tabungan> tabunganList = new ArrayList<>();

    public Orang(String nama, int nik) {
        this.nama = nama;
        this.nik = nik;
    }

    public void bukaRekening(String namaNasabah) {
        tabunganList.add(new Tabungan(namaNasabah, Math.abs(new Random().nextInt())));
        System.out.println(tabunganList.toString());
    }

    public String getNama() {
        return nama;
    }

    public int getNik() {
        return nik;
    }
}