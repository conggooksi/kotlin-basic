package com.secondwind.kotlinbasic

interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click() {
        println("Button is clicked")
    }

    private fun internalPrint() {
        println("Internal out")
    }
}

fun main() {
    Button().click()
}