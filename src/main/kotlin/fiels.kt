import java.io.File

fun main() {
    val wordsFile = File("words.txt")
    val lines: List<String> = wordsFile.readLines()
    val dictionary: MutableList<Word> = mutableListOf()

    for (line in lines) {
        val line = line.split("|")
        line[2] ?: "0"
        val word = Word(line[0], line[1], line[2].toInt(),)
        dictionary.add(word)
    }
    println(dictionary)
}
data class Word(
    val original: String,
    val translate: String,
    val correctAnswersCount: Int = 0
)