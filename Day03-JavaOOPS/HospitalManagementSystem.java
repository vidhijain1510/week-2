/*
*Hospital Management System
Create a Patient class with the following features:
Static:
A static variable hospitalName shared among all patients.
A static method getTotalPatients() to count the total patients admitted.
This:
Use this to initialize name, age, and ailment in the constructor.
Final:
Use a final variable patientID to uniquely identify each patient.
Instanceof:
Check if an object is an instance of the Patient class before displaying its details.
*/

class Patient {
    // Static variable shared among all patients
    static String hospitalName = "Chirayu Hospital";
    static int totalPatients = 0; //Counter for total patients admitted

    // Final variable to ensure unique patient ID
    final int patientID;

    String name;
    int age;
    String ailment;

    //Constructor
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;         
        this.age = age;           
        this.ailment = ailment;   
        this.patientID = patientID;
        totalPatients++;  
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) { // Check if the object is an instance of Patient
            System.out.println("Hospital Name: " + hospitalName + "\nPatient ID: " + patientID + "\nName: " + name + "\nAge: " + age + "\nAilment: " + ailment);
        } else {
            System.out.println("Invalid patient object!");
        }
    }
}

public class HospitalManagementSystem{
    public static void main(String[] args) {
        // Display hospital name (static method)
        System.out.println("Welcome to " + Patient.hospitalName);

        Patient patient1 = new Patient("Alice", 30, "Fever", 1);
        Patient patient2 = new Patient("Bob", 45, "Diabetes", 2);

        // Display patient details
        System.out.println("\nPatient 1:");
        patient1.displayPatientDetails();

        System.out.println("\nPatient 2:");
        patient2.displayPatientDetails();

        // Display total patients admitted
        System.out.println("\nTotal Patients Admitted: " + Patient.totalPatients);
    }
}

