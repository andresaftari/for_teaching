class Pegawai {
  final int nip;
  final String nama;
  final String jabatan;
  int gaji = 0;

  Pegawai(this.nip, this.nama, this.jabatan) {
    if (jabatan == 'Manager') {
      this.gaji = 8000000;
    } else if (jabatan == 'Kadiv') {
      this.gaji = 6500000;
    } else if (jabatan == 'Junior') {
      this.gaji = 4000000;
    }
  }

  @override
  String toString() {
    return 'NIP : $nip\nNama  :$nama\nJabatan : $jabatan\nGaji  : Rp. $gaji\n';
  }
}

void main() {
  Pegawai manajer = Pegawai(101, 'Naruto', 'Manager');
  print(manajer);

  Pegawai kadiv = Pegawai(102, 'Sasuke', 'Kadiv');
  print(kadiv);

  Pegawai junior = Pegawai(103, 'Sakura', 'Junior');
  print(junior);
}