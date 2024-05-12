//Some other types of forEach syntaxes:
//Note :For every syntax ur writing,make sure u register a click for that syntax ur mind so that u can easily grab the similar syntax
package com.prathvihan1008.kotlin


class k06 {

    companion object{
       @JvmStatic
       fun main(args:Array<String>){
           val list = listOf("apple", "banana", "orange")
           list.forEach { item ->
               println(item)
           }
           //In the above syntax the forEach is a high level function in kotlin which takes an lambda function as an argument
           //we know that the arguments are entered in () but if the the arguments is an lambda and is the last argument then we can write it outside of the ()

           // 2. forEach loop on an Array
           val array = arrayOf(1, 2, 3, 4, 5)
           array.forEachIndexed { index, value -> // Using forEachIndexed to access both index and value
               println("Index: $index, Value: $value")
           }

           // 3. forEach loop on a Map
           val map = mapOf("a" to 1, "b" to 2, "c" to 3)
           map.forEach { (key, value) -> // Destructuring declaration to access key and value
               println("Key: $key, Value: $value")
           }

           (1..5).forEach { number -> // Using a range (1..5) to iterate from 1 to 5
               println(number)
           }
       }
    }
}