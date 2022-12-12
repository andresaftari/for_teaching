package HashMap.PunyaCaul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    Map<Mahasiswa, Integer> mapFunc = new HashMap<>();
    Mahasiswa[] mahasiswa;
    int arrayFill = 0;
    int startIterator = 0;

    public static void main(String[] args) throws IOException {
        Main func = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pilihan, nilai;
        String nama, nim, kelas;

        System.out.println("Berapa panjang Array yang kamu inginkan ? ");
        int arrayLen = Integer.parseInt(br.readLine());
        func.mahasiswa = new Mahasiswa[arrayLen];

        do {
            System.out.println("1.Input Data\n 2.Show Data Dengan Rata Rata Nilai\n 3.Delete Data\n 4.Show All\n 5.Show Data Berdasarkan Nilai\n 6.Exit");
            pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    if (func.arrayFill < func.mahasiswa.length) {
                        System.out.print("Masukkan Nama : ");
                        nama = br.readLine();
                        System.out.print("Masukkan NIM : ");
                        nim = br.readLine();
                        System.out.print("Masukkan Kelas : ");
                        kelas = br.readLine();
                        System.out.println("Masukkan Nilai : ");
                        nilai = Integer.parseInt(br.readLine());

                        func.addData(nama, nim, kelas, nilai);
                        System.out.println("Masukkan Data Dari " + nama + " berhasil ditambahkan");
                        func.arrayFill++;
                    } else System.out.println("Penuh");
                    break;

                case 2:
                    int jumlahNilai = 0;
                    int jumlahMahasiswa = 0;

                    if (func.arrayFill != 0) func.showData(jumlahNilai, jumlahMahasiswa);
                    else System.out.println("Tidak Ada Data");
                    break;
                case 3:
                    if (func.arrayFill != 0) {
                        System.out.print("NIM yang akan dihapus : ");
                        int nimDelete = Integer.parseInt(br.readLine());
                        func.deleteData(nimDelete);
                    } else System.out.println("Tidak Ada Data");
                    break;
                case 4:
                    if (func.arrayFill != 0)
                        for (Map.Entry<Mahasiswa, Integer> entry : func.mapFunc.entrySet())
                            System.out.println(entry.getKey());
                    else System.out.println("Tidak Ada Data");
                    break;
                case 5:
                    if (func.arrayFill != 0) {
                        int num = 1;
                        for (Map.Entry<Mahasiswa, Integer> entry : func.mapFunc.entrySet())
                            System.out.println("Nilai Mahasiswa " + num + " : " + entry.getValue());

                    } else System.out.println("Tidak Ada Data");
                    break;
                case 6:
                    System.out.print("Selesai");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Inputan Salah");
            }
        } while (true);
    }

    void addData(String nama, String nim, String kelas, int nilai) {
        boolean findEmpty = true;
        while (findEmpty) {
            if (mahasiswa[startIterator % mahasiswa.length] == null) {
                mahasiswa[startIterator % mahasiswa.length] = new Mahasiswa(nama, nim, kelas);
                mapFunc.put(mahasiswa[startIterator % mahasiswa.length], nilai);
                findEmpty = false;
            }
            startIterator++;
        }
    }

    void showData(int jumlahSemua, int total) {
        for (int i = 0; i < mahasiswa.length; i++)
            if (mahasiswa[i] != null) {
                jumlahSemua += mapFunc.get(mahasiswa[i]);
                int IDBaru = i + 1;
                System.out.println("Data Nomor Mahasiswa : " + IDBaru);
                System.out.println("Name : " + mahasiswa[i].getNama() + "\n"
                        + "NIM : " + mahasiswa[i].getNim() + "\n"
                        + "Kelas : " + mahasiswa[i].getKelas() + "\n"
                        + "Nilai : " + mapFunc.get(mahasiswa[i]));
                total++;
            }
        double average = jumlahSemua / (double) total;
        System.out.println("Average score " + average);
    }

    void deleteData(int idToDelete) {
        if (mahasiswa[idToDelete - 1] != null) {
            mapFunc.remove(mahasiswa[idToDelete - 1]);
            mahasiswa[idToDelete - 1] = null;
            System.out.println("Data deletion successful");
            arrayFill--;
        } else System.out.println("No data");
    }
}
