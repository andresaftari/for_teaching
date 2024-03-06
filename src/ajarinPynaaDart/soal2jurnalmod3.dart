import 'dart:io';

List listUtama = [];
List list1 = [], list2 = [], list3 = [], list4 = [];

void main() {
  for (int i = 1; i <= 3; i++) {
    list1.add(i * 5);
  }

  for (int i = 2; i <= 8; i++) {
    if (i % 2 == 0) list2.add(i);
  }

  for (int i = 1; i <= 5; i++) {
    list3.add(i * i);
  }

  for (int i = 3; i <= 8; i++) {
    list4.add(i);
  }

  listUtama.add(list1);
  listUtama.add(list2);
  listUtama.add(list3);
  listUtama.add(list4);

  print('Isi List');
  print(list1);
  print(list2);
  print(list3);
  print(list4);

  print('Bilangan yang dicari: ');
  int? angka = int.parse(stdin.readLineSync()!);

  print('$angka berada di: ');
  for (int i = 0; i < listUtama.length; i++) {
    for (int j = 0; j < listUtama[i].length; j++) {
      if (listUtama[i][j] == angka) print('baris ${i + 1} kolom ${j + 1}');
    }
  }
}
