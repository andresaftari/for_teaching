var carouselList = mutableListOf(
    "Ayo makrab, biar akrab",
    "Ayo bullying, maksudnya stop bullying",
    "",
    "Ayo makan, jangan lupa minum biar ga keselek",
    "Ayo bernapas, karena kalau tidak kita mati"
)

fun main() {
    val iterator = carouselList.listIterator()
    var id: Int

    println("Masih Normal: \n")

    iterator.apply {
        forEachRemaining {
            id = this.nextIndex()
            println("id: $id, ${iterator.next()}")
        }
    }

    repeat(carouselList.size) {
        if (carouselList[it] == "")
            println("Current id: $it --> Ini yang statis\n")
    }

    simulasiScrolling()
    simulasiScrolling()
}

fun simulasiScrolling() {
    val templist = arrayListOf<String>()
    templist.addAll(carouselList)

    println("Keadaan saat diubah: \n")

    repeat(carouselList.size) {
        val newPos = (it + 1) % carouselList.size
        templist[it] = carouselList[newPos]

        println("id: $it, ${templist[it]}")
    }

    carouselList.apply {
        clear()
        addAll(templist)
    }

    repeat(carouselList.size) {
        if (carouselList[it] == "")
            println("Current id: $it --> Ini yang statis\n")
    }
}