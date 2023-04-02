import java.io.File

fun main() {
    val wordsFile = File("words.txt")

    wordsFile.readLines()

    for (i in wordsFile.readLines()) {
        println(i)
    }
}