abstract class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public abstract void displayRole();
}
// Subclass: Teacher 
class Teacher extends Person {
    protected String subject;
    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age); // Calls the constructor of Person
        this.subject = subject;
    }
    // Getter method for subject
    public String getSubject() {
        return subject;
    }
    // Implementing displayRole method
    @Override
    public void displayRole() {
        System.out.println("This is a Teacher. Teaches: " + subject);
    }
}
// Subclass: Student 
class Student extends Person {
    protected String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age); // Calls the constructor of Person
        this.grade = grade;
    }
    // Getter method for grade
    public String getGrade() {
        return grade;
    }
    @Override
    public void displayRole() {
        System.out.println("This is a Student. Grade: " + grade);
    }
}
// Subclass staff created
class Staff extends Person {
    protected String department;
    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age); // Calls the constructor of Person
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    @Override
    public void displayRole() {
        System.out.println("This is a Staff member. Department: " + department);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating objects of different roles
        Person teacher = new Teacher("Yaman", 21, "Mathematics");
        Person student = new Student("Mohit", 20, "10th Grade");
        Person staff = new Staff("Vidhi", 26, "Administration");

        // Displaying roles and details
        teacher.displayRole();
        System.out.println("Name: " + teacher.getName());
        System.out.println("Age: " + teacher.getAge() + "\n");

        student.displayRole();
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge() + "\n");

        staff.displayRole();
        System.out.println("Name: " + staff.getName());
        System.out.println("Age: " + staff.getAge() + "\n");
    }
}
