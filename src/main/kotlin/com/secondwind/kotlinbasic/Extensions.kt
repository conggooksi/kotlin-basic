package com.secondwind.kotlinbasic

fun String.double() = this + this

infix fun String.add(postfix: String) = this + postfix

fun main() {
    println("TTOO".double())

    println(setOf(1,3,4,522,34,4).maxOrNull())

    println("My name is ".add("Snow"))
    println("My name is " add "Snow")
    println(
        mapOf(
            "key" to "Value",
            "key2" to "Value2",
        )
    )

    val (firstName, lastName) = Pair("Snow", "Man")

    mapOf(
        "key" to "Value",
        "key2" to "Value2",
    ).forEach {
        (key, value) -> println("${key} : ${value}")
    }
}