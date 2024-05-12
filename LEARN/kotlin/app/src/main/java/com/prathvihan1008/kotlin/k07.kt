//pairs and triples
//we can store 2 values in a single instance using the pair
package com.prathvihan1008.kotlin

class k07 {
    companion object{
        @JvmStatic
        fun main(args:Array<String>)
        {
            var (a,b)=Pair("A",true)
            println("$a $b")

            var c=Pair("Rahul",34)
            println(c.first+c.second)
            //or
            println("${c.first}  ${c.second}")//

            //Triple
            //we can store the 3 values in  a single instance of object
            //we can even make the nested pairs and triples
            //we can even use the triples and pairs for returning from the methods
            var t=Triple("Rahul",34,"assam")
            println(t.first+t.second+t.third)
        }
    }
}