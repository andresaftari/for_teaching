from itertools import permutations
from sys import maxsize


def exhaustive_tsp(graph, s):
    vertex = []
    for i in range(v):
        if i != s:
            vertex.append(i)

    min_path = maxsize
    permu = permutations(vertex)
    for i in permu:
        current_pathweight = 0

        k = s
        for j in i:
            current_pathweight += graph[k][j]
            k = j

        current_pathweight += graph[k][s]
        min_path = min(min_path, current_pathweight)

    return min_path


v = 5

if __name__ == '__main__':
    g = [[0, 3, 4, 7, 5], [3, 0, 4, 3, 5], [4, 4, 0, 4, 2], [7, 3, 4, 0, 8], [5, 5, 2, 8, 0]]
    print(exhaustive_tsp(g, 1))
