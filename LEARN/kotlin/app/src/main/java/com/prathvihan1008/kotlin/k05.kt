
//foreach loops in kotlin
package com.prathvihan1008.kotlin

class k05 {

    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            for (i in 1..10 step 2) { //includes the full range
                println(i)
            }

            for (i in 0 until 10 step 2) {//excludes the last element
                println(i)
            }

            for (i in 10 downTo 0 step 2) {//reverse loop
                println(i)
            }

            //Traversing in an array
            //The following way of declaring an arraylists also works,but never in kotlin u use new keyword
//         //--> var arr1 :ArrayList<Int>
//               arr1=ArrayList()
//               arr1.add(3)

            //-->//var arr1 :ArrayList<Int> =ArrayList<Int>()
            var arr=ArrayList<Int>()//simply u can concisely use this
            arr.add(3)
            arr.add(4)

            for(i in arr){
                println(i)
            }


        }



    }
}