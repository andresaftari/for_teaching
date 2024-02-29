void cetakGanjil(int angka) {
  for (int i = 0; i <= angka; i++) if (i % 2 == 1) print(i);
}

void main() {
  int angka = 10; // ini nyetak 1 3 5 7 9
  cetakGanjil(angka);
}

void testing() {
  Set<String> satset = Set.from({'Honda', 'Hondi', 'Hondu', 'Hondo'});

  print(satset.isEmpty);
}
