import java.util.ArrayList;

class Student {
    private String name;
    private String rollNumber;
    private ArrayList<Subject> subjects;

    //Constructor
    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = new ArrayList<>();
    }

    //Method to add a subject to the student's list
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    //Method to calculate the total marks (sum of marks in all subjects)
    public double getTotalMarks() {
        double totalMarks = 0;
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }
        return totalMarks;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
}

class Subject {
    private String subjectName;
    private float marks;

    //Constructor
    public Subject(String subjectName, float marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    //Getters
    public float getMarks() {
        return marks;
    }

    public String getSubjectName() {
        return subjectName;
    }
}

class GradeCalculator {

    //Method to calculate the grade for a student
    public String calculateGrade(Student student) {
        double totalMarks = student.getTotalMarks();
        double averageMarks = totalMarks / student.getSubjects().size();

        //Returns grade based on average marks
        if (averageMarks >= 90) {
            return "A";
        } else if (averageMarks >= 75) {
            return "B";
        } else if (averageMarks >= 60) {
            return "C";
        } else if (averageMarks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}

public class StudentResults {
    public static void main(String[] args) {
        //Creating Subjects with marks
        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        //Creating a Student and add subjects
        Student student = new Student("John", "01");
        student.addSubject(maths);
        student.addSubject(science);

        //Creating a GradeCalculator
        GradeCalculator gradeCalculator = new GradeCalculator();

        //Calculating and displaying the grade
        String grade = gradeCalculator.calculateGrade(student);

        System.out.println("Student: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Subjects and Marks:");
        for (Subject subject : student.getSubjects()) {
            System.out.println(subject.getSubjectName() + ": " + subject.getMarks());
        }
        System.out.println("Total Marks: " + student.getTotalMarks());
        System.out.println("Grade: " + grade);
    }
}
