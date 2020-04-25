import kotlin.math.sqrt

object Darts {

    fun score(x: Any, y: Any): Int {
        var x = x.toString().toDouble()
        var y = y.toString().toDouble()
        val distance = sqrt(x*x + y * y)
        return when {
            distance <= 1.0 -> {
                10;
            }
            distance <= 5.0 -> {
                5;
            }
            distance <= 10.0 -> {
                1;
            }
            else -> 0
        }

    }
}
