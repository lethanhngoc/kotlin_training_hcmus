package com.example.kotlin_training_hcmus
import java.util.*
import java.util.stream.IntStream
import kotlin.random.Random

class DndCharacter {

    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10.plus(modifier(constitution))

    companion object {
        fun ability(): Int {
            var listInteger = mutableListOf<Int>()
            for (x in 0..3) {
                listInteger.add((1..6).random())
            }
            listInteger.sort();
            listInteger = listInteger.subList(1, 4)
            return listInteger.sum()
        }

        fun modifier(score: Int): Int {
            return Math.floor((score - 10) / 2.0).toInt()
        }
    }

}


