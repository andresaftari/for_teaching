class Hewan {
    private val hewan = listOf(
        "Ayam",
        "Bebek",
        "Domba",
        "Kambing",
        "Sapi"
    )
    var index = 0

    fun showBack() {
        if (index <= hewan.size -1) index-- else 5

        val text = when (index) {
            1 -> "Ini Bebek"
            2 -> "Ini Domba"
            3 -> "Ini Kambing"
            4 -> "Ini Sapi"
            5 -> "Ini Ayam"
            else -> "Ini Ayam"
        }

        println(text)
    }
}

fun main() {
    val hewan = Hewan()
    hewan.index = 5

    hewan.showBack()
}