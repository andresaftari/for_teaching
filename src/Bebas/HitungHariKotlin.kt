package Bebas

import java.util.*

var array: Array<String> = arrayOf()
fun main() {
    val scanner = Scanner(System.`in`)

    println("Menentukan hari ke-N\n")

    print("Masukan : ")
    val hari = scanner.next()
    val jarakHari = scanner.next()

    array[0] = hari
    array[1] = jarakHari

    calculate(array[0], array[1])
}

fun calculate(hari: String, jarak: String) {
    var today = 0
    val rangeInInt = jarak.toInt()
    val targetedDay: Int

    when (hari) {
        "Senin" -> today = 1
        "Selasa" -> today = 2
        "Rabu" -> today = 3
        "Kamis" -> today = 4
        "Jumat" -> today = 5
        "Sabtu" -> today = 6
        "Minggu" -> today = 7
    }

    targetedDay = if (rangeInInt > 7) rangeInInt % 7
    else rangeInInt

    when (today + targetedDay) {
        1 -> print("Output : Senin")
        2 -> print("Output : Selasa")
        3 -> print("Output : Rabu")
        4 -> print("Output : Kamis")
        5 -> print("Output : Jumat")
        6 -> print("Output : Sabtu")
        0 -> print("Output : Minggu")
    }
}