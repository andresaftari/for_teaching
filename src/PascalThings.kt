import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val num = input.nextInt()

    for (i in 0 until num) {
        for (j in 0 until  num - i - 1) print(" ")
        for (j in 0..i) print("${factorial(i) / (factorial(j) * factorial(i - j))} ")
        println()
    }
}

fun factorial(num: Int): Int {
    var res = 1
    var i = 1

    while (i <= num) {
        res *= i
        i++
    }

    return res
}