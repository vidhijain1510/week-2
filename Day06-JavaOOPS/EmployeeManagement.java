/*Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing
calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the
Employee reference.*/

abstract class Employee{
    private String employeeId;
    private String name;
    private double baseSalary;

    //Constructor
    Employee(String employeeId, String name, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //Getter and Setters
    public String getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(){
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //Abstract method
    public abstract double calculateSalary();

    //Concrete method
    void displayDetails(){
        System.out.println("Employee id: " + employeeId + " \nEmployee Name: " + name + "\nBase Salary: " + baseSalary + "\nTotal Salary: " + calculateSalary());
    }
}

//Department Interface
interface Department {
    void assignDepartment(String departmentName);
    void getDepartmentDetails();
}

//Subclass FullTimeEmployee
class FullTimeEmployee extends Employee implements Department{
    final private double monthlyBonus;
    private String department;
    //Constructor
    FullTimeEmployee(String employeeId, String name, double baseSalary, double monthlyBonus){
        super(employeeId,name,baseSalary);
        this.monthlyBonus = monthlyBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + monthlyBonus;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}

//Subclass  PartTimeEmployee
class PartTimeEmployee extends Employee implements Department{
    final private int hoursWorked;
    final private double hourlyRate;
    private String department;

    //Constructor
    PartTimeEmployee(String employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate){
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}
//Main class
public class EmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("FT179","Vidhi",5000,500);
        fullTimeEmployee.calculateSalary();
        fullTimeEmployee.assignDepartment("IT");
        fullTimeEmployee.displayDetails();
        fullTimeEmployee.getDepartmentDetails();

        System.out.println();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("PT183","Yaman", 500,15,100);
        partTimeEmployee.calculateSalary();
        partTimeEmployee.assignDepartment("HR");
        partTimeEmployee.displayDetails();
        partTimeEmployee.getDepartmentDetails();
    }
}