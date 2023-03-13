def triangle(x):
    # k = jumlah spasi (tiap baris harus ngurang 1)
    k = x - 1
    # for loop untuk jumlah baris
    for i in range(0, x):
        # for loop untuk mencetak spasi
        for j in range(0, k):
            print(end=" ")
        k = k - 1

        # for loop untuk mencetak *
        for j in range(0, i + 1):
            print("* ", end="")
        # \r biar rapi
        print("\r")


# tentuin jumlah baris segitiganya
n = 5
triangle(n)
