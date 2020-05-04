object ScrabbleScore {

  fun scoreLetter(c: Char): Int =
    when (c.toLowerCase()) {
      in "aeioulnrst" -> 1
      in "dg" -> 2
      in "bcmp" -> 3
      in "fhvwy" -> 4
      in "k" -> 5
      in "jx" -> 8
      in "qz" -> 10
      else -> throw IllegalArgumentException("wtf")
    }

  fun scoreWord(word: String): Int = word.sumBy { scoreLetter(it) }
}