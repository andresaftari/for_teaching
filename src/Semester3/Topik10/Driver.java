package Semester3.Topik10;

public class Driver extends Member {
    private final String vehicleID;
    private final String type;
    private int saldo;

    public Driver(String nik, String name, String phone, String vehicleID, String type, int saldo) {
        super(nik, name, phone, saldo);
        this.nik = nik;
        this.name = name;
        this.phone = phone;
        this.vehicleID = vehicleID;
        this.type = type;
        this.saldo = saldo;
        this.memberType = 2;
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
        System.out.println("\n========== Data Driver ==========");
        System.out.println(
                "\nNama : " + this.name +
                        "\nNIK : " + this.nik +
                        "\nNo Telp : " + this.phone +
                        "\nNomor Kendaraan : " + this.vehicleID +
                        "\nTipe kendaraan : " + this.type +
                        "\nJumlah saldo : " + this.saldo
        );
    }
}