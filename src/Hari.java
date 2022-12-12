import java.util.Scanner;

public class Hari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hari ini hari Minggu, hari ke N yang mau dicari : ");
        int hari = scanner.nextInt();

        int modulusHari = hari % 7;
        modulusHari += hari;

        switch (modulusHari) {
            case 1:
                System.out.println("Minggu");
                break;

            case 2:
                System.out.println("Senin");
                break;

            case 3:
                System.out.println("Selasa");
                break;

            case 4:
                System.out.println("Rabu");
                break;

            case 5:
                System.out.println("Kamis");
                break;

            case 6:
                System.out.println("Jumat");
                break;

            case 0:
                System.out.println("Sabtu");
                break;
        }
    }
}
