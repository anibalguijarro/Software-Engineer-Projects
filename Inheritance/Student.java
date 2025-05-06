public class Student extends Person{
    private int studentID;
    private float grade;

    public Student(String name, String lastname, int age, int studentID, float grade){
        super(name, lastname, age);
        this.studentID = studentID;
        this.grade = grade;
    }

    public void showData(){
        System.out.println("Name: " + getName() 
            + "\nLastname: " + getLastname()
            + "\nAge: " + getAge()
            + "\nID: " + studentID
            + "\nGrade: " + grade);
    }

}