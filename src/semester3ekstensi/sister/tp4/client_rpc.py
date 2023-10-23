import sys
import xmlrpc.client

# Proxy skeleton untuk client IP connection
s = xmlrpc.client.ServerProxy('http://127.0.0.1:8000')

print('========= Welcome to the client app =========')
opsi = 0

while True:
    print('1. Pilih Calon\n2. Lihat Hasil Pemilihan\n3. Exit\nPilih Menu [1 / 2 / 3]: ')
    opsi = int(input())

    if opsi == 1:
        # Tampilkan dulu list kandidat
        print(s.show_candidate_result(1))
        candidate = input('Ketik nama calon yang Anda pilih: ')

        print(s.choose_candidate(candidate))
    elif opsi == 2:
        print(s.show_candidate_result(2))
    elif opsi == 3:
        print('Bye!')
        sys.exit(0)
    else:
        print('Pilihan menu salah')
