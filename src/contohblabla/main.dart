import 'dart:io';

class BangunDatar {
  String _test = '';
  final double sisi;

  BangunDatar(this.sisi);

  void hitungLuas() {}
}

class PersegiPanjang extends BangunDatar {
  final int panjang;

  PersegiPanjang(super.sisi, this.panjang);

  @override
  void hitungLuas() {
    _test;
    // RUMUS
    return super.hitungLuas();
  }
}

// ENCAPSULATION
void main() {
  // try {
  //   int jawaban = int.parse(stdin.readLineSync()!);
  //   print(jawaban / 0);
  // } catch (e) {
  //   print(e);
  // }

  int jawaban = 2;
  double result = jawaban / 0;

  if (result == double.infinity) {
    throw Exception();
  }
}
