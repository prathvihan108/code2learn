//Enums:Enumeration is a named list of constants
/*
Enum constants are not just the mere collection of constants -these can also have properties and methods etc..
Each enum constant act as a separate instance of a class separated by  commas.
Enum constant can be written in both caps or small ,but caps is recommended

 */
/*


Enumeration uses in the app development
Representing Options: Enums can represent a fixed set of options or choices within your app. For example, in a weather app, you might use an enum to represent different weather conditions like sunny, cloudy, rainy, etc.

State Management: Enums can be used to manage different states or modes within your app. For instance, in a game app, you might use an enum to represent the different states of a game (e.g., playing, paused, game over).

UI Components: Enums can be used to define UI components or styles. For example, you might use an enum to represent different colors, themes, or styles that are used throughout your app.

Navigation and Routing: Enums can be used to represent different screens or routes within your app. This can help make your navigation code more readable and maintainable.

Error Handling: Enums can be used to represent different types of errors or error states within your app. This can help you handle errors more effectively and provide better error messages to users.
 */
package com.prathvihan1008.kotlin

// Define an enum class named Color
enum class Color(var flag:Int=0) {
    RED(0), GREEN(1), BLUE(2) // Enum constants
}

// Define an enum class with properties and methods
enum class Direction(val angle: Int) {

    //since the following constants act as instances of the enum class so we must pass the parameter which is present at the enum class
    NORTH(0), SOUTH(180), EAST(90), WEST(270); // Enum constants with parameters

    // Method to describe the direction
    fun description(): String {
        return when (this) {
            NORTH -> "Facing North"
            SOUTH -> "Facing South"
            EAST -> "Facing East"
            WEST -> "Facing West"
        }
    }
}

fun main() {
    // Use the enum constants
    val color = Color.RED
    println("Selected color: $color") // Output: Selected color: RED

    for(color in Color.values()){
        if(color.flag==1){
            println("GO")
        }
        else if(color.flag==0){
            println("stop")
        }
        else{
            println("wait")
        }
    }

    // Iterate over enum values
    println("Available colors:")
    for (enumValue in Color.values()) {
        println(enumValue)
    }
    // Output:
    // RED
    // GREEN
    // BLUE

    // Access properties and methods of enum constants
    //we can either create a enum reference as shown below
    val direction = Direction.EAST
    println("Direction: ${direction.description()}") // Output: Direction: Facing East

   //or
    //we can directly access the Enum constant
    println(Direction.WEST)
}
