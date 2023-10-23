# intro
print('Kalkulator Sederhana')

# identitas
print('===========================')
print('NAMA : Prasidya Pramadresana Saftari')
print('NIM : 1301228479')
print('KELAS : IF-45-05')

# input
print('===========================')
input_1 = int(input('Masukkan variable pertama : '))
input_2 = int(input('Masukkan variable kedua : '))

# operasi
print('===========================')
print('1. Tambah')
print('2. Kurang')
print('3. Kali')
print('4. Bagi')

opsi = int(input('Masukkan pilihan : '))

if opsi == 1:
    # setelah penjumlahan, maka program exit
    print('Hasil penjumlahan  = ', input_1 + input_2)
elif opsi == 2:
    # setelah pengurangan, maka program exit
    print('Hasil pengurangan  = ', input_1 - input_2)
elif opsi == 3:
    # setelah pengurangan, maka program exit
    print('Hasil perkalian = ', input_1 * input_2)
elif opsi == 4:
    # setelah pembagian, maka program exit
    print('Hasil pembagian  = ', input_1 / input_2)
else:
    # apabila pilihan lebih dari 4, output opsi gak valid
    print('Pilihan opsi tidak valid')
