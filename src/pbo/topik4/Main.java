package pbo.topik4;

public class Main {
    public static void main(String[] args) {
        // Buat objek hospital
        Hospital hospital = new Hospital(
                1,
                "Mayapada",
                // Array dan objek nurse dibuat di dalam hospital karena ini adalah komposisi
                new Nurse[]{
                        new Nurse(1, "Nurse A"),
                        new Nurse(2, "Nurse B"),
                        new Nurse(3, "Nurse C")
                }
        );

        // Print semua nurses
        for (Nurse nurse : hospital.getNurses()) {
            System.out.println(nurse);
        }
    }
}
