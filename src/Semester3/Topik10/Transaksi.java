package Semester3.Topik10;

import java.util.ArrayList;
import java.util.Comparator;

public class Transaksi {
    private final ArrayList<Member> memberList = new ArrayList<>();
    private final String tanggalTransaksi;

    public Transaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void addMember(Member member) {
        getMemberList().add(member);
    }

    public void displayMembersSortByName() {
        NameComparator comparator = new NameComparator();
        memberList.sort(comparator);

        getMemberList().forEach(Member::display);
    }

    public void displayMembersSortBySaldo() {
        SaldoComparator comparator = new SaldoComparator();
        memberList.sort(comparator);

        getMemberList().forEach(Member::display);
    }

    public void displayMemberWithoutSorting() {
        getMemberList().forEach(Member::display);
    }

    public void topupSaldo(String customerName, String driverName, int saldo) {
        getMemberList().forEach(member -> {
            if (member.getName().equalsIgnoreCase(customerName)) {
                if (member.getSaldo() >= saldo) {

                    getMemberList().forEach(it -> {
                        if (it.getName().equalsIgnoreCase(customerName)) it.tambahSaldo(saldo);
                        else if (it.getName().equalsIgnoreCase(driverName)) it.kurangSaldo(saldo);
                    });

                    System.out.println("\nTanggal transaksi : " + getTanggalTransaksi());
                    System.out.println("Terima kasih " + customerName
                            + "! Transaksi topup sebesar Rp" + saldo
                            + " melalui driver " + driverName + " berhasil!"
                    );
                } else {
                    System.out.println("Saldo driver tidak cukup!");
                }
            }
        });
    }

    public void pickupService(String customerName, String driverName, int ongkos) {
        getMemberList().forEach(member -> {
            if (member.getName().equalsIgnoreCase(driverName)) {
                if (member.getSaldo() >= ongkos) {

                    getMemberList().forEach(it -> {
                        if (it.getName().equalsIgnoreCase(customerName)) it.kurangSaldo(ongkos);
                        else if (it.getName().equalsIgnoreCase(driverName)) it.tambahSaldo(ongkos);
                    });

                    System.out.println("\nTanggal transaksi : " + getTanggalTransaksi());
                    System.out.println("Transaksi " + customerName + " sebesar Rp." + ongkos + " berhasil!");
                } else {
                    System.out.println("Saldo customer tidak cukup!");
                }
            }
        });
    }
}

class NameComparator implements Comparator<Member> {
    @Override
    public int compare(Member member1, Member member2) {
        return member1.getName().compareTo(member2.getName());
    }
}

class SaldoComparator implements Comparator<Member> {
    @Override
    public int compare(Member member1, Member member2) {
        return member2.getSaldo().compareTo(member1.getSaldo());
    }
}