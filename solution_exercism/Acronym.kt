object Acronym {
    fun generate(phrase: String): String =
            phrase.split("[\\s-_]+".toRegex())
                    .map { it[0] }
                    .joinToString("")
                    .toUpperCase()
}