/*
conditional statements are quite similar to Java, but there are a few differences and additional features. Here's how conditional statements work in Kotlin:
 */
package com.prathvihan1008.kotlin

class k04 {
    //if-else Statement:
    //Kotlin's if statement is an expression, which means it returns a value. This eliminates the need for the ternary operator (?:) in Java.
    var x=5
    val result=if(x>100)"positive" else "Negative"

    /*
    when Expression:
Kotlin's when is more powerful than Java's switch statement.
It can be used as an expression (returning a value) or as a statement.
     */

    val result1=when(x){
        1->"one"
        2->"two"
        else ->"other" //this else statement works as a default statement
    }

    /*
    Smart Casts:
    Inside a when expression, Kotlin performs smart casts based on the checked condition. This means you can directly use properties or methods of an object without explicit casting.

    when (obj) {
    is String -> println(obj.length) // No need to cast obj to String
    is Int -> println(obj * obj) // No need to cast obj to Int
}

     */

    /*
    Range Checks:
Kotlin allows you to use range expressions in when statements.
     */
    var score=0
    val result3=when(score){
       in 90..100->"A"
       in 80..90->"B"
        else ->"c"

    }

    /*
    Kotlin allows you to use expression body syntax for single-line conditional statements and functions.
     */
    fun max(a: Int, b: Int) = if (a > b) a else b



}