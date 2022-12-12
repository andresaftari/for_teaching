fun main() {
    val arr = arrayOf(1, 2, 3, 2, 1)

    var reversed = ""
    var text = ""

    arr.apply {
        forEach { text += it }
        reversed().forEach { reversed += it  }
    }

    if (text == reversed) println(true)
    else println(false)
}