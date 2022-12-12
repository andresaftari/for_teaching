import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    // Clone berapa banyak?
    val clones = Integer.parseInt(br.readLine())

    // Input yang mau di-clone ke for
    for (i in 1..clones) println("@ColumnInfo(name = \"strMeasure$i\")")
}