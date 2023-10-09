package pbo.topik1;

public class Bagian1 {
    final float PI = 3.14f;

    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;

        System.out.println(a + b);
//        System.out.println(volumeBalok(2, 10, 10));
    }

    private static int volumeBalok(int p, int l, int t) {
        return p * l * t;
    }

    private static int lpBalok(int p, int l, int t) {
        return 0;
    }

    private static float volumeBola() {
        return 0.0f;
    }

    private static float lpBola() {
        return 0.0f;
    }
}
