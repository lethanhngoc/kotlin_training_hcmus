class Series(private val input: String) {
    init {
        require(input.contains("^[0-9]*$".toRegex()))
    }

    fun getLargestProduct(span: Int): Long = when {
        span == 0 -> 1
        span > input.length -> throw IllegalArgumentException();
        else ->
            input.windowed(span){
                it.fold(1.toLong()){ product , c -> product * (c - '0')}
            }.max() ?:1
    }
}
