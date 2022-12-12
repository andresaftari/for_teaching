import java.util.Scanner;

public class Penghasilan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penghasilan = scanner.nextInt();
        double pajak = 0.0;

        if (penghasilan >= 0 && penghasilan <= 50) {
            pajak = 0.05;
        } else if (penghasilan >= 51 && penghasilan <= 250) {
            pajak = 0.15;
        } else if (penghasilan >= 251 && penghasilan <= 500) {
            pajak = 0.25;
        } else if (penghasilan > 500) {
            pajak = 0.30;
        }

        int potonganPajak = (int) (penghasilan * pajak * 1000000);
        int penghasilanBersih = (penghasilan * 1000000) - potonganPajak;

        System.out.println("Penghasilan kotor = " + penghasilan + " juta Rupiah");
        System.out.println("Pajak " + (int) (pajak * 100) + "% = " + potonganPajak);
        System.out.println("Penghasilan bersih = " + penghasilanBersih);
    }
}