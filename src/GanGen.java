import java.util.Scanner;

public class GanGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variable bilangan ini adalah index kalian (itungnya dari 0) 
        int bilangan = sc.nextInt();

        if (bilangan % 2 == 0) {
            // kalau index nya genap, input ke depan (input ke setelahnya)
            System.out.println("Genap");

        } else {
            // kalau index nya ganjil, input ke belakang (input ke sebelumnya)
            System.out.println("Ganjil");
        }

        for (int i = 0; i < args.length; i++) {
            
        }
    }
}
