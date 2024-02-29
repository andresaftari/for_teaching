void main() {
  testingMap();
}

void testingSet() {
  Set<String> setMotor = Set.from({'Honda', 'Yamaha', 'Suzuki', 'Hondo'});

  print(setMotor.isEmpty);
  setMotor.remove('Honda');
  setMotor.add('Kymco');
  print(setMotor);
}

void testingMap() {
  Map<String, int> gifts = {
    'first': 1,
    'second': 2,
    'fifth': 5,
  };

  print(gifts['fifth']);
  print(gifts.containsKey('fourth'));
}
