package com.secondwind.kotlinbasic

open class Parent(val familyName: String)

//class Child : Parent {
//    private val subName: String
//
//    constructor(subName: String) : this(subName, "")
//
//    constructor(subName: String, familyName: String) : super(familyName) {
//        this.subName = subName
//    }
//}

class Child(
    private val subName: String,
    familyName: String = ""
) : Parent(familyName)

class Account {
    var balance: Long = 0
        private set
//        set(value) {
//            if (value < 0) throw IllegalArgumentException("음수 잔액은 불가합니다.")
//
//            field = value
//        }

    fun increaseBalance(value: Int) {
        this.balance += value
    }

    fun decreaseBalance(value: Int) {
        this.balance -= value
    }

    var accountName: String = ""
        get() = "계좌이름:$field"
}

fun main() {
    val account = Account()
    account.increaseBalance(100)
    account.accountName = "급여계좌"

    println("balance : ${account.balance}, name: ${account.accountName}")
}