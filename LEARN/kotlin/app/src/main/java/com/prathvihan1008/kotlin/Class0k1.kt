/*
//Creating a class:
//Class in kotlin are by default public & final ,so inorder to extent we need to open a class using the 'open' keyword
//":" is used for extending a class or implementing a interface ,u can use comma if a class need to extend as well as implement
//To use "Protected "access modifier we must open the class
 */

package com.prathvihan1008.kotlin

 open class Class0k1 {
     //used for declaring all the static methods and variables in a class
     companion object{
         @JvmStatic
         //note:Type of the args must be Array Of Strings not String
         //jvm always looks for this function
         fun main(args: Array<String>) {
             println("Hello Kotlin")
         }

     }

}
interface C{
    fun read():Unit
 //"Unit is used when we know that the function is not retrying anything" //however its not compulsory
    //fun is the key word used for declaring the function
// we first write the name of the function and then its type ,same applied to variables
}

//when  ever ur extending a class u are basically creating a object of that class and calling its default constructor

 class B:Class0k1(),C{
    override fun read() {
        println("First kotlin")
    }


}
