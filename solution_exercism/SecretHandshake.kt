enum class Signal {

    WINK, DOUBLE_BLINK, CLOSE_YOUR_EYES, JUMP

}

object HandshakeCalculator {

    fun Int.length() = this.toString().length

    fun Int.takeLast(n: Int) = this.toString().takeLast(n).toInt()


    fun calculateHandshake(number: Int): List<Signal> {
        var resultList = mutableListOf<Signal>()

        if (number < 32){
            var binNum = number.toString(2).toInt()

            listOf(1, 10, 100, 1000).forEachIndexed { index, value ->
                if (binNum.takeLast(value.length()) >= value)  resultList.add(Signal.values().get(index))
            }

            if (binNum >= 10000) resultList.reverse()
        }

        return resultList
    }
}