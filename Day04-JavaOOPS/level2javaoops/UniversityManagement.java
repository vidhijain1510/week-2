import java.util.ArrayList;

class Faculty {
    private String name;

    // Constructor
    public Faculty(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

class Department {
    private String name;

    // Constructor
    public Department(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

// University class
class University {
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    // Constructor
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Adding a department (composition)
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Adding a faculty member (aggregation)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Displaying departments
    public void displayDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println("- " + department.getName());
        }
    }

    // Displaying faculty members
    public void displayFaculties() {
        System.out.println("Faculty members associated with " + name + ":");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getName());
        }
    }

    // Deleting university (composition relationship)
    public void deleteUniversity() {
        System.out.println("Deleting university " + name + "...");
        departments.clear(); // All departments are deleted
        System.out.println("All departments removed.");
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        // Creating object for University
        University university = new University("Tech University");

        // Creating object for Department
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Electrical Engineering");

        // Adding departments to university
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        // Creating faculty members
        Faculty faculty1 = new Faculty("Dr. Alice");
        Faculty faculty2 = new Faculty("Dr. Bob");

        // Adding faculty members to university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Displaying information
        university.displayDepartments();
        university.displayFaculties();

        // Deleting university
        university.deleteUniversity();

        // Displaying departments again (should be empty)
        university.displayDepartments();
    }
}
