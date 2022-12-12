package Semester3.Ass1;

public class Main {
    public static void main(String[] args) {
        // Input 1 - NORMAL AJA
        MarketPlace mp1 = new MarketPlace(
                1,
                "Andre",
                "Bandung",
                "Dia",
                "Jakarta",
                "JNE",
                "N0001",
                5000.0
        );
        mp1.display();

        // INPUT 2 - NORMAL + ASURANSI
        MarketPlace mp2 = new MarketPlace(
                2,
                "Andre",
                "Bandung",
                "Dia",
                "Jakarta",
                "JNE",
                "N0002",
                5000.0,
                10000.0
        );
        mp2.display();

        // INPUT 3 - NORMAL + DROPSHIPPER
        // mp3 (input nama dan alamat dropshipper jangan lupa)

        // INPUT 4 - NORMAL + ASURANSI + DROPSHIPPER
        // mp4 (input nama dan alamat dropshipper & nominal asuransi jangan lupa)
    }
}
