/*Problem 2: Online Course Management
Design a Course class with:
Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).
Methods:
An instance method displayCourseDetails() to display the course details.
A class method updateInstituteName() to modify the institute name for all courses. */

class OnlineCourse{
    //Instance Variables: courseName, duration, fee.
    private String courseName;
    private int duration; //duration in weeks
    private double fee;
    //Class Variable: instituteName (common for all courses).
    static String instituteName = "Technocrats Institute Of Technology";

    //Getter and Setter ffeeeName
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    //Getter and Setter for duration
    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }

    //Getter and Setter for fee
    public double getFee(){
        return fee;
    }
    public void setFee(int fee){
        this.fee = fee;
    }

    //Constructor
    OnlineCourse(String courseName, int duration, double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;

    }

    //An instance method displayCourseDetails() to display the course details.
    public void displayCourseDetails(){
        System.out.println("Course Name: " + courseName + "\nDuration: " + duration + "\nFee: " + fee + "\nInstitute Name: " + instituteName);
    }
    
    //A class method updateInstituteName() to modify the institute name for all courses.
    public static void updateInstituteName(){
        instituteName = "TIT";
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        //Creating object for class OnlineCourse
        OnlineCourse object1 = new OnlineCourse("Java", 6, 40000);
        object1.displayCourseDetails();//Calling Method before updating instituteName 
        System.out.println();//Creates extra blank line for output formating
        OnlineCourse.updateInstituteName();//Calling method to update instituteName
        object1.displayCourseDetails();//Calling Method after updating instituteName
    }
}
