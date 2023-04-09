import java.io.File
import kotlin.math.roundToInt

fun main() {
    val wordsFile = File("words.txt")
    val lines: List<String> = wordsFile.readLines()
    val dictionary: MutableList<Word> = mutableListOf()

    for (line in lines) {
        val line = line.split("|")
        val word = Word(line[0], line[1], line[2].toIntOrNull() ?: 0)
        dictionary.add(word)
    }
    val learnedWords = dictionary.filter { it.correctAnswersCount >= 3 }.size
    while (true) {
        println("Меню: 1 – Учить слова, 2 – Статистика, 0 – Выход")
        when (readln().toInt()) {
            1 -> println("Вы выбрали учить слова")
            2 -> println(
                "Всего слов в словаре ${dictionary.size}\n" +
                        "Выучено $learnedWords слов из ${dictionary.size}| " +
                        "${((learnedWords.toDouble() / dictionary.size) * 100).roundToInt()}%"
            )

            0 -> break
            else -> println("Такой команды нет, выберите нужную команду.")
        }
    }
}

data class Word(
    val original: String,
    val translate: String,
    val correctAnswersCount: Int = 0,
)