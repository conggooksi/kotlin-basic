package com.secondwind.kotlinbasic

import java.time.LocalDateTime
import kotlin.time.Duration

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE
}

fun main() {
//    println(getKoreanColorName(Color.RED))
    printObject("OBJECT")
    printObject(LocalDateTime.of(2024, 5, 17, 0, 0))
    printObjectIf("OBJECT")
}

fun printObjectIf(obj: Any): Unit = if (obj is String) {
    println(obj.lowercase())
} else {
    println("nothing")
}

fun printObject(obj: Any): Unit = when (obj) {
    is String -> println(obj.lowercase())
    is LocalDateTime -> println(obj.month)
    else -> println("Unknown type")
}

fun getKoreanColorName(color: Color): String = when (color) {
    Color.RED -> "빨강"
    Color.ORANGE -> "오렌지"
    Color.YELLOW -> "노랑"
    Color.GREEN -> "녹색"
    Color.BLUE -> "파랑"
}