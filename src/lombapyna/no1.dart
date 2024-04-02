import "dart:io";

void main() {
  // No. 1
  print('Nama: ');
  String nama = stdin.readLineSync()!;
  print('Umur: ');
  int umur = int.parse(stdin.readLineSync()!);
  print('Kampus: ');
  String kampus = stdin.readLineSync()!;
  print('Jurusan: ');
  String jurusan = stdin.readLineSync()!;

  print('\n==============');
  print('Biodata CR Youth');
  print('==============');

  print('Nama: ${nama}');
  print('Umur: ${umur}');
  print('Kampus: ${kampus}');
  print('Jurusan: ${jurusan}');

  print('==============');
}
