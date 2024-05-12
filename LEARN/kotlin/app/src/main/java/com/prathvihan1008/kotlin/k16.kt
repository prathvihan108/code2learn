/*
Higher order functions:

A function which can accept a function as a parameter or can returns a function is called higher order function.
Kotlin functions can be stored in variables and data structure passed as arguments to and returned from other higher-order functions

 */
package com.prathvihan1008.kotlin

fun main()
{
    highOrder(printMe,add)//here we are passing the lambda variable to another function

}

val printMe={ println("Hello world") }///this is a lambda function  who is referenced by variable printMe
var add:(Int,Int)->Int={x,y->x+y}
val retFunc:(Int,Int)->String={a,b->"The sum is"+{a+b}}

fun highOrder(a:()->Unit,b:(Int,Int)->Int) : (Int,Int)->String
//The return type of the above function is "(Int,Int)->String " which means it returns a function which accepts 2 int values and returns a string
{//here the parameter a is a of type ()->Unit(i.e)It accepts no arguments and returns a Unit

    //using the passed function inside a heigher order function


    a()//here we are calling the function
    b(2,3) //here also the code inside the body of lambda function executes but we will not be able to see the result,since we are not receiving
    retFunc(4,4)//here we are executing the code and the same function is going to be returned
    println("The sum is"+b(2,3))

    return retFunc

}




