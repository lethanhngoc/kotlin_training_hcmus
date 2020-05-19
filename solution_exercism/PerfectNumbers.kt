
enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
    if(naturalNumber <= 0) {
        throw RuntimeException()
    }
    val aliquot = aliquotSum(naturalNumber)
    return when {
        aliquot < naturalNumber -> Classification.DEFICIENT
        aliquot > naturalNumber -> Classification.ABUNDANT
        else -> Classification.PERFECT
    }
}

private fun aliquotSum(num: Int): Int {
    val factors = mutableSetOf<Int>()
    for (i in 1 until num) {
        if (num % i == 0) {
            factors.add(i)
        }
    }
    return factors.sum()
}