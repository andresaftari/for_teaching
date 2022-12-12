package com.tabungan;

public class Main {
    public static void main(String[] args) {
        Orang orang = new Orang("Andre", 6706);
        orang.bukaRekening(orang.getNama());
        orang.tabunganList.forEach(Tabungan::getTotalSaldo);
    }
}
