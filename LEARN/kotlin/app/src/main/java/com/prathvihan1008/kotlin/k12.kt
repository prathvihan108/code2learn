//Interfaces in kotlin: same as java interfaces
///we can implement the multiple inheritance using the interfaces
//Abstract classes are also similar to the java concepts
//you cannot create an object of an abstract class ,but u can only inherit them and must override the abstract methods
package com.prathvihan1008.kotlin

// Define an interface named 'Shape'
interface Shape {
    // Abstract method to calculate area
    fun calculateArea(): Double

    // Abstract method to calculate perimeter
    fun calculatePerimeter(): Double
}

// Implement the Shape interface with a class named 'Rectangle'
//the kotlin compiler is capable of identifying automatically weather the it is a class or interface
class Rectangle(val width: Double, val height: Double) : Shape {
    // Implement the calculateArea() method
    override fun calculateArea(): Double {
        return width * height
    }

    // Implement the calculatePerimeter() method
    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}

// Implement the Shape interface with a class named 'Circle'
class Circle(val radius: Double) : Shape {
    // Implement the calculateArea() method
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    // Implement the calculatePerimeter() method
    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

// Main function to demonstrate interfaces
fun main() {
    // Create a Rectangle object
    val rectangle = Rectangle(5.0, 3.0)
    // Call methods defined in the Shape interface
    println("Rectangle Area: ${rectangle.calculateArea()}")
    println("Rectangle Perimeter: ${rectangle.calculatePerimeter()}")

    // Create a Circle object
    val circle = Circle(4.0)
    // Call methods defined in the Shape interface
    println("Circle Area: ${circle.calculateArea()}")
    println("Circle Circumference: ${circle.calculatePerimeter()}")
}
