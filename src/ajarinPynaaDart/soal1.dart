class Mahasiswa {
  String nim;
  String nama;

  Mahasiswa(this.nama, this.nim);
}

class Segitiga {
  int alas;
  int tinggi;

  Segitiga(this.alas, this.tinggi);

  void hitungLuas() {
    double luas = (this.alas * this.tinggi) / 2;

    print('Alas: $alas, tinggi $tinggi, luas: ${luas.toInt()}');
  }
}

void main() {
  // Soal 1
  Mahasiswa mhs1 = Mahasiswa('Agus', '14045');
  print('Halo, nama saya ${mhs1.nama} dengan nim ${mhs1.nim}');

  // Soal 2
  Segitiga segitiga = Segitiga(10, 20);
  segitiga.hitungLuas();
}
