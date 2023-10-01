package HTree

import java.util.*

class HTreeeeComparator : Comparator<Todos> {
    override fun compare(todo1: Todos, todo2: Todos): Int {
        return if (todo1.priority < todo2.priority) -1
        else if (todo1.priority > todo2.priority) 1
        else 0
    }
}

data class Todos(var priority: Int, var name: String)

fun main() {
    val heap = PriorityQueue<Todos>(1, HTreeeeComparator())

    heap.add(Todos(5, "ISD"))
//    println("Task terdekat yang harus diselesaikan: ${heap.peek().name}")
    heap.add(Todos(8, "UKM"))
//    println("Task terdekat yang harus diselesaikan: ${heap.peek().name}")
    heap.add(Todos(3, "SBD"))
//    println("Task terdekat yang harus diselesaikan: ${heap.peek().name}")

    // selesai
    println("Kuis ${heap.poll().name} selesai dilaksanakan, berikutnya tugas ${heap.peek().name}")
    println("Kuis ${heap.poll().name} selesai dilaksanakan, berikutnya tugas ${heap.peek().name}")
}