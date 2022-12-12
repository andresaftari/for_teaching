package Semester3.PersiapanTubesPBO;

import java.util.Random;

public class Transaction {
    private int order_code, id_m_user;

    public Transaction() {
    }

    public Transaction(Product product, User user) {
        this.id_m_user = user.getId();
        this.order_code = getOrder_code();
    }

    public int getId_m_user() {
        return id_m_user;
    }

    public int getOrder_code() {
        Random random = new Random();
        order_code = random.nextInt(20000);

        return order_code;
    }
}
