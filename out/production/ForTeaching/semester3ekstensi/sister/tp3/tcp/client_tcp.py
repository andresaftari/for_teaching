import socket

# Setup koneksi
IP_TCP = '127.0.0.1'
PORT_TCP = 5000
BUFFER = 1024

# Membuat socket TCP/IP
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
# AF_INET menyatakan IPv4
# SOCK_STREAM menyatakan TCP

# Koneksikan ke TCP/IP
s.connect_ex((IP_TCP, PORT_TCP))

# Send via TCP/IP
print('========= Welcome, connection is ready =========')
MESSAGE = input('Message: ')

s.send(MESSAGE.encode())
data = s.recv(BUFFER)
print('SENT: ', data.decode())

s.close()
