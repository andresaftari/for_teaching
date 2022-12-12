package Semester3.PersiapanTubesPBO;

import java.util.ArrayList;

public class Foodiez {
    private final Transaction transaction = new Transaction();
    private final ArrayList<User> userList = new ArrayList<>();
    private final ArrayList<Product> productList = new ArrayList<>();
    private final ArrayList<Integer> productIDList = new ArrayList<>();

    public void showProductDetail() {
        productList.forEach(Product::displayProduct);
    }

    public void showUserDetail() {
        userList.forEach(User::displayData);
    }

    public void addUser(User user) {
        userList.add(user);

        user.setId(userList.size());
    }

    public void addProduct(Product product) {
        productList.add(product);
        productIDList.add(product.getId());

        product.setId(productList.size());
    }

    public void buyProduct(String product, String user, int buyQty) {
        if (productList.isEmpty() || productIDList.isEmpty())
            System.out.println("Seluruh produk sudah habis");
        else {
            productList.forEach(p -> {
                userList.forEach(u -> {
                    if (user.equals(u.getUser_name())) {
                        if (p.getProduct_name().equals(product)) {
                            int ordercode = this.transaction.getOrder_code();

                            u.setOrder_code(ordercode);
                            p.setOrder_code(ordercode);

                            u.setSaldo(u.getSaldo() - (p.getProduct_price() * buyQty));
                            p.setProduct_qty(p.getProduct_qty() - buyQty);
                        }
                    } else if (p.getProduct_qty() == 0 || p.getIsAvailable() == 0) {
                        System.out.println("Produk sudah habis");
                    } else {
                        System.out.println("Cek kembali data user ataupun produk");
                    }
                });
            });

            productList.forEach(it -> {
                if (it.getProduct_qty() == 0) {
                    it.setIs_available(0);
                }
            });
        }
    }

    private void getOrderList() {
        getProductList().forEach(Product::displayOrder);
    }

    public void displayBilling(User user) {
        System.out.println("\nStruk Transaksi" +
                "\nOrder Code: " + transaction.getOrder_code() +
                "\nOrder Name: " + user.getUser_name() +
                "\nList Order: ");
        getOrderList();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public ArrayList<Integer> getProductIDList() {
        return productIDList;
    }
}
