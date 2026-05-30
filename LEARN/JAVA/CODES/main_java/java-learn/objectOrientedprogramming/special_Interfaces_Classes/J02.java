/*
 * Using the comprator interface:it is also a fucntional interface ,but rather than the compareTo method it has compare method
 */

import java.util.*;

public class J02 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Define a comparator to sort by age in descending order
        
        //As u can see here that the Person class does not implement the Comparable interface ,then too we can comparathe objects of it by using the comparator interface as s
        //shown in this example
        //In the below line is a anonymous class which is implementing the Comparator interface and overides the compare method and now
        
        //We can convert it to a normal class too .but the code will be lenthy that's it.
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p2.getAge(), p1.getAge()); // Compare in descending order
                //Here too if u exchange the places of the p1 and p2 u will get the objects sorted in the reverse order.
            }
        };

        //we are using the object of the same class "ageComparator" which can be passes as an argument to any object of the collection as shown below

        // Sort the list using the ageComparator
        Collections.sort(people, ageComparator);

        //The following line also works the same as the above line
        people.sort(ageComparator);

        // Print the sorted list
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}



 class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
