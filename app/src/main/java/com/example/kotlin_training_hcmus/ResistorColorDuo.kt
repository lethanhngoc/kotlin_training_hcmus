import kotlin.math.pow

enum class Color {
    BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE
}

object ResistorColorDuo {
    fun value(vararg colors: Color): Int {
        var ret: Int = 0
        var power: Int =0
        for (x in colors.size downTo 0) {
            if (x <= 1) {
                ret += colors[x].ordinal.times(10.0.pow(power).toInt())
                power++
            }

        }
        return ret
    }
}


