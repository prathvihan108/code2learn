//Object passing
//reassigning the objects inside the methods do not affect the original object reference
    
    class Person {
        String name;
    
        Person(String name) {
            this.name = name;
        }

          static void modifyPersonName(Person person) {
        person.name = "John";
        
        // Reassigning the reference won't affect the original reference outside the method
        person = new Person("AnotherPerson");
    }
    
    }
   public class J04 { //main class 
 
    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.modifyPersonName(person);
        System.out.println(person.name); // Prints "John"
    }
    
}
