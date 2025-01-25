/*Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are 
subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism 
for dynamic method calls. */

//Super class
abstract class Vehicle{
    protected float maxSpeed;
    protected String fuelType;

    //Constructor
    Vehicle(float maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //Method displayInfo().
    void displayInfo(){
        System.out.println("Max Speed: " + maxSpeed + "km | Fuel Type: " + fuelType);
    }
}
//Subclass Car with additional attributes seatCapacity
class Car extends Vehicle{
    protected int seatCapacity;

    //Constructor
    Car(float maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    //Overriding method displayInfo().
    void displayInfo(){
        System.out.println("Max Speed: " + maxSpeed + "km | Fuel Type: " + fuelType + " | Seat Capacity: " + seatCapacity);
    }
}

//Subclass Truck with additional attributes loadCapacity
class Truck extends Vehicle{
    protected int loadCapacity;

    //Constructor
    Truck(float maxSpeed, String fuelType, int loadCapacity){
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    //Overriding method displayInfo().
    void displayInfo(){
        System.out.println("Max Speed: " + maxSpeed + "km | Fuel Type: " + fuelType + " | Load Capacity (in tons): " + loadCapacity);
    }
}

//Subclass Motorcycle with additional attributes brand
class Motorcycle extends Vehicle{
    protected String brand;

    //Constructor
    Motorcycle(float maxSpeed, String fuelType, String brand){
        super(maxSpeed, fuelType);
        this.brand = brand;
    }

    //Overriding method displayInfo().
    void displayInfo(){
        System.out.println("Max Speed: " + maxSpeed + "km | Fuel Type: " + fuelType + " | Brand: " + brand);
    }
}

public class TransportSystem{
    public static void main(String[] args) {
        Vehicle car = new Car(250, "Petrol", 2);
        Vehicle truck = new Truck(150, "Diesel", 20);
        Vehicle motorcycle = new Motorcycle(180, "Petrol", "Splendor");

        // Storing objects of different subclasses in a Vehicle array
        Vehicle[] vehicles = {car, truck, motorcycle};

        // Loop through the array and call displayInfo() on each
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}

