import sys
from xmlrpc.server import SimpleXMLRPCServer
from xmlrpc.server import SimpleXMLRPCRequestHandler


# class RequestHandler dengan path /RPC2
class RequestHandler(SimpleXMLRPCRequestHandler):
    rpc_paths = ('/RPC2',)


# Server dan Register Function
with SimpleXMLRPCServer(('127.0.0.1', 8000), requestHandler=RequestHandler) as server:
    server.register_introspection_functions()

    print('========= Welcome, server is running =========')
    dict_candidate = {}
    opsi = 0

    # Function untuk menambahkan calon
    def __insert_candidate__():
        n_candidate = int(input('Input jumlah calon: '))

        # Jumlah calon harus lebih 1
        if n_candidate <= 1:
            print('========= Jumlah calon harus lebih dari 1 =========')
            sys.exit(0)

        # Saat calon ditambahkan, isi default suaranya ke nilai 0
        for i in range(n_candidate):
            candidate = input('Input nama calon: ')
            dict_candidate.setdefault(candidate, 0)

        # Kalau calon berhasil ditambahkan, berikan notifikasi
        if len(dict_candidate) > 0:
            return '========= Calon berhasil ditambahkan ========='

    # Run function insert_candidate()
    __insert_candidate__()

    # Function untuk menampilkan hasil pemilihan
    def show_candidate_result(n):
        if len(dict_candidate) == 0:
            # Kalau belum ada calon, tidak bisa melihat
            return '========= Belum ada calon, silakan tambahkan calon ========='
        elif n == 1:
            return str(dict_candidate)
        else:
            return '========= Hasil Pemilihan =========\n' + str(dict_candidate)

    # Register Function show_candidate_result()
    server.register_function(show_candidate_result, 'show_candidate_result')

    # Function untuk memilih calon
    def choose_candidate(option):
        if len(dict_candidate) == 0:
            # Kalau belum ada calon, tidak bisa vote
            return '========= Belum ada calon, silakan tambahkan calon ========='
        else:
            if dict_candidate.__contains__(option):
                # Tambah 1 vote ke suara calon yang dipilih
                dict_candidate.__setitem__(option, dict_candidate[option] + 1)
                return 'Voting berhasil!'
            else:
                # Kalau calon yang dipilih tidak terdaftar, tidak dipilih
                return 'Tidak ada pilihan tersebut!'

    # Register Function choose_candidate()
    server.register_function(choose_candidate, 'choose_candidate')

    # Run server dengan interval 5 seconds timeout
    server.serve_forever(5.0)
