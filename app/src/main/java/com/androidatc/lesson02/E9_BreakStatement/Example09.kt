package com.androidatc.lesson02.E9_BreakStatement

/**
 * Created by HELMI on 10/29/2019.
 */

fun main() {
    var x = 1

    do {
        println("x = $x")
        x++

        if (x == 3) break
    } while (x <= 5)
}