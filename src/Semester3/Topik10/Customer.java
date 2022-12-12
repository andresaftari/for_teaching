package Semester3.Topik10;

public class Customer extends Member {
    private final String address;
    private int saldo;

    public Customer(String nik, String name, String phone, String address, int saldo) {
        super(nik, name, phone, saldo);
        this.nik = nik;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.saldo = saldo;
        this.memberType = 1;
    }

    @Override
    protected void tambahSaldo(int saldo) {
        this.saldo = this.saldo + saldo;
    }

    @Override
    protected void kurangSaldo(int saldo) {
        this.saldo = this.saldo - saldo;
    }

    public void display() {
        System.out.println("\n========== Data Customer ==========");
        System.out.println(
                "\nNama : " + this.name +
                        "\nNIK : " + this.nik +
                        "\nNo Telp : " + this.phone +
                        "\nNomor Alamat : " + this.address +
                        "\nJumlah Saldo : " + this.saldo
        );
    }
}