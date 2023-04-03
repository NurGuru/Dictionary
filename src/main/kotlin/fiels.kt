import java.io.File

fun main() {
    val wordsFile = File("words.txt")

    val lines = wordsFile.readLines()

    for (i in lines) {
        println(i)
    }
}