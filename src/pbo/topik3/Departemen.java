package pbo.topik3;

import java.util.ArrayList;

public class Departemen {
    ArrayList<Pegawai> listPegawai = new ArrayList<>();

    public void inputPegawai(Pegawai pegawai) {
        // CHALLENGE: Buat IF-ELSE, untuk filter, dimana kalau ada pegawai yang
        // id-nya sama, maka tidak akan terinput
        listPegawai.add(pegawai);
    }

    public void editPegawai(String idSearch, Pegawai pegawaiBaru) {
        for (Pegawai pegawai : listPegawai) {
            if (pegawai.getId().equals(idSearch)) {
                // Gunakan pegawai.set... untuk melakukan perubahan dari input
                // pegawaiBaru, contoh:
                pegawai.setNama(pegawaiBaru.getNama());
                // CHALLENGE: Buat IF-ELSE, apabila input di field pegawaiBaru
                // diisi kosong atau "" sehingga dapat memilih apa saja yang
                // akan diupdate
            }
        }
    }
    
    public void displayAllPegawai() {
        // Gunakan for loop atau foreach untuk menampilkan seluruh data pegawai
    }
    
    public void displayPegawaiPerDept() {
        for (Pegawai p : listPegawai) {
            // Misalkan departemen dibagi menjadi 3: IT, Finance, Marketing
            // maka buat 3 IF yang menampilkannya, contoh:
            
            if (p.getDept().equalsIgnoreCase("IT")) {
                // Print seluruh Dept IT
            }
        }
    }
    
    public void displayWithRangeGaji(int range) {
         for (Pegawai p : listPegawai) {
             System.out.println("Menampilkan karyawan di atas gaji: " + range);
             
             // Buat IF yang apabila gaji > range maka ditampilkan
             if (p.getGaji() > range) {
                 System.out.println(p);
             }
        }
    }
}
