package com.xiang.guess

import java.util.*

class SerectNumber {
    val serect = Random().nextInt(10) + 1 //產生1-10亂數
    var count = 0

    fun validate(number: Int) : Int {
        count++
        return number - serect
    }
}

fun main() {
    val serectNumber = SerectNumber()
    println(serectNumber.serect)
    println("${serectNumber.validate(2)} count: ${serectNumber.count}")
}