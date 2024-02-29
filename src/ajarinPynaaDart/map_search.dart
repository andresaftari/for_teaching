import 'dart:io';

void main() {
  var users = {
    'john': ['john@gmail.com', 1234],
    'alice': ['alice@gmail.com', 4321],
    'bob': ['bob@gmail.com', 5555]
  };

  String? username = stdin.readLineSync();
  String? password = stdin.readLineSync();

  if (users.containsKey(username)) {
    if (password == users[username]![1].toString()) {
      print('berhasil');
    } else {
      print('username dan password salah');
    }
  } else {
      print('Username dan password salah');
    }
}
