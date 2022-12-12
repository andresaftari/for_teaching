import java.util.Scanner

var isDone = false
var counter = 0

private val quizData = mutableListOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")

fun main() {
    quizData.shuffle()
    showNextQuiz()
}

fun showNextQuiz() {
    counter++
    println(quizData[0])

    checkAnswer()
}

fun checkAnswer() {
    val input = Scanner(System.`in`)
    val jawaban = input.nextLine()

    if (jawaban == quizData[0]) {
        println("Correct!")

        if (counter < quizData.size) {
            quizData.shuffle()
            showNextQuiz()
        } else {
            println("Quiz selesai")
        }
    } else {
        println("False")
    }
}