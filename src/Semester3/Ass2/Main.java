package Semester3.Ass2;/*
* Main.java ini adalah driver class, yaitu class testing untuk menjalankan program prototipe aplikasi ini
* Isi dari driver class adalah kumpulan aksi-aksi yang akan digunakan. Contohnya pada kelas ini ada 4 aksi, yaitu
* Create (input user dan produk), Read (display user dan produk), Update (edit produk) dan Delete (delete produk)
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Instansiasi BufferedReader class sebagai alat input
    static Bakery bakery = new Bakery(); // Instansiasi concrete class, yaitu Bakery.java
    static Random random = new Random(); // Instansiasi Random class

    public static void main(String[] args) { // Function main (driver method) yang digunakan untuk menjalankan program
        try {
            System.out.print("\n============= SELAMAT DATANG DI BAKER'S CORNER APP =============\n");

            /*
            * Deklarasikan variable yang akan digunakan berulang-ulang
             */
            int mainOption, memberOption, productOption, typeEdit;
            String memberType, productType;

            /*
            * Gunakan try catch untuk menyaring apabila terjadi kesalahan inputan atau proses kerja aplikasi
             */
            try {
                do { // Gunakan do-while untuk membuat menu utama melakukan looping sampai program di-exit dengan opsi 10
                    System.out.print(
                            "\nOpsi transaksi : " +
                                    "\n1. Daftar sebagai member" +
                                    "\n2. Daftarkan produk baru" +
                                    "\n3. Tampilkan seluruh produk" +
                                    "\n4. Tampilkan seluruh member" +
                                    "\n5. Tampilkan seluruh produk diurutkan berdasarkan nama" +
                                    "\n6. Tampilkan seluruh member diurutkan berdasarkan username" +
                                    "\n7. Edit data produk" +
                                    "\n8. Hapus data produk" +
                                    "\n9. Order produk" +
                                    "\n10. Exit" +
                                    "\nPilihan Anda [1 - 10] : "
                    );
                    mainOption = Integer.parseInt(br.readLine()); // Pilih opsi dari menu utama
                    int uid = Math.abs(random.nextInt()); // Membuat random uid dengan absolute integer value

                    switch (mainOption) {
                        case 1:
                            try {
                                do {
                                    System.out.println("\n=========== Input Member ===========");

                                    /*
                                    * Input data umum User
                                     */
                                    System.out.print("Input nama lengkap : ");
                                    String fullname = br.readLine();
                                    System.out.print("Input username : ");
                                    String username = br.readLine();
                                    System.out.print("Input email : ");
                                    String email = br.readLine();

                                    System.out.print(
                                            "\nPilih jenis akun :" +
                                                    "\n1. Daftar sebagai Admin" +
                                                    "\n2. Daftar sebagai User" +
                                                    "\n3. Kembali ke menu utama" +
                                                    "\nPilihan Anda [1 - 3] : "
                                    );
                                    memberOption = Integer.parseInt(br.readLine()); // Pilih opsi dari menu tambah User

                                    /*
                                    * Melakukan input data khusus Admin atau Customer sesuai pilihan
                                     */
                                    switch (memberOption) {
                                        case 1:
                                            memberType = "Admin"; // Input user type sebagai Admin
                                            String authToken = username + "@administrator"; // Membuat token khusus Admin

                                            /*
                                            * Menambahkan data Admin ke dalam ArrayList<User>
                                             */
                                            bakery.addUser(new Admin(
                                                    uid,
                                                    username,
                                                    email,
                                                    fullname,
                                                    memberType,
                                                    authToken
                                            ));
                                            break;

                                        case 2:
                                            System.out.print("Input alamat : ");
                                            String alamat = br.readLine(); // Input data khusus User (alamat)
                                            System.out.print("Input saldo : ");
                                            int saldo = Integer.parseInt(br.readLine()); // Input data khusus User (saldo)

                                            memberType = "Customer"; // Input user type sebagai Customer

                                            /*
                                             * Menambahkan data Customer ke dalam ArrayList<User>
                                             */
                                            bakery.addUser(new Customer(
                                                    uid,
                                                    username,
                                                    email,
                                                    fullname,
                                                    memberType,
                                                    alamat,
                                                    saldo
                                            ));
                                            break;

                                        case 3: // Apabila inputan adalah 3, keluar ke menu utama
                                            break;
                                    }
                                } while (memberOption > 3);

                            } catch (ArrayIndexOutOfBoundsException | IOException e) {
                                System.out.println("Failed! " + e.getMessage());
                            }
                            break;

                        case 2:
                            try {
                                do {
                                    System.out.println("\n=========== Input Produk ===========");

                                    /*
                                     * Input data umum Produk
                                     */
                                    System.out.print("Input nama produk : ");
                                    String namaProduk = br.readLine();
                                    System.out.print("Input status ketersediaan (Ada/Habis/Coming soon) : ");
                                    String status = br.readLine();
                                    System.out.print("Input jumlah stok : ");
                                    int jumlahProduk = Integer.parseInt(br.readLine());
                                    System.out.print("Input harga produk : ");
                                    int hargaProduk = Integer.parseInt(br.readLine());

                                    System.out.print(
                                            "\nPilih jenis roti :" +
                                                    "\n1. Roti" +
                                                    "\n2. Pastry" +
                                                    "\n3. Donut" +
                                                    "\n4. Kembali ke menu utama" +
                                                    "\nPilihan Anda [1 - 4] : "
                                    );
                                    productOption = Integer.parseInt(br.readLine()); // Pilih opsi dari menu tambah Produk

                                    /*
                                     * Melakukan input data khusus Roti, Pastry atau Donut sesuai pilihan
                                     */
                                    switch (productOption) {
                                        case 1:
                                            System.out.print("Input rasa : ");
                                            String rasa = br.readLine();  // Input data khusus Roti (rasa)
                                            productType = "Roti"; // Input product type sebagai Roti

                                            /*
                                             * Menambahkan data Roti ke dalam ArrayList<Product>
                                             */
                                            bakery.addProduct(new Roti(
                                                    uid,
                                                    namaProduk,
                                                    productType,
                                                    status,
                                                    jumlahProduk,
                                                    rasa,
                                                    hargaProduk
                                            ));
                                            break;

                                        case 2:
                                            productType = "Pastry"; // Input product type sebagai Pastry

                                            /*
                                             * Menambahkan data Pastry ke dalam ArrayList<Product>
                                             */
                                            bakery.addProduct(new Pastry(
                                                    uid,
                                                    namaProduk,
                                                    productType,
                                                    status,
                                                    jumlahProduk,
                                                    hargaProduk
                                            ));
                                            break;

                                        case 3:
                                            System.out.print("Input status order (Order Langsung/Pre-Order) : ");
                                            String statusOrder = br.readLine(); // Input data khusus Donut (statusOrder)
                                            productType = "Donut"; // Input product type sebagai Donut

                                            /*
                                             * Menambahkan data Donut ke dalam ArrayList<Product>
                                             */
                                            bakery.addProduct(new Donut(
                                                    uid,
                                                    namaProduk,
                                                    productType,
                                                    status,
                                                    jumlahProduk,
                                                    statusOrder,
                                                    hargaProduk
                                            ));
                                            break;

                                        case 4: // Apabila inputan adalah 4, keluar ke menu utama
                                            break;
                                    }
                                } while (productOption > 4);

                            } catch (ArrayIndexOutOfBoundsException | IOException e) {
                                System.out.println("Failed! " + e.getMessage());
                            }
                            break;

                        case 3:
                            bakery.displayProducts(); // Memanggil method displayProducts() dari Class Bakery
                            break;

                        case 4:
                            bakery.displayUsers(); // Memanggil method displayUsers() dari Class Bakery
                            break;

                        case 5:
                            bakery.displayProductByName(); // Memanggil method displayProductByName() dari Class Bakery
                            break;

                        case 6:
                            bakery.displayUserByUsername();  // Memanggil method displayUserByUsername() dari Class Bakery
                            break;

                        case 7:
                            try {
                                if (bakery.getListProduct().isEmpty()) System.out.println("Stok produk kosong!"); // Exception pada saat listProduct di Class Bakery kosong
                                else do {
                                    System.out.print("\nInput nama produk yang akan diedit : ");
                                    String nameToFind = br.readLine(); // Input nama menu yang akan diedit

                                    int uidProduct = 0;

                                    /*
                                     * Mencari uid dari menu yang akan diedit
                                     */
                                    for (Product product : bakery.getListProduct()) {
                                        if (nameToFind.equalsIgnoreCase(product.nama)) {
                                            uidProduct = product.uid;
                                        }
                                    }

                                    /*
                                     * Melakukan input edit data umum produk
                                     */
                                    System.out.print("Edit nama : ");
                                    String nameEdit = br.readLine();
                                    System.out.print("Edit status ketersediaan (Ada/Habis/Coming Soon) : ");
                                    String statusEdit = br.readLine();
                                    System.out.print("Edit jumlah : ");
                                    int qtyEdit = Integer.parseInt(br.readLine());
                                    System.out.print("Edit harga : ");
                                    int priceEdit = Integer.parseInt(br.readLine());

                                    /*
                                     * Melakukan input edit data jenis produk
                                     */
                                    System.out.print(
                                            "\nEdit jenis menu menjadi : " +
                                                    "\n1. Roti" +
                                                    "\n2. Pastry" +
                                                    "\n3. Donut" +
                                                    "\n4. Kembali ke menu utama" +
                                                    "\nPilihan Anda [1 - 4] : ");
                                    typeEdit = Integer.parseInt(br.readLine()); // Input tipe yang akan diedit

                                    switch (typeEdit) {
                                        case 1:
                                            System.out.print("Edit rasa : ");
                                            String flavEdit = br.readLine(); // Edit data khusus Roti (rasa)

                                            /*
                                             * Mengubah data Roti yang ada di dalam ArrayList<Product>
                                             */
                                            bakery.editProduct(nameToFind, new Roti(
                                                    uidProduct,
                                                    nameEdit,
                                                    "Roti",
                                                    statusEdit,
                                                    qtyEdit,
                                                    flavEdit,
                                                    priceEdit
                                            ));
                                            break;

                                        case 2:
                                            /*
                                             * Mengubah data Pastry yang ada di dalam ArrayList<Product>
                                             */
                                            bakery.editProduct(nameToFind, new Pastry(
                                                    uidProduct,
                                                    nameEdit,
                                                    "Pastry",
                                                    statusEdit,
                                                    qtyEdit,
                                                    priceEdit
                                            ));
                                            break;

                                        case 3:
                                            System.out.print("Edit status order (Order Langsung/Pre-Order) : ");
                                            String statusOrderEdit = br.readLine(); // Edit data khusus Donut (statusOrder)

                                            /*
                                             * Mengubah data Donut yang ada di dalam ArrayList<Product>
                                             */
                                            bakery.editProduct(nameToFind, new Roti(
                                                    uidProduct,
                                                    nameEdit,
                                                    "Donut",
                                                    statusEdit,
                                                    qtyEdit,
                                                    statusOrderEdit,
                                                    priceEdit
                                            ));
                                            break;

                                        case 4: // Apabila inputan adalah 4, keluar ke menu utama
                                            break;
                                    }
                                } while (typeEdit > 4);

                            } catch (ArrayIndexOutOfBoundsException | IOException e) {
                                System.out.println("Failed! " + e.getMessage());
                            }
                            break;

                        case 8:
                            try {
                                bakery.displayProducts(); // Memanggil method displayProducts() dari Class Bakery

                                System.out.print("\nInput nama produk yang akan dihapus : ");
                                String nameToDelete = br.readLine(); // Input nama produk yang akan dihapus

                                bakery.deleteProduct(nameToDelete); // Memanggil method deleteProduct() dari Class Bakery dengan parameter nama produk yang akan dihapus
                            } catch (ArrayIndexOutOfBoundsException | IOException e) {
                                System.out.println("Failed! " + e.getMessage());
                            }
                            break;

                        case 9:
                            try {
                                if (bakery.getListUser().isEmpty()) System.out.println("Tidak ada user yang terdaftar!"); // Exception pada saat listUser di Class Bakery kosong
                                else if (bakery.getListProduct().isEmpty()) System.out.println("Stok produk kosong!"); // Exception pada saat listProduct di Class Bakery kosong
                                else {
                                    System.out.print("\nUsername customer yang akan membeli : ");
                                    String username = br.readLine(); // Input nama pembeli

                                    System.out.print("Produk yang akan dibeli : ");
                                    String productname = br.readLine(); // Input nama product yang akan dibeli

                                    System.out.print("Jumlah produk yang akan dibeli : ");
                                    int quantity = Integer.parseInt(br.readLine()); // Input jumlah product yang akan dibeli

                                    bakery.buyProduct(username, productname, quantity); // Memanggil method buyProduct() dari Class Bakery dengan parameter nama pembeli, produk dibeli dan jumlah produknya
                                }
                            } catch (ArrayIndexOutOfBoundsException | IOException e) {
                                System.out.println("Failed! " + e.getMessage());
                            }
                            break;

                        case 10:
                            System.out.println("\n============= TERIMA KASIH ATAS TRANSAKSI ANDA =============\n");
                            System.exit(0); // Exit program
                    }
                } while (true);
            } catch (Exception e) {
                System.out.println("Failed! " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Failed! " + e.getMessage());
        }
    }
}