//generic classes
/*
 * Generics in Java allow you to create classes, interfaces,
 *  and methods that operate with types specified later (parameterized types). 
 * This enhances code reusability and type safety by letting you define classes
 *  and methods that can work with any data type.
 * examples may include Arrays lists...
 */
// A generic class that can hold any type of data
class Box<T> {
    private T data;

    // Constructor
    public Box(T data) {
        this.data = data;
    }

    // Getter method
    public T getData() {
        return data;
    }

    // Setter method
    public void setData(T data) {
        this.data = data;
    }
}

public class J12 {
    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> intBox = new Box<>(42);
        System.out.println("Integer Box: " + intBox.getData());

        // Creating a Box for String
        Box<String> stringBox = new Box<>("Hello, Generics!");
        System.out.println("String Box: " + stringBox.getData());

        // Creating a Box for Double
        Box<Double> doubleBox = new Box<>(3.14);
        System.out.println("Double Box: " + doubleBox.getData());
    }
}
