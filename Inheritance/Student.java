/*
 * --> Subclass (child) <-- 
 * This class extends the Person class and represents a student with additional attributes
 */
public class Student extends Person{
    // Fields to store the student's ID and grade.
    private int studentID;
    private float grade;

    // Constructor to initialize a student object with personal and academic data
    public Student(String name, String lastname, int age, int studentID, float grade){
        super(name, lastname, age);
        this.studentID = studentID;
        this.grade = grade;
    }

    // Displays the student's full data including inherited and specific fields
    public void showData(){
        System.out.println("Name: " + getName() 
            + "\nLastname: " + getLastname()
            + "\nAge: " + getAge()
            + "\nID: " + studentID
            + "\nGrade: " + grade);
    }

}
