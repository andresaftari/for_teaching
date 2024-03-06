import 'dart:io';
import 'dart:math';

void main() {
  print("Matriks AxB");
  stdout.write("A: ");
  int A = int.parse(stdin.readLineSync() ?? '0');

  stdout.write("B: ");
  int B = int.parse(stdin.readLineSync() ?? '0');

  List<List<int>> matrix = generateMatrix_1302213030(A, B);

  print("Isi matrix:");
  printMatrix_1302213030(matrix);

  print("Hasil transpose:");
  List<List<int>> transposeMatrix = transpose_1302213030(matrix);
  printMatrix_1302213030(transposeMatrix);
}

List<List<int>> generateMatrix_1302213030(int A, int B) {
  Random random = Random();
  List<List<int>> matrix = [];

  for (int i = 0; i < A; i++) {
    List<int> row = [];
    for (int j = 0; j < B; j++) {
      row.add(random.nextInt(100));
    }
    matrix.add(row);
  }

  return matrix;
}

List<List<int>> transpose_1302213030(List<List<int>> matrix) {
  int rows = matrix.length;
  int cols = matrix[0].length;

  List<List<int>> transposeMatrix = [];

  for (int j = 0; j < cols; j++) {
    List<int> row = [];
    for (int i = 0; i < rows; i++) {
      row.add(matrix[i][j]);
    }
    transposeMatrix.add(row);
  }

  return transposeMatrix;
}

void printMatrix_1302213030(List<List<int>> matrix) {
  for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
      stdout.write('${matrix[i][j]} ');
    }
    print("");
  }
}