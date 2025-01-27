/*Ride-Hailing Application
Description: Develop a ride-hailing application:
Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
Use an interface GPS with methods getCurrentLocation() and updateLocation().
Secure driver and vehicle details using encapsulation.
Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.
*/
//Abstract class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    //Constructor
    Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    //Getter
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    //Concrete method to display vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    //Abstract method to calculate fare based on distance
    public abstract double calculateFare(double distance);
}

//Interface GPS with methods for location tracking
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

//Subclass Car
class Car extends Vehicle implements GPS {
    private String currentLocation;

    //Constructor
    Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";  //Default location
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;  //Fare = rate per km * distance
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

//Subclass Bike
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    //Constructor
    Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";  //Default location
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;  //Fare = rate per km * distance
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

//Subclass Auto
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    //Constructor
    Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";  //Default location
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;  //Fare = rate per km * distance
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

public class RideHailingApp {
    //Method to process vehicle fare
    public static void calculateFareForRide(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        double fare = vehicle.calculateFare(distance);
        System.out.println("Total Fare for " + distance + " Km: " + fare);
        if (vehicle instanceof GPS) {
            GPS gpsVehicle = (GPS) vehicle;
            System.out.println("Current Location: " + gpsVehicle.getCurrentLocation());
        }
        System.out.println("----- End of Ride -----\n");
    }

    public static void main(String[] args) {

        Car car = new Car("CAR123", "John Doe", 15);
        Bike bike = new Bike("BIKE456", "Alice Smith", 10);
        Auto auto = new Auto("AUTO789", "Bob Johnson", 12);

        car.updateLocation("Downtown");
        bike.updateLocation("Uptown");
        auto.updateLocation("Airport");

        System.out.println("Processing Ride for Car:");
        calculateFareForRide(car, 10);

        System.out.println("Processing Ride for Bike:");
        calculateFareForRide(bike, 10);

        System.out.println("Processing Ride for Auto:");
        calculateFareForRide(auto, 10);
    }
}

