package com.secondwind.kotlinbasic

class User (
    val userName: String,
    val level: Int = 1) {
}

fun main() {
    println(User(userName = "Benny").level)
    println(User(userName = "Noone", level = 3).level)
}