/*
Null safety in kotlin
//note:scope functions can also be declared on the data members of the class not only on the objects
 */
package com.prathvihan1008.kotlin

// Define a nullable object
fun main()
{
    val nullablePerson: Person? = null

// Safe call operator (?.): Access a property or call a method only if the receiver object is not null
    val nameLength = nullablePerson?.name?.length

// Safe call operator with let (?.let): Execute a block of code only if the receiver object is not null
    nullablePerson?.let { person ->
        // 'person' refers to the non-null object
        println("Name: ${person.name}, Age: ${person.age}")//prints this line,in this let we not returning anything
    }

// Elvis operator (?:): Provide a default value if the receiver object is null
    val age = nullablePerson?.age ?: 0

// Safe cast operator (as?): Perform a safe cast, returning null if the cast is not possible
    val person: Person? = nullablePerson as? Person

// Not-null assertion operator (!!): Assert that the receiver object is not null and throw a NullPointerException if it is
    val nonNullPerson = nullablePerson!!

// Using the safe call operator with collections
    val list: List<Int>? = listOf(1, 2, 3, 4)
    val firstElement = list?.firstOrNull()

// Using the safe call operator with nullable Boolean
    val isAdult: Boolean? = nullablePerson?.age?.let { it >= 18 }

// Safe call operator with nullable function invocation
    val length: Int? = nullablePerson?.name?.run { this.length }

// Using the Elvis operator with string interpolation
    val fullName = nullablePerson?.name ?: "Unknown"

}

