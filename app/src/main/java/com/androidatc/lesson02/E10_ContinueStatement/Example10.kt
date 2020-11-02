package com.androidatc.lesson02.E10_ContinueStatement

/**
 * Created by HELMI on 10/29/2019.
 */

fun main() {
    var x = 0

    do {
        x++ // Langsung ditambah 1 terlebih dahulu

        if (x == 3) continue
        println("x = $x")
    } while (x <= 5)
}