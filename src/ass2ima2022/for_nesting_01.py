n = int(input())
num = 0

for i in range(0, n + 1):
    for j in range(0, i):
        print(num, end='')

        if num >= 9:
            num = 0
        num += 1

    print()
