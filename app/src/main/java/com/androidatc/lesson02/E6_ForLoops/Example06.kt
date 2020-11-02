package com.androidatc.lesson02.E6_ForLoops

/**
 * Created by HELMI on 10/29/2019.
 */

var x = arrayOf(10, 20, 30, 40, 50)

fun main() {
    var y = readLine()!!.toInt()

    for (x in 0..y) {
        println("x = $x")
    }

    for (index in 0 until x.size) { // Bisa juga 0..x.size-1
        println(x[index])
    }
}