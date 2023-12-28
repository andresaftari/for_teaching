import time

s = time.time() * 1000

for i in range(0, 5):
    for j in range(0, 5):
        print(i * j, end=' ')
    print()

e = time.time() * 1000

# Print runtime
print(f'{e - s} second')
