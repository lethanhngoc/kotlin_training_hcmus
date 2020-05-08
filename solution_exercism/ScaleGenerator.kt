val sharpNotes = arrayOf("A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#")
val flatNotes = arrayOf("A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab")

val sharpTonics = arrayOf("C", "G", "D", "A", "E", "B", "F#", "a", "e", "b", "f#", "c#", "g#", "d#")

class Scale(private val tonic: String) {

    fun <T> Array<T>.shift(newZero: Int): Array<T> {
        var output = this.copyOf()
        forEachIndexed { index, elt -> output[(index - newZero + size) % size] = elt }
        return output
    }

    fun chromatic(): List<String> {
        if (tonic in sharpTonics) return sharpNotes.shift(sharpNotes.indexOf(tonic.capitalize())).toList()
        return flatNotes.shift(flatNotes.indexOf(tonic.capitalize())).toList()
    }

    fun interval(intervals: String): List<String> {
        var index = 0
        return intervals.map {
            val note = chromatic()[index]
            when (it) {
                'M' -> index += 2
                'm' -> index++
                'A' -> index += 3
            }
            note
        }
    }

}