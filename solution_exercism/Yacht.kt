
enum class YachtCategory {
    YACHT {
        override fun score(vararg dices: Int): Int = if (dices.distinct().count() == 1) 50 else 0
    },
    ONES {
        override fun score(vararg dices: Int): Int = dices.count { it == 1 }
    },
    TWOS {
        override fun score(vararg dices: Int): Int = dices.count { it == 2 } * 2
    },
    THREES {
        override fun score(vararg dices: Int): Int = dices.count { it == 3 } * 3
    },
    FOURS {
        override fun score(vararg dices: Int): Int = dices.count { it == 4 } * 4
    },
    FIVES {
        override fun score(vararg dices: Int): Int = dices.count { it == 5 } * 5
    },
    SIXES {
        override fun score(vararg dices: Int): Int = dices.count { it == 6 } * 6
    },
    FULL_HOUSE {
        override fun score(vararg dices: Int): Int = dices.associateByCount().takeIf { it.size == 2 }
                ?.filterValues { it == 2 || it == 3 }?.map { it.key * it.value }?.sum() ?: 0
    },
    FOUR_OF_A_KIND {
        override fun score(vararg dices: Int): Int =
                dices.associateByCount().filterValues { it >= 4 }.map { it.key * 4 }.firstOrNull() ?: 0
    },
    LITTLE_STRAIGHT {
        override fun score(vararg dices: Int): Int = if (dices.sorted().containsAll(listOf(1, 2, 3, 4, 5))) 30 else 0
    },
    BIG_STRAIGHT {
        override fun score(vararg dices: Int): Int = if (dices.sorted().containsAll(listOf(2, 3, 4, 5, 6))) 30 else 0
    },
    CHOICE {
        override fun score(vararg dices: Int): Int = dices.sum()
    };

    abstract fun score(vararg dices: Int): Int
}

private fun IntArray.associateByCount() = associate { it to count { a -> a == it } }

object Yacht {

    fun solve(category: YachtCategory, vararg dices: Int): Int = category.score(*dices)
}
