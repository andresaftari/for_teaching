import socket

# Setup koneksi
UDP_IP = "127.0.0.1"
UDP_PORT = 5005

# Menghubungkan socket UDP/IP
sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
# AF_INET menyatakan IPv4
# SOCK_STREAM menyatakan UDP

# Koneksikan ke UDP/IP
sock.bind((UDP_IP, UDP_PORT))
print('========= Welcome, connection is ready =========')

# Streaming ke UDP/IP
while True:
        data, addr = sock.recvfrom(1024)
        print(addr)
        print("pesan diterima :", data.decode())
