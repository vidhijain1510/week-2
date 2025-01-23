import java.util.ArrayList;
class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    //Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    //Getting course name
    public String getCourseName() {
        return courseName;
    }

    //Enrolling a student
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    //Displaying enrolled students
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    //Constructor
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    //Getting student name
    public String getName() {
        return name;
    }

    //Enrolling in a course
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // Maintain consistency
        }
    }

    //Displaying enrolled courses
    public void displayCourses() {
        System.out.println("Student: " + name);
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

class School {
    private String name;
    private ArrayList<Student> students;

    //Constructor
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    //Adding a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    //Displaying all students in the school
    public void displayStudents() {
        System.out.println("School: " + name);
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

public class SchoolAndStudents {
    public static void main(String[] args) {
        //Creating object for School
        School school = new School("Greenfield Academy");

        //Creating object for Student
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        //Creating object for Course
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        //Adding students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        //Enrolling students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course2);

        //Displaying students and their courses
        school.displayStudents();
        student1.displayCourses();
        student2.displayCourses();

        //Displaying courses and their enrolled students
        course1.displayEnrolledStudents();
        course2.displayEnrolledStudents();
    }
}