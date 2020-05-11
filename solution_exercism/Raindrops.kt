object Raindrops {

    fun convert(n: Int): String {
        val words = mapOf(3 to "Pling", 5 to "Plang", 7 to "Plong")

        var sb = StringBuffer()
        for ((num, word) in words) {
            if (n % num == 0) {
                sb.append(word)
            }
        }

        if (sb.isEmpty()) {
            sb.append(n.toString())
        }

        return sb.toString()
    }
}
