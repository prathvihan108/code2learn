package com.prathvihan1008.kotlin
//Lambda function:It is a function without a name ,also known as anonymous functions
/*
Lambda function can be referenced by variables ,or passed to other methods

The following is the syntax
{parameter1,parameter2,parameter_n ->  BODY}
{x,y->x+y}
{x->x*X}
{str->println(str)}
 */

fun main(){
    println("The square:"+k15.Square(4))//u can access this using the class name since it is static
    println("The square:"+k15.sqr(4))

    println("The addition:"+k15.add(4,5))

    k15.printName() //here we are calling the lambda expression without any input and output
    k15.printName1("Rahul")

}

class k15 {



    companion object{
        //normal function for calculating the square
        fun Square(a:Int):Int{
            return a*a
        }

        //Using the Lambda functions
        var sqr:(Int)->Int ={x->x*x}
        var add:(Int,Int)->Int={x,y->x+y}
        //or
        //In the below case we have only mentioned the type if input the lambda takes ,out put is determined automatically
        var sqr1 ={x:Int->x*x}
        //the above syntax is as explained below:
        /*
        sqr:  is the name of the variable which holds the reference to lambda function {x->x*x}
        (Int)->Int : this specifies the type of the variable sqr(It is a lambda type): input the anonymous function (Lambda function)takes and the return type of it
        {x->x*x}:  this tells that the anonymous function takes x as input and then performs the operation in the body
         */

        var printName={println("Hello world")}  //in this lambda expression we do not have any input type,and output type since we are only printing

        var printName1:(String)->Unit={str->println("Hello $str")}
        //now we can pass the above variables to another functions


    }

}