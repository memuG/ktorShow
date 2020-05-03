package com.example.show

fun whoWins(dog1: Dog, dog2: Dog) {
    val result = ((dog1.bark * dog1.weight) - (dog2.bark * dog2.weight))
    when {
        result > 0 -> println("Dog1 wins with: ${dog1.bark * dog1.weight} to ${dog2.bark * dog2.weight}")
        result < 0 -> println("Dog2 wins with: ${dog2.bark * dog2.weight} to ${dog1.bark * dog1.weight}")
        result == 0f -> println("Draw! Each: ${dog1.bark * dog1.weight}")
    }
}

class Dog(weightie: Float, val bark: Int) {
    val weight = weightie

    fun doBark() {
        println("Woof! Woof!")
    }
}

fun main(args: Array<String>) {
    val pluto = Dog(12f, 10)
    val spike = Dog(25f, 22)

    whoWins(pluto, spike)
}