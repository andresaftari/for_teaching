package Inheritence;

// CONTROLLER
public class Departemen {
    Karyawan[] kar = new Karyawan[2];
    private int index = 0;

    public void addKaryawan(Karyawan k) {
        kar[index] = k;
        index++;
        index %= kar.length;
    }

    public void displayTetap() {
        for (Karyawan karyawan : kar) {
            if (karyawan.status == 1) {
                karyawan.display();
            }
        } // Forloop yang biasa
    }
}
