
//simple program to demonstrate the class creation and a object creation in kotlin
package com.prathvihan1008.kotlin


fun main(args:Array<String>){
    //create an object to access the members of a class and methods of a class
    //Basically in the following line we are calling the default constructor of the class k08
    //we do not use the new keyword in kotlin similar to java ,it follows a better syntax
    var obj=k08()
    println("${obj.someInt}")

    //or
    //we can also directly create the object at the time we need to access the particular member ,this is useful when we
    //want to use that object of only that specific purpose
    println("${k08().add(2,4)}")

}
class k08 {

    var someInt=4
    fun add(a:Int,b:Int):Int{
        return a+b
    }
}