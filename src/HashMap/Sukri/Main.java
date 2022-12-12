package HashMap.Sukri;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<Mahasiswa, Integer> mahasiswa = new HashMap<>();
        //Array Object pada java, maximal data yang dapat dimasukkan adalah 10
        Mahasiswa[] key = new Mahasiswa[10];
        //variabel sebagai acuan apakah data atau tidak
        int isi = 0;
        //variabel untuk mengisi index ke-n
        int mulai = 0;
        Scanner input = new Scanner(System.in);
        boolean status = true;
        while (status) {
            System.out.print("pilih menu: \n1.tambah \n2.lihat \n3.hapus \n4.exit \nsilahkan pilih menu (1/2/3): ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    //mengecek apakah data sudah full atau tidak
                    //jika isi kurang dari panjang index Array maka akan masuk menambahkan data
                    if (isi < key.length) {
                        System.out.print("Masukkan NIM : ");
                        String NIM = input.next();
                        System.out.print("Masukkan Kelas : ");
                        String kelas = input.next();
                        System.out.print("Masukkan Nama : ");
                        String nama = input.next();
                        System.out.print("Masukkan Nilai : ");
                        int nilai = input.nextInt();
                        //boolean status agar while berjalan minimal 1x maka harus diset TRUE
                        boolean cari = true;
                        while (cari) {
                            //mencari index yang kosong
                            if (key[mulai % key.length] == null) {
                                //mengisi array yang ditemukan kosong
                                key[mulai % key.length] = new Mahasiswa(NIM, kelas, nama);
                                //menambahkan data ke dalam hashmap
                                //mahasiswa.put(key[mulai % key.length], nilai);
                                //jangan lupa booleannya diset false agar tidak terjadi looping forever
                                cari = false;
                            }
                            //harus diupdate jika array saat ini ada isinya agar bisa mengecek array selanjutnya
                            mulai++;
                        }
                        System.out.println("Data Berhasil Ditambahkan");
                        //harus diupdate jika berhasil ditambahkan
                        isi++;
                    }
                    //jika isi sudah sama besar dengan panjang index Array berarti data sudah penuh
                    else {
                        System.out.println("Data Sudah Penuh");
                    }
                    break;
                case 2:
                    //mengecek apakah isinya lebih dari 0 atau tidak
                    //jika lebih dari 0 berarti ada data yang bisa ditampilkan
                    if (isi > 0) {
                        //variabel untuk menampung total hasil penjumlahan nilai seluruh data
                        int total = 0;
                        //variabel untuk mengetahui jumlah data
                        int jumlah = 0;
                        for (int i = 0; i < key.length; i++) {
                            //hanya menampilkan array yang terisi
                            if (key[i] != null) {
                                total += mahasiswa.get(key[i]);
                                int idData = i + 1;
                                System.out.println("ID Data : " + idData);
                                System.out.println("NIM : " + key[i].getNIM());
                                System.out.println("Kelas : " + key[i].getKelas());
                                System.out.println("Nama : " + key[i].getNama());
                                System.out.println("Nilai : " + mahasiswa.get(key[i]));
                                System.out.println("###############");
                                jumlah++;
                            }
                        }
                        //array untuk menampung hasil rata-rata
                        int result = total / jumlah;
                        System.out.println("total rata-rata nilai : " + result);
                    }
                    //jika isi sama dengan 0 berarti data kosong
                    else {
                        System.out.println("Data Kosong, Silahkan Tambahkan Data");
                    }
                    break;
                case 3:
                    //mengecek apakah isi 0 atau tidak
                    //jika isi = 0 berarti data tidak ada
                    if (isi == 0) {
                        System.out.println("Data Kosong Tidak Ada Yang Bisa Dihapus");
                    } else {
                        System.out.print("Masukkan ID Data : ");
                        int id = input.nextInt();
                        //mengecek apakah id yang menuju index ke-n memiliki isi atau tidak
                        //jika memiliki isi maka akan dilakukan penghapusan data
                        if (key[id - 1] != null) {
                            //menghapus data
                            mahasiswa.remove(key[id - 1]);
                            //menset index ke-n menjadi null agar dianggap data kosong
                            key[id - 1] = null;
                            System.out.println("Data Berhasil Dihapus");
                            //jangan lupa diupdate agar isinya berkurang karena penghapusan data
                            isi--;
                        } else {
                            System.out.println("id tidak ditemukan");
                        }
                    }
                    break;
                case 4:
                    //berfungsi keluar dari while
                    status = false;
                    break;
            }
        }

    }
}
