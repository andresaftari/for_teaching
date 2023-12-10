from mpi4py import MPI
import random as rd

# import library random untuk generate angka integer secara random

# buat COMM
comm = MPI.COMM_WORLD

# dapatkan rank proses
rank = comm.Get_rank()

# dapatkan total proses berjalan
size = comm.Get_size()

print('Hello process %d/%d' % (rank, size))
# generate angka integer secara random untuk setiap proses
# random_int = rd.randint(0, 150)

# jika saya adalah proses dengan rank 0 maka:
# saya menerima nilai dari proses 1 s.d proses dengan rank terbesar
# menjumlah semua nilai yang didapat (termasuk nilai proses saya)
# if rank == 0:
#     total = random_int
#
#     for num in range(1, size):
#         received = comm.recv(num)
#         total += received
#
#     print('Hello process %d/%d' % (rank, size))

# jika bukan proses dengan rank 0, saya akan mengirimkan nilai proses saya ke proses dengan rank=0
# else:
#     comm.send(random_int, 0)
