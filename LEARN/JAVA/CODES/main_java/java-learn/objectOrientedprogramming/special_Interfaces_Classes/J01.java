//Comparable and Comparators:Uses and applications
/*
 * In Java, if you want to compare objects, you can either use the Comparable interface or the Comparator interface.

    Comparable: It allows the objects to be compared based on their natural ordering. 
    To use Comparable, the class of the objects being compared needs to implement the Comparable interface and override the compareTo() method.

    Comparator: It allows for custom comparison logic separate from the class being compared.
     You can create a separate class that implements the Comparator interface and override the compare() method.

So, in summary:

    Use Comparable when you want to define the natural ordering of objects within the class itself.
    Use Comparator when you want to define multiple ways of comparing objects or when you can't modify the class itself.


 */
/*
  Note:Not all the classes by default implement the comparable interface
 * Integer and String classes in Java implement the Comparable interface by default.

    Integer: It compares Integer objects numerically.
    String: It compares String objects lexicographically, which means it compares them based on their Unicode values.
 */
import java.util.*;
public class J01 implements Comparable<J01> {
    private int value;

    public J01(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(J01 other) {
        // Sort in increasing order by comparing other to this
        return Integer.compare(this.value, other.value);  //by interchanging the "this" and "other" we can reverse the sorting too
         
        // Sort in decreasing order by comparing this to other
        //return Integer.compare(this.value, other.value);  
    }

    public static void main(String[] args) {
        List<J01> integers = new ArrayList<>();
        integers.add(new J01(5));
        integers.add(new J01(3));
        integers.add(new J01(8));
        
        Collections.sort(integers);

        for (J01 integer : integers) {
            System.out.println(integer.getValue());
        }
    }
}

