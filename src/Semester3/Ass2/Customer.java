package Semester3.Ass2;/*
 * Merupakan SubClass yang meng-extends abstract class User
 */

public class Customer extends User {
    /*
    * Menggunakan private final sebagai bentuk encapsulation
    */
    private final String address;
    private int saldo;

    /*
     * Diturunkan dari konstruktor SuperClass-nya, yaitu abstract class User
     */
    public Customer(int uid, String username, String email, String fullname, String memberType, String address, int saldo) {
        super(uid, username, email, fullname, memberType);
        this.uid = uid;
        this.username = username;
        this.fullname = fullname;
        this.memberType = memberType;
        this.address = address;
        this.saldo = saldo;
    }

    /*
     * Diturunkan dari default method SuperClass-nya, sehingga tanpa Overriding ntuk mengurangi saldo
     */
    public void kurangSaldo(int jumlah) {
       if (this.saldo > 0) this.saldo -= jumlah;
       else System.out.println("Saldo tidak cukup!");
    }

    /*
     * Diturunkan dari abstract method SuperClass-nya, sehingga terbentuklah Overriding Method untuk menampilkan data
     */
    @Override
    protected void displayInfo() {
        System.out.println(
                "\nUID : " + this.uid +
                        "\nNama lengkap : " + this.fullname +
                        "\nUsername : " + this.username +
                        "\nEmail : " + this.email +
                        "\nAlamat : " + this.address +
                        "\nSaldo : " + this.saldo
        );
    }
}