//Functions or Methods

package com.prathvihan1008.kotlin

class K03 {
    companion object{
        fun main(args:Array<String>){
            println("The sum is ${add(2,4)}") //using lambda function we can print directly within print statement
        }
        //the following function is also static since its also declared in the companion object
        fun add(a:Int,b:Int):Any{ //"Any" type is similar to object type in java
            return a+b

        }
    }
//u can not call the function in the main from here since its not static ,to do so u need to create a object of the class similar to java
    fun add(a:Int,b:Int):Any{ //"Any" type is similar to object type in java
        return a+b

    }

    //Kotlin introduces several features and improvements to methods compared to Java methods:

    //1.Default Parameter Values:
    //Kotlin allows you to specify default values for function parameters.
    // This eliminates the need for method overloading for methods with optional parameters, making the code more concise and readable.
    fun greet(name: String = "World"): String {
        return "Hello, $name!"
    }

    //2.Named Arguments:
    //In Kotlin, you can specify arguments by their parameter names, regardless of their order.
    // This enhances readability, especially for methods with multiple parameters.
    //greet(name = "Alice")
    // In this call:
    // greet is the name of the function being called.
    // name = "Alice" is a named argument, where name is the parameter name of the greet function, and "Alice" is the value passed to that parameter

    //3.Single Expression Functions:
    //Kotlin allows you to define single-expression functions using a concise syntax.
    // If a function consists of a single expression, you can omit the curly braces and return type.
    fun multiply(a: Int, b: Int) = a * b

    //4.Function Types and Lambdas:
    //Kotlin treats functions as first-class citizens, allowing you to pass functions as arguments,
    // return them from other functions, or store them in variables. This enables functional programming paradigms and simplifies working with higher-order functions.
    val square:(Int)->Int={x->x+x}
    /*
        val square:: This declares a read-only (immutable) variable named square.

    (Int) -> Int: This specifies the type of square. It's a function type that takes an Int as input and returns an Int.

    = { x -> x * x }: This is the initialization part of the variable declaration. It assigns a lambda expression to square. The lambda expression { x -> x * x } defines an anonymous function that takes an Int argument x and returns x * x, i.e., the square of x.
     */

    //5.Null Safety:
    //Kotlin's type system distinguishes between nullable and non-nullable types, reducing the risk of
// null pointer exceptions. Methods can explicitly declare parameters or return types as nullable or non-nullable.
    fun findLength(str: String?): Int {
        return str?.length ?: 0
    }

}