void main() {
  List dataList = ['1', '2', '3', '2', '1'];
  String res = '';

  dataList.forEach((element) => res += element);
  String reverse = res.split('').reversed.join('');

  print(res == reverse);
}