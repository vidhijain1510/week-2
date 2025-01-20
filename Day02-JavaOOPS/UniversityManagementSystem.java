/*Problem 1: University Management System
Create a Student class with:
rollNumber (public).
name (protected).
CGPA (private).
Write methods to:
Access and modify CGPA using public methods.
Create a subclass PostgraduateStudent to demonstrate the use of protected members. */
class Student{
    //Instance variable
    public int rollNumber;
    protected String name;
    private double CGPA;

    //Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    //Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    //Setter for CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {  //CGPA is within a valid range
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

//Subclass PostgraduateStudent
class PostgraduateStudent extends Student{

    //Constructor for postgraduate student
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA); //Calling the parent constructor
    }

    //Method to display postgraduate student details, demonstrating access to protected member 'name'
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);  // Direct access to public rollNumber
        System.out.println("Name: " + name);  // Accessing the protected 'name' from superclass
        System.out.println("CGPA: " + getCGPA());  // Accessing private 'CGPA' via public getter method
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        //Creating a Student object
        Student object1 = new Student(101, "Alice", 8.5);
        object1.displayDetails();

        //Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent1 = new PostgraduateStudent(201, "Bob", 9.2);
        pgStudent1.displayPostgraduateDetails();

        //Modify CGPA using public setter method
        object1.setCGPA(9.0);
        System.out.println("Updated Student 1 CGPA: " + object1.getCGPA());

        //Try setting an invalid CGPA
        object1.setCGPA(12.0);  // Invalid CGPA
    }
}
