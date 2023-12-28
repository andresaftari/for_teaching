package TesCepat;

import java.time.LocalDateTime;

public class SpeedTest {
    public static void main(String[] args) {
        float start = LocalDateTime.now().getNano() / 1000000f;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) System.out.print((i * j) + " ");
            System.out.println();
        }

        float end = LocalDateTime.now().getNano() / 1000000f;
        System.out.println(end - start + " microseconds");
    }
}
