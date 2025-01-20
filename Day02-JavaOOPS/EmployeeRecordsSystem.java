
class Employee {
    //Instance variables
    public int employeeID;    
    protected String department; 
    private double salary; 

    //Constructor to initialize Employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    //Getter method for salary
    public double getSalary() {
        return salary;
    }

    //Setter method for salary
    public void setSalary(double salary) {
        if (salary > 0) {  // Prevent setting a negative salary
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive!");
        }
    }

    //Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID + "\nDepartment: " + department + "\nSalary: INR" + salary);
    }
}

//Manager class - subclass of Employee
class Manager extends Employee {

    //Constructor for Manager that calls the constructor of the Employee class
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);  //Calling the parent class constructor
    }

    // Method to display details of the Manager
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);       // Accessing public employeeID
        System.out.println("Department: " + department);        // Accessing protected department
        System.out.println("Salary: INR" + getSalary());          // Accessing private salary via getter
    }
}

// Main class to test the system
public class EmployeeRecordsSystem {
    public static void main(String[] args) {
        //Creating an Employee object
        Employee employee1 = new Employee(1, "Engineering", 75000);
        employee1.displayEmployeeDetails();  // Display details of the employee

        //Modify the salary using setter method
        employee1.setSalary(80000);
        System.out.println("Updated Employee 1 Salary: INR" + employee1.getSalary());

        //Creating a Manager object
        Manager manager1 = new Manager(2, "Management", 120000);
        manager1.displayManagerDetails();  // Display details of the manager

        //Modify the manager's salary
        manager1.setSalary(130000);
        System.out.println("Updated Manager 1 Salary: INR" + manager1.getSalary());
    }
}

