package Semester3.PersiapanTubesPBO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Foodiez foodiez = new Foodiez();

    public static void main(String[] args) {
        int option;

        try {
            do {
                System.out.print("\nPilihan:" +
                        "\n1. Input produk" +
                        "\n2. Input member" +
                        "\n3. Display produk" +
                        "\n4. Display member" +
                        "\n5. Beli produk" +
                        "\n6. Exit" +
                        "\nOpsi [1-6]: ");

                option = Integer.parseInt(br.readLine());

                switch (option) {
                    case 1:
//                        System.out.print("Input product name: ");
//                        String name = br.readLine();
//                        System.out.print("Input product description: ");
//                        String description = br.readLine();
//                        System.out.print("Input product harga: ");
//                        double price = Double.parseDouble(br.readLine());
//                        System.out.print("Input product quantity: ");
//                        int quantity = Integer.parseInt(br.readLine());
//
//                        foodiez.addProduct(new Product(quantity, 1, price, name, description));

                        dummyProducts();
                        System.out.println("\nData produk berhasil ditambahkan!\n");
                        break;

                    case 2:
                        dummyUser();
                        System.out.println("\nData pengguna berhasil ditambahkan!\n");
                        break;

                    case 3:
                        foodiez.showProductDetail();
                        break;

                    case 4:
                        foodiez.showUserDetail();
                        break;

                    case 5:
                        System.out.print("Nama produk yang ingin dibeli: ");
                        String prodName = br.readLine();
                        System.out.print("Nama pembeli: ");
                        String buyerName = br.readLine();
                        System.out.print("Jumlah pembelian: ");
                        int jumlah = Integer.parseInt(br.readLine());

                        foodiez.buyProduct(prodName, buyerName, jumlah);
                        break;

                    case 6:
                        System.exit(0);
                }
            } while (true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void dummyProducts() {
        foodiez.addProduct(new Product(3, 1, 100.00, "Roti", "Enak dan dibakar"));
    }

    private static void dummyUser() {
        foodiez.addUser(new User("Andre", "Bandung", "0838xxxxxx", "Admin", 5000.00));
    }
}