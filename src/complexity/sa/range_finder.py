import math


def __rangefinder__(x: list[int], y: list[int]):
    x1, y1, x2, y2 = 0, 0, 0, 0

    min_range = math.sqrt((x[0] - x[1]) * (x[0] - x[1]) + (y[0] - y[1]) * (y[0] - y[1]))

    for i in range(len(y) - 1):
        for j in range(i + 1, len(y)):
            jarak = math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]))

            if jarak < min_range:
                min_range = jarak
                x1 = x[i]
                x2 = x[j]
                y1 = y[i]
                y2 = y[j]

    print("min range:" + str(min_range) + "on: " + str(x1) + "," + str(y1) + " " + str(x2) + "," + str(y2))


if __name__ == '__main__':
    c_x = [2, 4, 6, 7, 8]
    c_y = [2, 4, 9, 5, 4]

    __rangefinder__(c_x, c_y)
