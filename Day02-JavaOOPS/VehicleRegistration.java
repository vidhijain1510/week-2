/*Problem 3: Vehicle Registration
Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details.
A class method updateRegistrationFee() to change the registration fee. */
class Vehicle{
    //Instance Variables: ownerName, vehicleType.
    private String ownerName;
    private String vehicleType;
    //Class Variable: registrationFee (fixed for all vehicles).
    static double registrationFee = 5000;

    //Getter and Setter for ownerName
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    //Getter and Setter
    public String getVehicleType(){
        return vehicleType;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }

    //Constructor
    Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    //An instance method displayVehicleDetails() to display owner and vehicle details.
    public void displayVehicleDetails(){
        System.out.println("Owner Name: " + ownerName + "\nVehicle type: " + vehicleType + "\nRegistration Fee: " + registrationFee);
    }

    //A class method updateRegistrationFee() to change the registration fee.
    public static void updateRegistrationFee(){
        registrationFee = 5500;
    }
}

public class VehicleRegistration{
    public static void main(String[] args) {
        //Creating object for class
        Vehicle object1 = new Vehicle("Bob", "Petrol Engine");
        object1.displayVehicleDetails();//Calling Method before updating 
        System.out.println();//Creates extra blank line for output formating
        Vehicle.updateRegistrationFee();//Calling method to update
        object1.displayVehicleDetails();//Calling Method after updating
    }
}