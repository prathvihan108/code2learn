
//We can also have geenric methods
//We can also return an element of generic from a method
public class J13{
    public static <T> void printData(T data) {//we can also passs more than one generic datatype too <T,Y>//T,Y are not keuwords 
        System.out.println("Data: " + data);
    }

    public static void main(String[] args) {
        // Example with Integer
        printData(42);

        // Example with String
        printData("Hello, Generics!");

        // Example with Double
        printData(3.14);

        // Example with custom class
        printData(new Point(10, 20));
    }

    // Example custom class
    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}
