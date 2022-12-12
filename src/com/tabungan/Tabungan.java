package com.tabungan;

import java.util.ArrayList;

public class Tabungan {
    private String namaNasabah;
    private int nomorRek;
    private ArrayList<Saldo> saldoList = new ArrayList<>();

    public Tabungan(String namaNasabah, int nomorRek) {
        this.namaNasabah = namaNasabah;
        this.nomorRek = nomorRek;
        getSaldoList().set(0, new Saldo(0));
    }

    public void deposit(int nomorRek, double saldo) {
        for (int i = 0; i < getSaldoList().size(); i++) {
            if (nomorRek == getSaldoList().get(i).getNomorRek()) getSaldoList().add(new Saldo(saldo));
        }
    }

    public void withdraw(int nomorRek, double saldo) {
        for (int i = 0; i < getSaldoList().size(); i++) {
            if (nomorRek == getSaldoList().get(i).getNomorRek()) getSaldoList().remove(new Saldo(saldo));
        }
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public int getNomorRek() {
        return nomorRek;
    }

    public ArrayList<Saldo> getSaldoList() {
        return saldoList;
    }

    public double getTotalSaldo() {
        double total = 0;
        for (int i = 0; i < getSaldoList().size(); i++) {
            total = total + getSaldoList().get(i).getJumlahSaldo();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Tabungan " + getNomorRek() + " a/n. " + getNamaNasabah() + " : " + getTotalSaldo();
    }
}

class Saldo {
    private int nomorRek;
    private double jumlahSaldo;

    public Saldo(double jumlahSaldo) {
        this.jumlahSaldo = jumlahSaldo;
    }

    public int getNomorRek() {
        return nomorRek;
    }

    public double getJumlahSaldo() {
        return jumlahSaldo;
    }
}