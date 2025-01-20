/*Sample Program 3: Employee Management System
Design an Employee class with the following features:
Static:
A static variable companyName shared by all employees.
A static method displayTotalEmployees() to show the total number of employees.
This:
Use this to initialize name, id, and designation in the constructor.
Final:
Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof:
Check if a given object is an instance of the Employee class before printing the employee details. */

class Employee{
    String name;
    final int id;//Final variable id
    String designation;

    // Static variable to keep track of total number of employees
    static int totalEmployees = 0; 
    static String companyName = "Capgemini";//A static variable companyName shared by all employees.


    //Using this to initialize name, id, and designation in the constructor.
    Employee(String name, int id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment totalEmployees each time an Employee object is created
    }
    
    //A static method displayTotalEmployees() to show the total number of employees.
    void displayEmployeeDetails(){
        System.out.println("Employee name: " + name + "\nEmployee ID: " + id + "\nDesignation: " + designation + "\nCompany name: " + companyName);
    }

    //Method to check if an object is an instance of Employee
    public static void checkingInstance(Object obj) {
        if (obj instanceof Employee) {
            System.out.println("The object is an instance of Employee.");
        } else {
            System.out.println("The object is not an instance of Employee.");
        }
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}


public class EmployeeManagementSystem{
    public static void main(String[] args) {

        Employee employee1 = new Employee("Alice", 05, "HOD");
        //Displaying employee details
        employee1.displayEmployeeDetails();
        //Display total number of employees
        Employee.displayTotalEmployees();
        //Using instanceof to print details
        Employee.checkingInstance(employee1);

        System.out.println();
        Employee employee2 = new Employee("BOb", 06, "Director");
        //Displaying employee details
        employee2.displayEmployeeDetails();
        // Display total number of employees
        Employee.displayTotalEmployees();
        // Use instanceof to print details
        Employee.checkingInstance(employee2);

    }
}