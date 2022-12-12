def ops(arrs):
    return arrs == arrs[::-1]


arr = ['1', '2', '3', '2', '1']
print(ops(str(arr)))
