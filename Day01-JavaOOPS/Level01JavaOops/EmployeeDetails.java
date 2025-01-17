/*Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. 
Add a method to display the details.
*/

import java.util.*;
class Employee {
    String name;
    int id;
    double salary;

    //Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name + ", id: " + id + ", salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
		
		//To take user input
        Scanner input = new Scanner(System.in);
		
		//Taking user input for name, id and salary
		System.out.println("Enter name of Employee: ");
        String name = input.nextLine(); //Name input
		System.out.println("Enter id of Employee: ");
        int id = input.nextInt();//id input
		System.out.println("Enter salary of Employee: ");
        double salary = input.nextDouble();//Salary input
        Employee employee = new Employee(name, id, salary);
        employee.displayDetails(); //Calling method to display 
		
		input.close();
    }
}

