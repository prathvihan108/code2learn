//Inheritance :It is almost similar to java ,only thing is u need to use the open keyword to make a class or property inheritable
//The concepts of this and super keywords and the runtime polymorphism also same as java
package com.prathvihan1008.kotlin

// Define a superclass
open class Animal(val name: String) { // 'open' keyword allows inheritance
    // Method of the superclass
    open fun makeSound() {//u must also open the methods or data members to make them overridable
        println("$name makes a sound")
    }
}

// Define a subclass that inherits from Animal
class Dog(name: String) : Animal(name) { // ':' indicates inheritance
    // Override the makeSound() method of the superclass
    override fun makeSound() {
        println("$name barks")
    }
}

// Define another subclass that inherits from Animal
class Cat(name: String) : Animal(name) {
    // Override the makeSound() method of the superclass
    override fun makeSound() {
        println("$name meows")
    }
}

// Main function to demonstrate inheritance
fun main() {
    // Create an instance of the Dog class
    val dog = Dog("Buddy")
    // Call the makeSound() method of the Dog class
    dog.makeSound() // Output: Buddy barks

    // Create an instance of the Cat class
    val cat = Cat("Whiskers")
    // Call the makeSound() method of the Cat class
    cat.makeSound() // Output: Whiskers meows
}
