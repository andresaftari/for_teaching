import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sekarang lampu apa?");
        String lampu = scanner.next();

        switch (lampu) {
            case "Merah":
                System.out.println("Anda harus berhenti!");
                break;

            case "Hijau":
                System.out.println("Anda bisa jalan!");
                break;

            case "Kuning":
                System.out.println("Siap-siap!");
                break;

            default:
                System.out.println("Gak ada lampu " + lampu + " bambank!");
        }
    }
}
