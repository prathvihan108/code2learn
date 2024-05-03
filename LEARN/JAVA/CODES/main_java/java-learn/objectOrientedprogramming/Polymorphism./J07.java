/*
 * In Java, the Comparator interface is used to define a comparison method for objects that don't 
 * necessarily have a natural ordering. It allows you to compare objects based on specific criteria. 
 * Here's a simple example demonstrating the use of the Comparator interface to compare objects based on their values:
 */
//Comparator is a functional interface(Has only one abstract methods)  these can alsobe converted to lambds functions
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class J07 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        // Using an anonymous class to implement Comparator
        //we should use anonymous class only when we have a litttle codesicnce comapaator has only one override methods we are using it
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return Integer.compare(person1.age, person2.age);//Integer.compare() compares the innteger valuues
            }
        };

        Collections.sort(people, ageComparator);

        // Display the sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
