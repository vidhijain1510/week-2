/* Vehicle Rental System
Description: Design a system to manage vehicle rentals:
Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
Add an abstract method calculateRentalCost(int days).
Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
Demonstrate polymorphism by iterating over a list of vehicles and calculating
rental and insurance costs for each.*/

//Abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
abstract class Vehicle1{
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    //Constructor
    Vehicle1(String vehicleNumber, String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    //Getters and Setter
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public String getType() {
        return type;
    }
    public double getRentalRate() {
        return rentalRate;
    }

    //Abstract method calculateRentalCost(int days)
    public abstract double calculateRentalCost(int days);

    //Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber + "\nVehicle Type: " + type + "\nRental Rate: INR" + rentalRate + " per day");
    }
}

//subclasses Car with specific implementations of calculateRentalCost().
class Car1 extends Vehicle1 implements  Insurable{
    //Constructor
    Car1(String vehicleNumber, double rentalRate){
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days){
        return getRentalRate() * days; //Rent per day
    }

    @Override
    public double calculateInsurance(){
        return getRentalRate() * 0.25; //Insurance 25% on rates
    }

    @Override
    public String getInsuranceDetails(){
        return "The Policy number is CAR101";
    }

}
//subclasses Bike with specific implementations of calculateRentalCost().
class Bike1 extends Vehicle1 implements Insurable{
    //Constructor
    Bike1(String vehicleNumber, double rentalRate){
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days){
        return getRentalRate() * days; //Rent per day
    }

    @Override
    public double calculateInsurance(){
        return getRentalRate() * 0.25; //Insurance 25% on rates
    }

    @Override
    public String getInsuranceDetails(){
        return "The Policy number is BIKE102";
    }
}
//subclasses Truck with specific implementations of calculateRentalCost().
class Truck extends Vehicle1 implements Insurable{
    //Constructor
    Truck(String vehicleNumber, double rentalRate){
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days){
        return getRentalRate() * days; //Rent per day
    }

    @Override
    public double calculateInsurance(){
        return getRentalRate() * 0.25; //Insurance 25% on rates
    }

    @Override
    public String getInsuranceDetails(){
        return "The Policy number is TRUCK103";
    }
}

//interface Insurable with methods calculateInsurance() and getInsuranceDetails().
interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car1 car = new Car1("CAR04AL1790", 500);
        Vehicle1 bike = new Bike1("BIKE1234", 200);
        Vehicle1 truck = new Truck("TRUCK5678", 1000);

        //Vehicles into an array
        Vehicle1[] vehicles = {car, bike, truck};

        //Iterate over vehicles, display details, and calculate rental + insurance costs
        for (Vehicle1 vehicle : vehicles) {
            vehicle.displayDetails();
            int rentalDays = 5; // Example: Rent for 5 days
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = 0;  // Make sure this is declared before using it

            // Calculate insurance if the vehicle is insurable
            if (vehicle instanceof Insurable) {
                // Safe cast to Insurable
                Insurable insurableVehicle = (Insurable) vehicle;
                insuranceCost = insurableVehicle.calculateInsurance();
                System.out.println(insurableVehicle.getInsuranceDetails());
            }

            // Display total cost (rental + insurance)
            double totalCost = rentalCost + insuranceCost;
            System.out.println("Rental cost for " + rentalDays + " days: INR " + rentalCost);
            System.out.println("Insurance cost: INR " + insuranceCost);
            System.out.println("Total cost (rental + insurance): INR " + totalCost);
            System.out.println();
        }
    }
}