//data types in kotlin
/*
 for primitive data types in Kotlin like Double, Int, Boolean, etc., initialization is compulsory
 at the time of declaration if you're not using a nullable type.
 This is because these types cannot hold a null value by default, and Kotlin requires all
 non-nullable properties to be initialized when declared.
     Int: Represents 32-bit signed integers.
    Long: Represents 64-bit signed integers.
    Short: Represents 16-bit signed integers.
    Byte: Represents 8-bit signed integers.
    Float: Represents 32-bit floating-point numbers.
    Double: Represents 64-bit floating-point numbers.
    Char: Represents a single 16-bit Unicode character.
    Boolean: Represents a boolean value (true or false).
    //note: all are having first letter as capital letter

        val:
       # Declares an immutable reference. Once initialized, the value cannot be reassigned.
        Similar to declaring a final variable in Java.

        #Use val when you don't need to reassign the variable after initialization.

        # It ensures immutability, which can lead to safer and more predictable code.

             var:
        #Declares a mutable reference. The value can be reassigned after initialization.
        #Use var when you need to change the value of the variable later in the code.
        #It's more flexible but can lead to mutable state, which might introduce complexity, especially in
        concurrent or multi-threaded environments.
 */
package com.prathvihan1008.kotlin

class Class0k2 {
    var a=3;//Smart casting  //after first initialisation it automatically sets the data type of variable and now all the future values in a must be of type Int
    var b: Double = 0.0 // Initialized with a default value
    var c :Double? = null // Initialized as nullable
    val d:Int?=null

    val e:Int=4



    //
// or

//'lateinit' modifier is not allowed on properties of primitive types
   // lateinit var c: Double // Initialized later using lateinit-->Error


}