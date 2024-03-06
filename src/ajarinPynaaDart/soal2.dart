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
  Segitiga segitiga = Segitiga(10, 20);
  segitiga.hitungLuas();
}
