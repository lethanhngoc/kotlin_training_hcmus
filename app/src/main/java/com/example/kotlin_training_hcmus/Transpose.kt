object Transpose {

    fun transpose(input: List<String>): List<String> {
        var ret = arrayListOf<String>()
        val longestStr = findLogest(input)
        if (!input.isEmpty()) {
            val longestLength = input[longestStr].length
            var i = 0;
            while (i != longestLength) {
                ret.add("")
                var spaces = 0
                for (string in input) {
                    if (string.length > i) {
                        while (spaces != 0) {
                            ret.set(i, "${ret.get(i)} ")
                            spaces--
                        }
                        ret.set(i, "${ret.get(i)}${string[i].toString()}")
                    } else {
                        spaces++
                    }
                }
                i++
            }
        }
        return ret
    }

    fun findLogest(input: List<String>): Int {
        var longest: Int = 0;
        for (x in 0 until input.size) {
            if (input[x].length > input[longest].length) {
                longest = x
            }
        }
        return longest
    }
}

fun main() {
    val lines = listOf("The fourth line.", "The fifth line.")
    Transpose.transpose(lines)
//    val listLogest = listOf("The longest line.", "A long line.", "A longer line.", "A line.")
//    println(Transpose.findLogest(listLogest))
}