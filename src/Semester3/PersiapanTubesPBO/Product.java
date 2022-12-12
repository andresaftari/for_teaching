package Semester3.PersiapanTubesPBO;

public class Product {
    private int id, product_qty, is_available, order_code;
    private double product_price;
    private String product_name, product_desc;

    public Product(int product_qty, int is_available, double product_price, String product_name, String product_desc) {
        this.id = 0;
        this.order_code = 0;
        this.product_qty = product_qty;
        this.is_available = is_available;
        this.product_price = product_price;
        this.product_name = product_name;
        this.product_desc = product_desc;
    }

    public void displayProduct() {
        System.out.println("\n==== Data Product ====" +
                "\nID: " + getId() +
                "\nName: " + getProduct_name() +
                "\nDescription: " + getProduct_desc() +
                "\nPrice: " + getProduct_price() +
                "\nStatus: " + getIs_available() +
                "\nSisa stok: " + getProduct_qty());
    }

    public void displayOrder() {
        System.out.println("\nNama Produk: " + getProduct_name() +
                "\nPrice: " + getProduct_price() +
                "\nQuantity: " + getProduct_qty());
    }

    public int getOrder_code() {
        return order_code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIs_available(int is_available) {
        this.is_available = is_available;
    }

    public void setOrder_code(int order_code) {
        this.order_code = order_code;
    }

    public int getId() {
        return id;
    }

    public int getProduct_qty() {
        return product_qty;
    }

    public void setProduct_qty(int product_qty) {
        this.product_qty = product_qty;
    }

    public int getIsAvailable() {
        return is_available;
    }

    public String getIs_available() {
        String status = "";

        if (this.is_available == 1) status = "Ready";
        else if (this.is_available == 2) status = "Coming Soon";
        else if (this.is_available == 0) status = "Kosong";

        return status;
    }

    public double getProduct_price() {
        return product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_desc() {
        return product_desc;
    }
}
