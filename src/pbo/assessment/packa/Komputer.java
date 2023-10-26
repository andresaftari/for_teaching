package pbo.assessment.packa;

public class Komputer {
    private String merk, tipe;
    private int harga;
    private Mouse mouse;
    private Keyboard keyboard;

    public Komputer(String merk, String tipe, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    public void addKomponen(Mouse mouse, Keyboard keyboard) {
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public int getHarga() {
        return harga;
    }

    public int getHargaKomponen() {
        return mouse.getHarga() + keyboard.getHarga();
    }

    public void showAssetKomputer() {
        System.out.println("  - Keyboard : " + keyboard.getMerk()
                + " " + keyboard.getSeri()
                + " (Ryo " + keyboard.getHarga() + ")"
        );
        System.out.println("  - Mouse : " + mouse.getMerk()
                + " " + mouse.getSeri()
                + " (Ryo " + mouse.getHarga() + ")"
        );
    }
}
