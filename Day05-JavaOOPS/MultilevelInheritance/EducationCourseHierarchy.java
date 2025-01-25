/*Sample Problem 2: Educational Course Hierarchy
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and 
PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
 */

//Superclass Course with attributes like courseName and duration.
class Course{
    protected String courseName;
    protected float duration;

    //Constructor
    Course(String courseName, float duration){
        this.courseName = courseName;
        this.duration = duration;
    }  

    //Displaying details
    void displayInfo(){
        System.out.println("Course Name: " + courseName + " | Duration: " + duration);
    }
}
//OnlineCourse to add attributes such as platform and isRecorded.
class OnlineCourse extends Course{
    protected String platform;
    String isRecorded;

    //Constructor
    OnlineCourse(String courseName, float duration, String platform, String isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayInfo(){
        System.out.println("Course Name: " + courseName + " | Duration: " + duration + " | Platform: " + platform + " | Is Recorded or not: " + isRecorded);
    }
}
//PaidOnlineCourse to add fee and discount.
class PaidOnlineCourse extends OnlineCourse{
    protected float fee;
    protected float discount;

    //Constructor
    PaidOnlineCourse(String courseName, float duration, String platform, String isRecorded, float fee, float discount){
        super(courseName, duration,platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayInfo(){
        System.out.println("Course Name: " + courseName + " | Duration: " + duration + " | Platform: " + platform + " | Is Recorded or not: " + isRecorded + " | Fee: " + fee + " | Discount: (in %)" + discount);
    }
}

public class EducationCourseHierarchy{
    public static void main(String[] args) {
        Course course = new Course(null, 0);
        course.displayInfo();
        OnlineCourse onlineCourse = new OnlineCourse("java", 2, "online", "yes");
        onlineCourse.displayInfo();
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Java", 2, "Online", "NO", 5000, 10);
        paidOnlineCourse.displayInfo();
    }  
}
