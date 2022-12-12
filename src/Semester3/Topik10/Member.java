package Semester3.Topik10;

public abstract class Member {
    // memberType = 1 untuk Customer, memberType = 2 untuk Driver
    protected int saldo, memberType;
    protected String nik, name, phone;

    public Member(String nik, String name, String phone, int saldo) {
        this.nik = nik;
        this.name = name;
        this.phone = phone;
        this.saldo = saldo;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public String getName() {
        return name;
    }

    protected abstract void tambahSaldo(int saldo);

    protected abstract void kurangSaldo(int saldo);

    protected abstract void display();
}