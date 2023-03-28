import java.util.LinkedList;
import java.util.Scanner;

public class Cobaaa {
    private final static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opsi;
        do {
            System.out.println("\n1. Input\n2. Exit\n");
            opsi = sc.nextInt();

            switch (opsi) {
                case 1:
                    System.out.println("Input data :");
                    insert(sc.nextInt());
                    list.forEach(it -> System.out.print(it + " "));
                    break;
                case 2:
                    System.out.println("Bye!");
                    System.exit(0);
                default:
                    System.out.println("Gada Input Itu!");
            }
        } while (true);
    }

    private static void insert(Integer newNum) {
        if (list.size() == 0) {
            list.add(newNum);
        } else {
            list.add(newNum);

            int temp;
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size() - i - 1; j++) {
                    if (list.get(j + 1).compareTo(list.get(j)) > 0) {
                        temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        }
    }
}
