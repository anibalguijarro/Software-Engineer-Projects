/*
 * Encapsulation is the concept of restricting direct access to some of an object's components,
 * which is done by making fields private and accessing them through public getter and setter methods.
 */

public class ClassTwo{
    public static void main(String[] args){
        // Create an object of ClassOne
        ClassOne person = new ClassOne();

        // Set values using setters
        person.setName("Alice");
        person.setAge(25);

        // Get values using getters and print them
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}