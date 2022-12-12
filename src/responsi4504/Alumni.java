package responsi4504;

public class Alumni extends Mahasiswa {
    private boolean isEkstensi;

    public Alumni(String nim, String nama, boolean isEkstensi) {
        super(nim, nama);
        this.isEkstensi = isEkstensi;
    }

    @Override
    public void display() {
        System.out.println("Alumni " + super.nama + 
        " - Ikut Ekstensi? " + this.isEkstensi);
    }
}
