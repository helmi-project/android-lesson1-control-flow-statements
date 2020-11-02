package com.androidatc.lesson02.E5_WhenStatementAndExpression

/**
 * Created by HELMI on 10/29/2019.
 */

fun main() {
    println("=========== Pizza Order ==============")
    println("Enter the Pizza Size : 1=> Small Size, 2=> Medium Size, 3=> Large Size")

    var size = readLine()!!.toInt()
    var price: Int?= null

    when (size) {
        1-> price = 5
        2-> price = 7
        3-> price = 10
        else-> println("You did not enter the correct size")
    }
    println("Total Price = $price"+" USD")
}