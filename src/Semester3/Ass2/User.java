package Semester3.Ass2;/*
 * Merupakan SuperClass yang akan diturunkan ke 2 SubClass, yaitu class Admin dan Customer
 * Menyimpan data umum User dan diextend untuk menyimpan data khusus anak kelasnya
 */

public abstract class User { // Menjadi class sebagai abstract class (bagian dari konsep OOP, yaitu abstraction)
    /*
     * Menggunakan protected variable agar dapat digunakan oleh SubClass (kelas turunan yang meng-extend)
     */
    protected String username, memberType, email, fullname;
    protected int uid;

    /*
     * Merupakan konstruktor SuperClass yang akan diturunkan
     */
    public User(int uid, String username, String email, String fullname, String memberType) {
        this.username = username;
        this.memberType = memberType;
        this.email = email;
        this.fullname = fullname;
        this.uid = uid;
    }

    /*
     * Merupakan default method yang dapat diturunkan
     */
    public void kurangSaldo(int jumlah) {
    }

    /*
     * Merupakan abstract method yang akan diturunkan
     */
    protected abstract void displayInfo();
}