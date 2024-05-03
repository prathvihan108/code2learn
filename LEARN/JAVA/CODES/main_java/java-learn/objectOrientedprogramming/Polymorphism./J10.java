//Same comparator code done using lambda functions
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

public class J10 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        // Using Comparator to sort based on age
        Comparator<Person> ageComparator = Comparator.comparingInt(person -> person.age);
        Collections.sort(people, ageComparator);

        // Display the sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}


