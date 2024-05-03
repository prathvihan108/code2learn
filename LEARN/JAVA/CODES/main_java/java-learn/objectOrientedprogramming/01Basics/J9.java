//exceptions in java
//checked unchecked exception
//throw vs throws keywords
//custom exceptions
public class J9 {

    public static void main(String[] args) {
        try {
            // ArithmeticException
            int result = divideByZero();
            
            // ArrayIndexOutOfBoundsException
            int[] array = {1, 2, 3};
            accessArrayElement(array, 5);
            
            // NullPointerException
            String nullString = null;
            int length = nullString.length();
            
            // IllegalArgumentException
            validateAge(-5);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }

    // ArithmeticException example
    private static int divideByZero() {
        return 5 / 0;
    }

    // ArrayIndexOutOfBoundsException example
    private static void accessArrayElement(int[] array, int index) {
        int value = array[index];
        System.out.println("Array element at index " + index + ": " + value);
    }

    // NullPointerException example
    private static void nullPointerExceptionExample() {
        String nullString = null;
        int length = nullString.length();
        System.out.println("String length: " + length);
    }

    // IllegalArgumentException example  //
    private static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");//this is checked exception providedin java 
                                                                            //itself,and user needs to throw an exception explictly using throw keyword
        }
        System.out.println("Valid age: " + age);
    }
}
