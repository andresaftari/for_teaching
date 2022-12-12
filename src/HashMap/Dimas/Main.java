package HashMap.Dimas;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Map<Mahasiswa, Integer> halo = new HashMap<>();
	    Scanner scanner = new Scanner(System.in);
	    do {
            System.out.println("1.Tambah Mahasiswa\n2.Hapus Mahasiswa\n3.Tampilkan Nilai Mahasiswa\n4.Tampilkan Nilai\n5.Exit");
            int pilih = scanner.nextInt();
            int tambah = 0;
            switch (pilih) {
                case 1:
                    System.out.println("Tambah Mahasiswa");
                    System.out.println("-----------------------------------------------------------");
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.next();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = scanner.next();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.next();
                    System.out.print("Masukkan Nilai: ");
                    int nilai = scanner.nextInt();
                    halo.put(new Mahasiswa(nim,kelas,nama), nilai);
                    System.out.println();
                    System.out.println("Data Berhasil Ditambahkan");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Hapus Mahasiswa");
                    System.out.println("-----------------------------------------------------------");
                    Iterator<Map.Entry<Mahasiswa, Integer>> iterator = halo.entrySet().iterator();
                    Set namahapus = halo.entrySet();
                    if (halo.isEmpty()) {
                        System.out.println("Tidak ada data yang dapat di hapus!");
                    }
                    else {
                        iterator.next();
                        iterator.remove();
                        System.out.println("Data "+namahapus+ " Berhasil Dihapus");
                    }
                    System.out.println("-----------------------------------------------------------");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Tampilkan Nilai Mahasiswa");
                    System.out.println("-----------------------------------------------------------");
                    Set values = halo.entrySet();
                    for (Object v: values) {
                        String b = v.toString();
                        String c = b.substring(48);
                        String ganti = c.replace("'","").replace("}"," dengan nilai ").replace("=","");
                        System.out.println(ganti);
                    }
                    System.out.println("-----------------------------------------------------------");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Rata-Rata Keseluruhan Nilai Mahasiswa");
                    System.out.println("-----------------------------------------------------------");
                    Set keys = halo.keySet();
                    for (Object key: keys) {
                        int baru = halo.get(key);
                        tambah += baru;
                    }
                    if (tambah == 0) {
                        System.out.println("Data Mahasiswa Kosong!");
                    }
                    else {
                        int rata = tambah / halo.size();
                        System.out.println("Rata-Rata Seluruh Nilai Mahasiswa: "+rata);
                    }
                    System.out.println("-----------------------------------------------------------");
                    System.out.println();
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
