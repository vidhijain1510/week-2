class Employee {
    String name;
    String position;
    
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    //Method to display
    public void displayInfo() {
        System.out.println("Employee: " + name + position);
    }
}
//Department class containing employees
class Department {
    String name;
    Employee employee1;
    Employee employee2;
    
    public Department(String name) {
        this.name = name;
    }
    
    public void addEmployees(Employee emp1, Employee emp2) {
        this.employee1 = emp1;
        this.employee2 = emp2;
    }
    
    public void displayInfo() {
        System.out.println("Department: " + name);
        if(employee1 != null) employee1.displayInfo();
        if(employee2 != null) employee2.displayInfo();
    }
}

//Company class containing departments
class Company {
    String name;
    Department dept1;
    Department dept2;
    
    public Company(String name) {
        this.name = name;
    }
    
    public void addDepartments(Department dept1, Department dept2) {
        this.dept1 = dept1;
        this.dept2 = dept2;
    }
    
    public void displayInfo() {
        System.out.println("Company: " + name);
        if(dept1 != null) dept1.displayInfo();
        if(dept2 != null) dept2.displayInfo();
    }
}
class CompanyStructure {
    public static void main(String[] args) {
        //Creating a Company object
        Company company = new Company("Capgemini");
        
        //Creating objects for departments
        Department hrDept = new Department("HR");
        Department itDept = new Department("IT");
        
        //Creating objects for employees
        Employee emp1 = new Employee("Yaman", "HR Manager");
        Employee emp2 = new Employee("Vidhi", "HR Assistant");
        Employee emp3 = new Employee("Kapil", "IT Lead");
        Employee emp4 = new Employee("Mohit", "Developer");
        
        //Adding employees to departments
        hrDept.addEmployees(emp1, emp2);
        itDept.addEmployees(emp3, emp4);
        
        //Adding departments to company
        company.addDepartments(hrDept, itDept);
        
        //Displaying company structure
        company.displayInfo();
        
        //When company object is set to null, all departments and employees
        //will be eligible for garbage collection (composition)
        company = null;
    }
}