public class SegitigaForloop {
    public static void main(String[] args) {
        triangle(5); // tentuin jumlah baris segitiganya
    }

    private static void triangle(int x) {
        // space = jumlah spasi (tiap baris harus ngurang 1)
        int space = x -1;
        // for loop untuk jumlah baris
        for (int i = 0; i < x; i++) {
            // for loop untuk mencetak spasi
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space -= 1;

            // for loop untuk mencetak *
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
