import kotlin.math.round

class SpaceAge(val age:Int) {

    private val earthYrs = age / 31557600.0

    private fun convert(multiplier: Double): Double = round(earthYrs / multiplier * 100) / 100

    fun onEarth(): Double = convert(1.0)
    fun onMercury(): Double = convert(0.2408467)
    fun onVenus(): Double = convert(0.61519726)
    fun onMars(): Double = convert(1.8808158)
    fun onJupiter(): Double = convert(11.862615)
    fun onSaturn(): Double = convert(29.447498)
    fun onUranus(): Double = convert(84.016846)
    fun onNeptune(): Double = convert(164.79132)
}
