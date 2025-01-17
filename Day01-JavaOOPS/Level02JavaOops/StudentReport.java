/*Program to Simulate Student Report
Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.
Explanation: The Student class organizes all relevant details about a student as attributes. 
Methods are used to calculate the grade and provide a way to display all information.
*/
import java.util.*;


class Student{
    String name;
    String rollNumber;
    double marks;

    //Constructer
    public Student(String name, String rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    //Method to calculate grades
    char calculateGrade(double marks){
        char grade;
        if(marks > 80){
            grade = 'A';
        }else if(marks > 70 && marks <=89){
            grade = 'B';
        }else{
            grade = 'F';
        }

        return grade;
    }

    //method to display grades 
    void display(char grade){
        System.out.println("Name: " + name + "\nRollnumber: " + rollNumber + "\nMarks: " + marks + "\nGrade: " + grade);
    }
}

public class StudentReport{
    public static void main(String[] args){
        //to take user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");//input name
        String name = input.nextLine();
        System.out.println("Enter rollNumber: ");//Input rollNumber
        String rollNumber = input.nextLine();
        System.out.println("Enter marks: ");//Input marks
        double marks = input.nextDouble();

        //Creating object to call method
        Student student = new Student(name, rollNumber, marks);
        char grade = student.calculateGrade(marks);//Calling calculateGrade method
        student.display(grade); //Calling display method
    
        input.close();
    }
}
