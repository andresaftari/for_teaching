package Semester3.Ass2;/*
 * Bakery.java ini adalah Concrete Class, yaitu asli yang akan menjadi pusat transaksi/pertukaran data.
 * Selain itu, ini adalah object asli yang akan melakukan proses pengelolaan data secara C-R-U-D
 */

import java.util.ArrayList;
import java.util.Comparator;

public class Bakery {
    /*
     * Menggunakan private final sebagai bentuk encapsulation
     */
    private final ArrayList<User> listUser = new ArrayList<>();
    private final ArrayList<Product> listProduct = new ArrayList<>();

    /*
     * Method addUser() sebagai method untuk menambahkan User
     */
    public void addUser(User user) {
        this.getListUser().add(user);
    }

    /*
     * Method addProduct() sebagai method untuk menambahkan Product
     */
    public void addProduct(Product product) {
        this.getListProduct().add(product);
    }

    /*
     * Method editProduct() sebagai method untuk mengubah data Product dengan parameter input productName dan data edit product
     */
    public void editProduct(String productName, Product product) {
        int index = this.getListProduct().size() - 1;

        /*
         * Inline (Lambda) foreach untuk mengedit data product yang dicari berdasarkan namanya
         */
        this.getListProduct().forEach(it -> {
            if (productName.equalsIgnoreCase(getListProduct().get(index).nama)) getListProduct().set(index, product);
        });
    }

    /*
     * Method displayUsers() sebagai method untuk menampilkan data
     */
    public void displayUsers() {
        if (this.getListUser().isEmpty()) System.out.println("Tidak ada user yang terdaftar!"); // Exception pada saat listUser kosong
        else {
            System.out.println("\n=========== Data Admin ===========");

            /*
             * Lambda foreach untuk menampilkan data User yang memiliki tipe member sebagai Admin
             */
            this.getListUser()
                    .stream()
                    .filter(it -> it.memberType.equalsIgnoreCase("Admin"))
                    .forEach(User::displayInfo);

            /*
             * Lambda foreach untuk menampilkan data User yang memiliki tipe member sebagai Customer
             */
            System.out.println("\n=========== Data Customer ===========");
            this.getListUser()
                    .stream()
                    .filter(it -> it.memberType.equalsIgnoreCase("Customer"))
                    .forEach(User::displayInfo);
        }
    }

    /*
     * Method displayProducts() sebagai method untuk menampilkan data
     */
    public void displayProducts() {
        if (this.getListProduct().isEmpty()) System.out.println("Stok produk kosong!"); // Exception pada saat listUser kosong
        else {
            /*
             * Lambda foreach untuk menampilkan data Product yang memiliki tipe member sebagai Roti
             */
            System.out.println("\n=========== Roti ===========");
            this.getListProduct()
                    .stream()
                    .filter(it -> it.type.equals("Roti"))
                    .forEach(Product::displayInfo);

            /*
             * Lambda foreach untuk menampilkan data Product yang memiliki tipe member sebagai Pastry
             */
            System.out.println("\n=========== Pastry ===========");
            this.getListProduct()
                    .stream()
                    .filter(it -> it.type.equals("Pastry"))
                    .forEach(Product::displayInfo);

            /*
             * Lambda foreach untuk menampilkan data Product yang memiliki tipe member sebagai Donut
             */
            System.out.println("\n=========== Donut ===========");
            this.getListProduct()
                    .stream()
                    .filter(it -> it.type.equals("Donut"))
                    .forEach(Product::displayInfo);
        }
    }

    /*
     * Method displayUserByUsername() sebagai method untuk menampilkan data
     */
    public void displayUserByUsername() {
        UserComparator comparator = new UserComparator();
        this.getListUser().sort(comparator);

        displayUsers();
    }

    /*
     * Method displayProductByName() sebagai method untuk menampilkan data
     */
    public void displayProductByName() {
        ProductComparator comparator = new ProductComparator();
        this.getListProduct().sort(comparator);

        displayProducts();
    }

    /*
     * Method buyProduct() sebagai method untuk beli produk dengan logika Customer yang membeli akan berkurang saldonya,
     * produk yang dibeli akan berkurang stoknya, dan apabila stoknya sudah mencapai 0 maka statusnya berubah menjadi
     * stok "Habis"
     */
    public void buyProduct(String username, String productname, int qty) {
        /*
         * Lambda foreach untuk mencari Customer dengan username yang dicari
         */
        this.getListUser().forEach(it -> {
            if (it.username.equals(username)) {
                /*
                 * Lambda foreach untuk mencari Product dengan nama yang dicari
                 */
                this.getListProduct().forEach(item -> {

                    if (item.nama.equals(productname)) {
                        /*
                         * Apabila Product tersebut sudah ditemukan, lakukan pengurangan saldo Customer menggunakan
                         * harga produk tersebut, lalu kurangi juga stok Product
                         */
                        it.kurangSaldo(item.harga);
                        item.kurangQty(qty);

                        System.out.println("Transaksi oleh " + it.username + " berhasil!");
                    }

                    if (item.qty == 0) {
                        item.isAvailable = "Habis"; // Apabila stok produk sudah mencapai 0, ubah statusnya menjadi "Habis"
                    }
                });
            } else System.out.println("Cek kembali username Anda!");
        });
    }

    /*
     * Method deleteProduct() sebagai method untuk menghapus data Product
     */
    public void deleteProduct(String productName) {
        if (getListProduct().isEmpty()) System.out.println("Stok produk kosong!"); // Exception pada saat listProduct kosong
        else this.getListProduct().removeIf(it -> it.nama.equalsIgnoreCase(productName)); // Lambda foreach untuk menghapus element listProduct yang memiliki nama sesuai yang dicari
    }

    public ArrayList<User> getListUser() {
        return listUser;
    }

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }
}

/*
 * Utility Class ProductComparator sebagai alat untuk sorting Product
 */
class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product1.nama.compareTo(product2.nama);
    }
}

/*
 * Utility Class UserComparator sebagai alat untuk sorting User
 */
class UserComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return user1.username.compareTo(user2.username);
    }
}