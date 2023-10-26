package pbo.assessment.packb;

public class Gaji {
    private String bulan;
    private int gajiDasar, totalGaji;
    private Tunjangan tunjangan;
    private Bonus bonus;

    public Gaji(String bulan, int gajiDsr) {
        this.bulan = bulan;
        this.gajiDasar = gajiDsr;
    }

    public void setTotalGaji(String level) {
        if (level.equalsIgnoreCase("Junior")) {
            tunjangan = new Tunjangan(0, 0, 0);
            bonus = new Bonus(0, 0);
            gajiDasar = 5000000;
        } else if (level.equalsIgnoreCase("Kadiv")) {
            tunjangan = new Tunjangan(1500000, 1500000, 1000000);
            bonus = new Bonus(500000, 2000000);
            gajiDasar = 5000000;
        } else if (level.equalsIgnoreCase("Manajer")) {
            bonus = new Bonus(500000, 2500000);
            tunjangan = new Tunjangan(2500000, 2000000, 1000000);
            gajiDasar = 5000000;
        } else {
            tunjangan = new Tunjangan(0, 0, 0);
            bonus = new Bonus(0, 0);
            gajiDasar = 0;
        }

        int totalTunjangan = tunjangan.getTnjgnDsr() + tunjangan.getTnjgnJbtn() + tunjangan.getTnjgnKes();
        int totalBonus = bonus.getBnsThn() + bonus.getThr();
        totalGaji = gajiDasar + totalTunjangan + totalBonus;
    }

    @Override
    public String toString() {
        return "Gaji pada bulan = " + bulan + ", gaji dasar = " + gajiDasar + ", total gaji = " + totalGaji;
    }
}
