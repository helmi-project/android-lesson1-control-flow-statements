package com.androidatc.lesson02.E3_IfElseAndElseIfStatement

/**
 * Created by HELMI on 10/29/2019.
 */

fun main() {
    var score: Int= 40
    var grade: String?= null

    if(score >= 90) grade = "Grade A"
    else if (score >= 80) grade = "Grade B"
    else if (score >= 70) grade = "Grade C"
    else if (score >= 50) grade = "Grade D"
    else grade = "Grade F"
        println(grade)
}