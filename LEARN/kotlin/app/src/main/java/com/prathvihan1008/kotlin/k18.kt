//Scope functions:
/*
Kotlin standard library contains several functions whose sole purpose is to execute a block of code within the context of an object

when u call such a function on an object with the lambda expression provided it forms a temporary scope.

in this scope u can access the object without its name.
These functions are 'let','also','run','with','apply'

note: all the scope functions are the lambda expressions ,but u no need to tell the input type and the output type

 */
/*
In Kotlin, each scope function returns a different type of value based on its behavior and purpose. Here's a summary of the return types of each scope function:

    let:
        Returns the result of the lambda expression, which can be of any type.
        If the receiver object (this or it) is not null, the result of the lambda is returned. Otherwise, null is returned.

    run:
        Returns the result of the lambda expression, which can be of any type.
        The lambda expression is executed with the receiver object (this) as its context. The result of the lambda is returned.

    with:  it is used for displaying or calling the methods on the object ,it does not allow to change the scope within the block unlike run
        Returns the result of the lambda expression, which can be of any type.
        Similar to run, but with is not an extension function. It takes the receiver object as a separate parameter.

    apply:used for modifying an object ,for example setting the variables or calling certain methods
        Returns the receiver object itself.
        The lambda expression is applied to the receiver object, and the receiver object is returned after the modifications specified in the lambda.

    also:
        Returns the receiver object itself.
        Similar to apply, but also is used when you want to perform additional actions with the receiver object without modifying it. It returns the same object after the additional actions.

Here's a quick reference:

    let, run, with: Returns the result of the lambda.
    apply, also: Returns the receiver object itself.


 */
//"it" Keyword
//The it keyword in Kotlin is primarily used as a default name for a single parameter lambda
// function when the parameter name isn't explicitly specified. It's particularly useful in scenarios where you have a lambda function with only one parameter,
//and specifying the parameter name doesn't add clarity to the code.
/*  Advantages of Scope functions in kotlin
    Object Configuration: Scope functions like apply and also allow you to configure properties of an object without needing to repeatedly reference the object itself. This can make code cleaner and more readable.

    Nullable Checks: When dealing with nullable objects, scope functions like let provide a convenient way to perform operations only if the object is not null. This helps avoid null pointer exceptions and makes code safer.

    Chaining Calls: Scope functions enable chaining of method calls on objects, which can lead to more concise and expressive code. For example, using run or with to perform a series of operations on an object.

    Function Literals with Receiver (Lambda with Receiver): Scope functions allow you to define a block of code (a lambda) and apply it to an object. This is particularly useful for defining DSLs (Domain-Specific Languages) or for writing fluent APIs.

    Combining Scopes: By using scope functions in combination, you can achieve complex operations in a single expression, improving code readability and reducing the need for temporary variables.
 */
package com.prathvihan1008.kotlin

// Define a Person class
class Person(var name: String, var age: Int) {
    fun celebrateBirthday() {
        age++
    }
}

// Create a nullable person object
val nullablePerson: Person? = Person("Alice", 25)

// Using 'let': Execute a block of code on 'nullablePerson' if it's not null
val resultLet = nullablePerson?.let { person ->
    // Accessing properties of 'person' directly
    "Happy birthday, ${person.name}! You are ${person.age} years old."
} ?: "No person found."

// Using 'run': Execute a block of code with 'nullablePerson' as its context
val resultRun = nullablePerson?.run {
    // Accessing properties of 'this' directly
    celebrateBirthday()
    "Happy birthday, $name! You are $age years old." //the last block basically act as the result of the scope function run
} ?: "No person found."

// Using 'with': Execute a block of code with 'nullablePerson' as its context, using 'this' to refer to it
val resultWith = with(nullablePerson) {
    // Accessing properties using 'this'
    this?.celebrateBirthday()
    this?.let { "Happy birthday, ${name}! You are ${it.age} years old." } ?: "No person found."

}

// Using 'apply': Configure properties of an object and return the object itself
val appliedPerson = Person("Bob", 30).apply {
    // Setting properties directly
    name = "Robert"
    age += 1
}

// Using 'also': Perform additional actions on an object and return the object itself
val alsoResult = Person("Charlie", 35).also { person ->//here the "person->" is optional we can refer as "it"

    // Additional action with 'person'
    println("Creating person: ${person.name}, ${person.age} years old.")
}


fun main()
{
    // Print the results
    println("Result of let: $resultLet")
    println("Result of run: $resultRun")
    println("Result of with: $resultWith")
    println("Applied Person: ${appliedPerson.name}, ${appliedPerson.age} years old.")

}

