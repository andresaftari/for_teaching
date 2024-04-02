// No. 2

import 'dart:math';

abstract class BangunDatar {
  void hitungLuas();
  void hitungKeliling();
}

class Persegi extends BangunDatar {
  late int sisi;

  Persegi({required int sisi}) {
    this.sisi = sisi;
  }

  @override
  void hitungKeliling() {
    print('Keliling persegi adalah ${4 * sisi}');
  }

  @override
  void hitungLuas() {
    print('Luas persegi adalah ${sisi * sisi}');
  }
}

class Segitiga extends BangunDatar {
  late double alas;
  late double tinggi;

  Segitiga({required double alas, required double tinggi}) {
    this.alas = alas;
    this.tinggi = tinggi;
  }

  @override
  void hitungKeliling() {
    double pytaghoras = sqrt(pow(alas, 2) + pow(tinggi, 2));
    print('Keliling segitiga adalah ${alas + tinggi + pytaghoras}');
  }

  @override
  void hitungLuas() {
    print('Luas segitiga adalah ${(alas * tinggi) / 2}');
  }
}

class Lingkaran extends BangunDatar {
  final double PI = 3.14;
  late int radius;

  Lingkaran({required int radius}) {
    this.radius = radius;
  }

  @override
  void hitungKeliling() {
    print('Keliling lingkaran adalah ${2 * PI * radius}');
  }

  @override
  void hitungLuas() {
    print('Luas lingkaran adalah ${PI * radius * radius}');
  }
}

void main() {
  // Lingkaran
  Lingkaran lingkaran = Lingkaran(radius: 10);
  lingkaran.hitungKeliling();
  lingkaran.hitungLuas();

  // Persegi
  Persegi persegi = Persegi(sisi: 8);
  persegi.hitungKeliling();
  persegi.hitungLuas();

  // Segitiga
  Segitiga segitiga = Segitiga(alas: 10, tinggi: 5);
  segitiga.hitungKeliling();
  segitiga.hitungLuas();
}
