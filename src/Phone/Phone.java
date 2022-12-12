package Phone;

public class Phone {
    String nomor, nama;

    public Phone(String nomor, String nama) {
        this.nomor = nomor;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "nomor='" + nomor + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }
}
