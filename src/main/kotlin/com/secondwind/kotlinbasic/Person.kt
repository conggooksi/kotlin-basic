package com.secondwind.kotlinbasic

class Person(val name: String, var age:Int, var isMarried:Boolean)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}


fun main() {
    val person = Person("James", 32, true)

    val rectangle = Rectangle(4, 4)
    println(rectangle.isSquare)

    println(person.age)
    println(person.name)
    println(person.isMarried)
}