n = 5
res = 0

while n >= 2:
    res = (n % 2) + res
    n /= 2

res += n
print(res)







