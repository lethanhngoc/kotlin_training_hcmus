class Squares(upperBound: Int) {

    private val interval = (1..upperBound)

    fun sumOfSquares() = interval.sumBy { it.squared() }

    fun squareOfSum() = interval.sum().squared()

    fun difference() = squareOfSum() - sumOfSquares()
}

private fun Int.squared() = this * this