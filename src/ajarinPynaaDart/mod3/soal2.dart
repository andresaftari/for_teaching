// kalo mau pake input, uncomment import ini
// import 'dart:io';

class Balok {
  final int panjang, lebar, tinggi;

  Balok(this.panjang, this.lebar, this.tinggi);

  void hitungLuas() {
    int luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    print('Luas Permukaan : $luas');
  }

  void hitungVolume() {
    int volume = panjang * lebar * tinggi;
    print('Volume : $volume');
  }
}

void main() {
  // Contoh pake input (uncomment 6 baris di bawah)
  // int? p = int.parse(stdin.readLineSync()!);
  // int? l = int.parse(stdin.readLineSync()!);
  // int? t = int.parse(stdin.readLineSync()!);
  
  // Balok balok = Balok(p, l, t);
  // balok.hitungLuas();
  // balok.hitungVolume();

  print('\ncontoh ketika p = 13, l = 7, t = 5');
  Balok balok1 = Balok(13, 7, 5);
  balok1.hitungLuas();
  balok1.hitungVolume();

  print('\ncontoh ketika p = 20, l = 15, t = 7');
  Balok balok2 = Balok(20, 15, 7);
  balok2.hitungLuas();
  balok2.hitungVolume();
}
