//Note :In object-oriented programming, one interface cannot directly implement another interface. 
//Instead, one interface can extend another interface. The process is referred to as interface 
//inheritance or interface extension.

//one interface can extend another interface 
// Superinterface
interface Shape {
    void draw();
}

// Subinterface inheriting from Shape
interface Circle extends Shape {
    double getRadius();
}

// Implementing class
class CircleImplementation implements Circle { //this class now need to provide implementation for the
    // abstract methods whicch are also present in shape interface since circle extends shape interface
    private double radius;

    public CircleImplementation(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double getRadius() {
        return radius;
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Circle circle = new CircleImplementation(5.0);
        circle.draw();
        System.out.println("Circle Radius: " + circle.getRadius());
    }
}
