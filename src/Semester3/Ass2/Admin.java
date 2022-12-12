package Semester3.Ass2;/*
* Merupakan SubClass yang meng-extends abstract class User
*/

public class Admin extends User {
    private final String authToken; // Menggunakan private final sebagai bentuk encapsulation

    /*
    * Diturunkan dari konstruktor SuperClass-nya, yaitu abstract class User
    */
    public Admin(int uid, String username, String email, String fullname, String memberType, String authToken) {
        super(uid, username, email, fullname, memberType);
        this.uid = uid;
        this.username = username;
        this.email = email;
        this.fullname = fullname;
        this.memberType = memberType;
        this.authToken = authToken;
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
                        "\nAuthorization Token: " + this.authToken
        );
    }
}