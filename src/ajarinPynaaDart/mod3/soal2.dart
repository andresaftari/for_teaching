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
  print('\ncontoh ketika p = 13, l = 7, t = 5');
  Balok balok1 = Balok(13, 7, 5);
  balok1.hitungLuas();
  balok1.hitungVolume();

  print('\ncontoh ketika p = 20, l = 15, t = 7');
  Balok balok2 = Balok(20, 15, 7);
  balok2.hitungLuas();
  balok2.hitungVolume();
}
