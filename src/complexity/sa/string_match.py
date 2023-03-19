# time complexity = O(n^2)
def __matcher__(str1, ptrn):
    n = len(str1)
    m = len(ptrn)

    for i in range(n - m + 1):
        j = 0
        while j < m and str1[i + j] == ptrn[j]:
            j += 1

        if j == m:
            return i + 1

        print(i, j)
    return -1


if __name__ == '__main__':
    # 100 - 3 + 1
    string = '0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000'
    pattern = '001'
    print(__matcher__(string, pattern))
