 /*Sample Program 5: University Student Management
Create a Student class to manage student data with the following features:
Static:
A static variable universityName shared across all students.
A static method displayTotalStudents() to show the number of students enrolled.
This:
Use this in the constructor to initialize name, rollNumber, and grade.
Final:
Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
Check if a given object is an instance of the Student class before performing operations like displaying or updating grades. */
 
 class Student {
    //Static variables
    static String universityName = "BridgeLabz";
    static int totalStudents = 0;

    //Final variable for roll number
    final int rollNumber;
    String name;
    String grade;

    //Constructor
    public Student(String name, String grade, int rollNumber) {
        this.name = name;
        this.grade = grade;
        this.rollNumber = rollNumber;
        totalStudents++;
    }

    //Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    //Method to display student details
    public void displayStudentDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Grade: " + this.grade);
        System.out.println("University: " + universityName);
    }

    //Method to update the grade
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }

    //Static method to check if an object is an instance of Student
    public static boolean isInstanceOfStudent(Object obj) {
        return obj instanceof Student;
    }
}

class UniversityStudentManagement {
    public static void main(String[] args) {
        //Creating objects
        Student student1 = new Student("Jain", "A", 105);
		
        Student student2 = new Student("Ross", "B", 102);

        //Displaying student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        //Display total students
        Student.displayTotalStudents();

        //Update grade for student1
        student1.updateGrade("A+");

        System.out.println("\nAfter updating grade:");
        student1.displayStudentDetails();

        //Checks if student1 is an instance of Student
        System.out.println("\nIs student1 an instance of Student? " + Student.isInstanceOfStudent(student1));
    }
}
