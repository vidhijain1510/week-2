/*Hospital Patient Management
Description: Design a system to manage patients in a hospital:
Create an abstract class Patient with fields like patientId, name, and age.
Add an abstract method calculateBill() and a concrete method getPatientDetails().
Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
Implement an interface MedicalRecord with methods addRecord() and viewRecords().
Use encapsulation to protect sensitive patient data like diagnosis and medical history.
Use polymorphism to handle different patient types and display their billing details dynamically.
*/

//Abstract class Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    //Constructor
    Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    //Getter methods for encapsulated fields
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Concrete method to display patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    //Abstract method to calculate the bill
    public abstract double calculateBill();
}

//Interface MedicalRecord
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

//Subclass InPatient (for patients admitted to the hospital)
class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private String medicalRecord; //Single string to store the record

    // Constructor
    InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.medicalRecord = ""; //Initially no records
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;  //Hospital stay cost
    }

    //Implementing MedicalRecord interface
    @Override
    public void addRecord(String record) {
        medicalRecord = record;  //Directly assigning a single record
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Record for " + getName() + ":");
        System.out.println(medicalRecord);
    }
}

//Subclass OutPatient (for patients visiting for consultations)
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalRecord; // Single string to store the record

    //Constructor
    OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecord = ""; //Initially no records
    }

    @Override
    public double calculateBill() {
        return consultationFee;  //Only consultation fee for OutPatient
    }

    //Implementing MedicalRecord interface
    @Override
    public void addRecord(String record) {
        medicalRecord = record;  //Directly assigning a single record
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Record for " + getName() + ":");
        System.out.println(medicalRecord);
    }
}

public class HospitalPatientManagementSystem {

    //Method to process a patient and calculate the bill
    public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        double bill = patient.calculateBill();
        System.out.println("Total Bill: " + bill);

        //If the patient has medical records
        if (patient instanceof MedicalRecord) {
            MedicalRecord medicalRecordPatient = (MedicalRecord) patient;
            medicalRecordPatient.viewRecords();
        }
        System.out.println("----- End of Patient Details -----\n");
    }

    public static void main(String[] args) {
        InPatient inPatient = new InPatient("IP001", "John Doe", 40, 1500, 5);
        OutPatient outPatient = new OutPatient("OP001", "Jane Smith", 30, 500);

        inPatient.addRecord("Diagnosis: Flu. Treatment: Rest and Fluids.");
        outPatient.addRecord("Diagnosis: Minor Cold. Treatment: Prescribed Medicine.");

        //Process both patients
        System.out.println("Processing InPatient:");
        processPatient(inPatient);

        System.out.println("Processing OutPatient:");
        processPatient(outPatient);
    }
}

