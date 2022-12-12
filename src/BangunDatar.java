import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {
        final double pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        String bangunDatar = scanner.nextLine();

        switch (bangunDatar) {
            case "Persegi":
            case "persegi":
                int sisi = scanner.nextInt();
                int luasPersegi = sisi * sisi;
                int kelilingPersegi = 4 * sisi;

                System.out.print(luasPersegi + " " + kelilingPersegi);
                break;

            case "PersegiPanjang":
            case "persegipanjang":
                int panjang = scanner.nextInt();
                int lebar = scanner.nextInt();
                int luasPersegiPanjang = panjang * lebar;
                int kelilingPersegiPanjang = 2 * (panjang + lebar);

                System.out.print(luasPersegiPanjang + " " + kelilingPersegiPanjang);
                break;

            case "Segitiga":
            case "segitiga":
                int alas = scanner.nextInt();
                int tinggi = scanner.nextInt();
                int sisiMiring = (int) Math.sqrt((alas * alas + tinggi * tinggi));
                int luasSegitiga = (alas * tinggi) / 2;
                int kelilingSegitiga = alas + tinggi + sisiMiring;

                System.out.print(luasSegitiga + " " + kelilingSegitiga);
                break;

            case "Lingkaran":
            case "lingkaran":
                int diameter = scanner.nextInt();
                double luasLingkaran = (pi * diameter * diameter) / 4;
                double kelilingLingkaran = pi * diameter;

                System.out.print(luasLingkaran + " " + kelilingLingkaran);
                break;
        }
    }
}