//Compiletime polymorphism can also be achieved through inheritance
//
class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class J02 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Polymorphism in action
        drawShape(shape);      // Calls the draw method in Shape
        drawShape(circle);     // Calls the draw method in Circle
        drawShape(rectangle);  // Calls the draw method in Rectangle
    }

    // Method overloading for compile-time polymorphism
    private static void drawShape(Shape shape) {
        shape.draw();
    }
}

