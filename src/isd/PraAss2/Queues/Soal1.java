package isd.PraAss2.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Soal1 {
    // Queue (FIFO) => Siapa yang duluan, siapa yang dilayani

    // Enqueue (add()) <- selalu di belakang (REAR)
    // Dequeue (poll()) <- selalu di depan (FRONT)
    // peek() <- ngintip yang paling depan siapa?

    private static final Queue<Pelanggan> antrian = new LinkedList<>();
    private static int count;

    public static void main(String[] args) {
        ambilNomor(1,"Rita","Es krim vanilla",10);
        ambilNomor(2,"Adi","Boba gula aren",5);
        ambilNomor(3,"Ika","Es krim vanilla double",4);

        panggilanEs();
        ambilNomor(4,"Fikri","Boba es sedikit",2);
    }

    private static void ambilNomor(
            int nomor,
            String namaPelanggan,
            String namaPesanan,
            int jumlah
    ) {
        Pelanggan pelanggan = new Pelanggan(nomor, namaPelanggan, namaPesanan, jumlah);
        antrian.add(pelanggan);

        if (count > 0) System.out.println("Anda menunggu " + count + " orang lagi");
        count++;
    }

    private static void panggilanEs() {
        Pelanggan pelanggan = panggil();

        if (!antrian.isEmpty()) {
            System.out.println("Nomor " + pelanggan.noPanggilan + " untuk pembelian " + pelanggan.namaPesanan + " sudah siap");
        }
    }

    private static Pelanggan panggil() {
        count--;
        return antrian.poll();
    }
}
