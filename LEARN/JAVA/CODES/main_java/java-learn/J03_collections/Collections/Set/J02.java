
//What happens when u are trying to add a duplicate element in the set
//returns false
//Note:ThreadSafe-->Synchronised|| ThreadUnsafe-->Not Synchronised
import java.util.HashSet;

public class J02 {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> set = new HashSet<>();

        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Try to add an element that is already present
        boolean added = set.add("Apple");//this retuens false;

        // Check if the element was added
        if (added) {
            System.out.println("Element 'Apple' added successfully");
        } else {
            System.out.println("Element 'Apple' already present, not added again");
        }

        // Display size of the set
        System.out.println("Size of set: " + set.size());
    }
}

