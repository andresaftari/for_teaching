void main() {
  // Tipe Data 1: Dynamic
  // var hello = 'Hello';

  // Tipe Data 2: Primitive
  // String str = 'Yang Biasa';
  // int angka = 10;
  // double desimal = 2.5;
  // bool isBool = true;

  // Tipe Data 3: Nullable atau Null Safety
  // String? nullable = null;
  // nullable = 'Okay';

  // Percabangan
  // if (angka == 10) {
  // } else if (angka == 1) {
  // } else {}

  // Perulangan
  // for (int i = 0; i < 10; i++) {}
  // while (angka >= 10) {}
  // do {} while (angka > 10);

  funcAsync(2, 2).then((value) => print(value));
  print(add(1, 1)); // 2
  subtract(3, 2); // 1
}

// Function
int add(int a, int b) {
  return a + b;
}

void subtract(int a, int b) {
  print(a - b);
}

Future funcAsync(int a, int b) async {
  int hasil = await a + b;
  return hasil;
}
