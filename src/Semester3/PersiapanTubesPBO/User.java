package Semester3.PersiapanTubesPBO;

public class User {
    private final String user_name;
    private String user_address;
    private String user_phone;
    private String user_type;
    private int order_code;
    private int id;
    private double saldo;

    public User(String user_name, String user_address, String user_phone, String user_type, double saldo) {
        this.id = 0;
        this.order_code = 0;
        this.user_name = user_name;
        this.user_address = user_address;
        this.user_phone = user_phone;
        this.user_type = user_type;
        this.saldo = saldo;
    }

    public void displayData() {
        System.out.println("\n==== Data User ====" +
                "\nID: " + getId() +
                "\nName: " + getUser_name() +
                "\nAddress: " + getUser_address() +
                "\nPhone: " + getUser_phone() +
                "\nSaldo: " + getSaldo());
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setOrder_code(int order_code) {
        this.order_code = order_code;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_address() {
        return user_address;
    }

    public String getUser_phone() {
        return user_phone;
    }

}