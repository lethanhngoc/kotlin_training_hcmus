import kotlin.math.pow

enum class Color {
    BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE
}


object ResistorColorTrio {
    fun text(vararg input: Color): String {
        var ret: Int = 0
        for (x in input.indices) {
            if (x < 2) {
                ret += input[x].ordinal.times(10.0.pow(input.size-2-x).toInt())
            }
            if(x==2){
                ret = ret.times(10.0.pow(input[2].ordinal).toInt())
            }
        }

        return if(ret>1000){
            ret = ret.div(1000)
            "$ret kiloohms"
        }else{
            "$ret ohms"
        }
    }
}

fun main(args: Array<String>){
    ResistorColorTrio.text(Color.ORANGE, Color.ORANGE, Color.BLACK)
}
