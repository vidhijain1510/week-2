/*Sample Program 6: Vehicle Registration System
Create a Vehicle class with the following features:
Static:
A static variable registrationFee common for all vehicles.
A static method updateRegistrationFee() to modify the fee.
This:
Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
Final:
Use a final variable registrationNumber to uniquely identify each vehicle.
Instanceof:
Check if an object belongs to the Vehicle class before displaying its registration details. */

class Vehicle {
    //static variable registrationFee common for all vehicles.
    static double registrationFee = 500.0;

    //Final variable registrationNumber to uniquely identify each vehicle.
    final String registrationNumber;

    String ownerName;
    String vehicleType;

    //Constructor to initialize ownerName, vehicleType, and registrationNumber using 'this'.
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    //A static method to update the registration fee.
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    //Method to display details.
    void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

    //Instanceof check to determine if an object is an instance of Vehicle.
    public boolean isInstanceOfVehicle(Object obj) {
        return obj instanceof Vehicle;
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        //Creating objects
        Vehicle vehicle1 = new Vehicle("Alice", "car", "C12");
        Vehicle vehicle2 = new Vehicle("Bob", "bike", "Z79");
        String notAVehicle = "This is not a vehicle";

        //Using instanceof to check and display details of vehicle1
        if (vehicle1.isInstanceOfVehicle(vehicle1)) {
            System.out.println("Vehicle 1 Details:");
            vehicle1.displayDetails();
        }

        //Using instanceof to check and display details of vehicle2
        if (vehicle2.isInstanceOfVehicle(vehicle2)) {
            System.out.println("\nVehicle 2 Details:");
            vehicle2.displayDetails();
        }

        //Checking a non-Vehicle object
        if (vehicle1.isInstanceOfVehicle(notAVehicle)) {
            System.out.println("\nThe object is a Vehicle.");
        } else {
            System.out.println("\nThe object is NOT a Vehicle.");
        }

        //Updating the registration fee
        Vehicle.updateRegistrationFee(800.0);

        //After updating the registration fee
        System.out.println("\nAfter updating the registration fee:");
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayDetails();
        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayDetails();
    }
}
