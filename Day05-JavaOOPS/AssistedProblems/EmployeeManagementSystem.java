/*Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, 
like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods. */


//Base class Employee with attributes like name, id, and salary, and a method displayDetails().
abstract class Employee{
    private String name;
    private String id;
    private float salary;

    //Constructor
    Employee(String name, String id, float salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //Getters
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public float getSalary(){
        return salary;
    }

    //Method displayDetails()
    void displayDetails(){
        System.out.println("Name: " + name + " | ID: " + id + " | Salary: " + salary);
    }
}

//subclasses Manager unique attributes teamSize
class Manager extends Employee{
    private int teamSize;

    //Getter
    public int getTeamSize(){
        return teamSize;
    }

    //Constructor
    Manager(int teamSize, String name, String id, float salary){
        this.teamSize = teamSize;
        super(name, id, salary);
    }

    //Method overriding of displayDetails() from super class
    @Override
    void displayDetails(){
        System.out.println("Name: " + getName() + " | ID: " + getId() + " | Salary: INR" + getSalary() + " | Team size: " + teamSize );
    }
}
//subclasses Developer unique attributes programmingLanguage
class Developer extends Employee{
    private String programmingLanguage;

    //Getter
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }

    //Constructor
    Developer(String programmingLanguage, String name, String id, float salary){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    //Method overriding of displayDetails() from super class
    @Override
    void displayDetails(){
        System.out.println("Name: " + getName()+ " | ID: " + getId() + " | Salary: INR" + getSalary() + " | Programming Language: " + programmingLanguage );
    }
}

//subclasses Intern unique attributes internShipDuration
class Intern extends Employee{
    private double internShipDuration;

    //Getter
    public double getInternShipDuration(){
        return internShipDuration;
    }

    //Constructor
    Intern(double internShipDuration, String name, String id, float salary){
        this.internShipDuration = internShipDuration;
        super(name, id, salary);
    }

    //Method overriding of displayDetails() from super class
    @Override
    void displayDetails(){
        System.out.println("Name: " + getName()+ " | ID: " + getId() + " | Salary: INR" + getSalary() + " | InternShip Duration in months: " + internShipDuration);
    }
}

public class EmployeeManagementSystem{
    public static void main(String[] args) {
        Employee manager = new Manager(2, "Yaman", "183", 30000);
        manager.displayDetails();
        Employee developer = new Developer("Java", "Vidhi", "179", 35000);
        developer.displayDetails();
        Employee intern = new Intern(2, "Kapil", "078", 15000);
        intern.displayDetails();
    }
}