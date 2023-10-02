import socket

# Setup koneksi
UDP_IP = "127.0.0.1"
UDP_PORT = 5005

# Menghubungkan socket UDP/IP
sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
print('========= Welcome, connection is ready =========')
# AF_INET menyatakan IPv4
# SOCK_STREAM menyatakan UDP

# Send via UDP/IP
pesan = input('Masukkan Pesan: ')
sock.sendto(pesan.encode(), (UDP_IP, UDP_PORT))
