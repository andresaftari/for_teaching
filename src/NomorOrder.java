import java.util.Random;

public class NomorOrder {
    public static void main(String[] args) {
        String nomorOrder;

        Random random = new Random();
        nomorOrder = "ORDER" + random.nextInt(1000000);

        System.out.println(nomorOrder);
    }
}