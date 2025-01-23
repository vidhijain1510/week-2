import java.util.ArrayList;
class Doctor {
    private String name;
    private String specialization;

    //Constructor
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    //Method to consult with a patient
    public void consult(Patient patient) {
        System.out.println(name + " (Specialization: " + specialization + ") is consulting with " + patient.getName() + ".");
        patient.receiveConsultation(this);  // Communication: patient knows which doctor consulted
    }

    //Getter for name
    public String getName() {
        return name;
    }

    //Getter for specialization
    public String getSpecialization() {
        return specialization;
    }
}
class Patient {
    private String name;
    private String condition;

    //Constructor
    public Patient(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    //Method to receive consultation from a doctor
    public void receiveConsultation(Doctor doctor) {
        System.out.println(name + " is receiving consultation from Dr. " + doctor.getName() + " for " + condition + ".");
    }

    //Getter for name
    public String getName() {
        return name;
    }

    //Getter for condition
    public String getCondition() {
        return condition;
    }
}

class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    //Constructor
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    //Method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    //Method to add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    //Method to get a list of doctors
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    //Method to get a list of patients
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    //Method to simulate consultations
    public void simulateConsultations() {
        for (Doctor doctor : doctors) {
            for (Patient patient : patients) {
                doctor.consult(patient);  
            }
        }
    }

    public String getName() {
        return name;
    }
}
public class HospitalManagement{
    public static void main(String[] args) {
        //Creating object for Doctor
        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiologist");
        Doctor doctor2 = new Doctor("Dr. Johnson", "Dermatologist");

        //Creatinng objects for patients
        Patient patient1 = new Patient("Alice", "Heart disease");
        Patient patient2 = new Patient("Bob", "Skin rash");

        //Creating a hospital
        Hospital hospital = new Hospital("City Health Hospital");

        //Adding doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        //Calling method
        hospital.simulateConsultations();
    }
}
