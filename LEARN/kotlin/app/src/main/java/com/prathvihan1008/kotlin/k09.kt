//Constructors in kotlin
//PrimaryConstructors
/*
A constructor is a special member function that is invoked when an object of a class is created primarily to initialised the
variable or properties

A class need to have a constructor and if we do not declare a constructor,then a compiler generates a default constructor

//The constructors in the kotlin are different than java in the following ways
1.Default constructor
2.Parameterised constructor
*/
/*
Kotlin has two types of parameterised constructors-
1.primary constructor
2 secondary constructor/CustomConstructor
 */
/*
A class in kotlin can have at most one primary constructor and one or more custom/secondary constructor
A primary constructor initializes the class while the secondary constructor is used to initialise the class and introduce some extra logic.
 */


package com.prathvihan1008.kotlin

fun main(){
    var obj1=k09(2,3) //here we are calling the parameterised constructor
   // var obj2=k09() since we have already mentioned the primary constructor in this class,we can not create an object in this way
    obj1.display()



    //the following lines are for the secondary constructor object creation
    var obj2=ClassB(2,4)
    var obj3=ClassB(2,3,4)
    var obj4=ClassB(d=10,c=3)//here we are only passing the values for the c and d ,so the default values for the a and b wil  be used

}



//Below shows the primary constructor
class k09  constructor(a:Int,b:Int){  //"The constructor key word is redundant"

    var A:Int=0
    var B:Int=0

    /*
Primary constructor:primary constructor do not contain any code ,the initialisation code can be placed in the separate
 initializer block prefixed with the init keyword
 */
    init {
        this.A=a
        this.B=b
    }




    fun display(){
        println(A+B)
    }
}

//Below shows the secondary constructor /custom constructor
//we can not have both the primary and secondary constructor at a same class
class ClassB {

    var A:Int=0
    var B:Int=0
    var C:Int=0
    var D:Int=0

    //note:Init block can still be there even though we are not included the primary constructor
    //this block executes automatically when the object of a class is created
//    init {
//        this.A=a
//        this.B=b
//    }

    //below is how the secondary constructor is declared
    constructor(a:Int,b:Int){
        this.A=a
        this.B=b
    }
    constructor(a:Int,b:Int,c:Int){
        this.A=a
        this.B=b
        this.C=b
    }

    //As shown in below constructor we can even have the default values for the parameters,these values will be used if we do not provide any values for a and b
    constructor(a:Int=3,b:Int=60,c:Int,d:Int){
        this.A=a
        this.B=b
        this.C=b
    }

    fun display1(){
        println(A+B)
    }
    fun display2(){
        println(A+B+C)
    }



}