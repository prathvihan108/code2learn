//Generic
//Generic is defined as the product without a brand name
//A generic type is a class or method that is parameterised over types.
//we always use () to specify the type parameters in the program.
/*
Generic are the powerful features that allow us to define classes ,methods and properties which
are accessible using the different data types while keeping a check of the compile type safety

Advantages of generics:
1.Type casting is evitable:No need to type cast an object,for example "Any"type to "Int"  or "String" etc
2.Type Safety:Generic allows only single type of object at a time
3.Compile time safety-generic code is checked at compile time for the parameterised type so that it avoids run time error
4.No need to create the separate classes for different types
 */

package com.prathvihan1008.kotlin

fun main(){

    // val genclass=GenClass<Int>(3)//this line is also correct.

    val genclass=GenClass(3)//we can simply use this as show  in  this line,kotlin automatically detects the type based on the value initialised
    val genclass2=GenClass("Hello")
}

class GenClass<T>(value:T){
 init{
     println("The value is "+value)
     //check<T>(value)
     //or
     check(value)
 }

    fun<T> check(value:T){
        println("Received:"+value)

    }
}