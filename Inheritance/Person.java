/*
 * --> Superclass (parent) <-- 
 * This class can be extended by more specific type of people.
 */
public class Person{
    // Fields to store the person's name, lastname, and age
    private String name;
    private String lastname;
    private int age;

    // Constructor to initialize a Person object with name, lastname and age
    public Person(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    // Getters
    public String getName(){
        return name;
    }

    public String getLastname(){
        return lastname;
    }

    public int getAge(){
        return age;
    }

}