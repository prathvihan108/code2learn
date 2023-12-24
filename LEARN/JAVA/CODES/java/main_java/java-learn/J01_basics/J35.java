
//String builder class can be used if we want to do string manipulations
/*
 * 
 * public class StringBuilderExample {
    public static void main(String[] args) {
        // Initialization
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // append(String str)
        stringBuilder.append(", World!");
        System.out.println("Appended String: " + stringBuilder);

        // insert(int offset, String str)
        stringBuilder.insert(5, " Java");
        System.out.println("Inserted String: " + stringBuilder);

        // delete(int start, int end)
        stringBuilder.delete(6, 11);
        System.out.println("After Deletion: " + stringBuilder);

        // reverse()
        stringBuilder.reverse();
        System.out.println("Reversed String: " + stringBuilder);

        // length()
        int length = stringBuilder.length();
        System.out.println("Length: " + length);

        // capacity()
        int capacity = stringBuilder.capacity();
        System.out.println("Capacity: " + capacity);

        // setLength(int newLength)
        stringBuilder.setLength(5);
        System.out.println("After setLength: " + stringBuilder);

        // toString()
        String finalString = stringBuilder.toString();
        System.out.println("Final String: " + finalString);
    }
}

 */
public class J35 {
    public static void main(String[] args) {
        // Initialization
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // append(String str)
        stringBuilder.append(", World!");
        System.out.println("Appended String: " + stringBuilder);

        // insert(int offset, String str)
        stringBuilder.insert(5, " Java");
        System.out.println("Inserted String: " + stringBuilder);

        // delete(int start, int end)
        stringBuilder.delete(6, 11);
        System.out.println("After Deletion: " + stringBuilder);

        // reverse()
        stringBuilder.reverse();
        System.out.println("Reversed String: " + stringBuilder);

        // length()
        int length = stringBuilder.length();
        System.out.println("Length: " + length);

        // capacity()
        int capacity = stringBuilder.capacity();
        System.out.println("Capacity: " + capacity);

        // setLength(int newLength)
        stringBuilder.setLength(5);
        System.out.println("After setLength: " + stringBuilder);

        // toString()
        String finalString = stringBuilder.toString();
        System.out.println("Final String: " + finalString);
    }
}

