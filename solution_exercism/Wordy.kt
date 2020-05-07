import kotlin.math.pow

object Wordy {

    fun answer(input: String): Int {
        if (input.length < 8 || input.take(8) != "What is ") error("Invalid question")
        val n = input.drop(8).takeWhile { it.isDigit() || it == '-' }
        val s = input.drop(8).drop(n.length)
        return answerHelper(n.toInt(), s)
    }

    private fun answerHelper(n: Int, s: String): Int {
        if (s == "?") return n
        val operation = s.takeWhile { !it.isDigit() && it != '-'}
        val number = s.drop(operation.length).takeWhile { it.isDigit() || it == '-' }
        val remaining = s.drop(operation.length).drop(number.length)
        return when  {
            operation.trim() == "plus" -> answerHelper(n+number.toInt(), remaining)
            operation.trim() == "minus" -> answerHelper(n-number.toInt(), remaining)
            operation.trim() == "multiplied by" -> answerHelper(n*number.toInt(), remaining)
            operation.trim() == "divided by" -> answerHelper(n/number.toInt(), remaining)
            operation.trim() == "raised to the" -> {
                if (remaining.trim().drop(2).take(6) != " power") error("Invalid question")
                answerHelper(n.toDouble().pow(number.toDouble()).toInt(), remaining.drop(8))
            }
            else -> error("Invalid question")
        }
    }
}