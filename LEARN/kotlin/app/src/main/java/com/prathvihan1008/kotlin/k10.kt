
/*
Companion object

in kotlin or any other programming language like java and c
when ever we want  to call the method or when ever we want to access the members of a class then we make the object of
a class and with the help of that object,we access the members of the class

when we need some properties or methods which need to be accessed more frequently we make it static so that we
no need to create the runtime object all the time ,this saves the memory space too,

in kotlin , there is nothing called static keyword similar to java,here we use the companion object.
Methods and the data members inside the companion object are allocated the memory at the compile only.
Companion objects are used when we need to stop the multiple object creation at runtime which may be memory overhead
 */
package com.prathvihan1008.kotlin

// Define a class
class MyClass {
    // Define a companion object inside the class
    companion object {
        // Define a function inside the companion object
        fun myFunction() {
            println("This is a function inside the companion object")
        }
    }
}

// Main function to demonstrate the usage of companion objects
fun main() {
    // Call the function defined inside the companion object directly using the class name
    MyClass.myFunction()
}

