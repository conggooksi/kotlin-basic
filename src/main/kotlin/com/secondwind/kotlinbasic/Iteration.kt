package com.secondwind.kotlinbasic

fun main() {
    val students = mutableMapOf<Int, String>()

    students[1] = "Jack"
    students[2] = "Diana"
    students[3] = "Frost"

    for ((num, name) in students) {
        println("번호: ${num}, 이름: ${name}")
    }

    val st = mapOf(
        1 to "Jack",
        2 to "Diana",
        3 to "Frost")

    println("a는 ${recognize('a')}")
    println("3은 ${recognize('3')}")
    println("[은 ${recognize('[')}")
}

fun recognize(c: Char) = when (c) {
    in '0' .. '9' -> "숫자"
    in 'a' .. 'z', in 'A' .. 'Z' -> "알파벳"
    else -> "숫자도 문자도 아님"
}