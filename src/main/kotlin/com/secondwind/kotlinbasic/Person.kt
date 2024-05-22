package com.secondwind.kotlinbasic

data class Person(val name: String, var age: Int, var isMarried: Boolean)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}


fun main() {
//    val person = Person("James", 32, true)
//
//    val rectangle = Rectangle(4, 4)
//    println(rectangle.isSquare)
//
//    println(person.age)
//    println(person.name)
//    println(person.isMarried)


    val persons = listOf(
        Person("James", 32, true),
        Person("Kameron", 42, true),
        Person("Kameron2", 42, true),
        Person("Sphilberg", 52, true),
        Person("Sphilberg2", 52, true),
        Person("Philip", 12, true),
        Person("Philip2", 12, true),
    )

//    val result = persons.map { it.name }
//        .flatMap { it.toList() }

//    val result = persons.asSequence()
//        .map { it.name }
//        .find { it.startsWith("J") }

    val result = persons.groupBy { it.age }

    println(result)

    val nullablePerson: Person? =
        if (System.currentTimeMillis() % 2 == 0L) Person("Even", 22, true)
        else null

    val notNullPerson: Person = nullablePerson ?: Person("DefaultPerson", 0, false)
    println(notNullPerson.age)

//    if (nullablePerson != null) {
//        println(nullablePerson.name)
//    }
//
//    println(nullablePerson?.name ?: 0)

//    println(persons.filter { it.age > 36 }
//        .map { "${it.name} 나이는 ${it.age}" })

//    println(persons.maxByOrNull({ person: Person -> person.age }))
//    println(persons.maxByOrNull { person: Person -> person.age })
//    println(persons.maxByOrNull { person -> person.age })
//    println(persons.maxByOrNull { it.age })
//    println(persons.maxByOrNull(Person::age))


}