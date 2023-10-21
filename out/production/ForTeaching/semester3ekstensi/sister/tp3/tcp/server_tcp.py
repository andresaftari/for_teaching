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
print('========= Welcome, connection is ready =========')
s.bind((IP_TCP, PORT_TCP))
s.listen(1)

# Streaming ke TCP/IP
while 1:
    conn, ip_addr = s.accept()
    data = conn.recv(BUFFER)
    print('IP Address: ', ip_addr)
    print('Message: ', data.decode())
    conn.send(data)
    conn.close()
