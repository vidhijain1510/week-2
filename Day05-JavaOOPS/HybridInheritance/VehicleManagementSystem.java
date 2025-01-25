/*Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are 
subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, 
while ElectricVehicle include a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, 
demonstrating how Java interfaces allow adding multiple behaviors.
 */

//Superclass Vehicle with attributes like maxSpeed and model.
class Vehicle {
    protected float maxSpeed;
    protected String model;

    //Constructor
    Vehicle(float maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    //Displaying basic details
    void displayDetails() {
        System.out.println("Max Speed: " + maxSpeed + "Km | Model: " + model);
    }
}

//Interface Refuelable with a method refuel().
interface Refuelable {
    void refuel();
}

//Subclass ElectricVehicle includes a charge() method.
class ElectricVehicle extends Vehicle {
    ElectricVehicle(float maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Vehicle is charging and has Max Speed " + maxSpeed + "Km and model " + model);
    }
}

//Subclass PetrolVehicle that implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(float maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Vehicle is Refuelable and has Max Speed " + maxSpeed + "Km and model " + model);
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        //Creating instances of PetrolVehicle and ElectricVehicle
        PetrolVehicle petrolVehicle = new PetrolVehicle(150, "Aura");
        ElectricVehicle electricVehicle = new ElectricVehicle(120, "Ola");

        //Displaying details for each vehicle
        System.out.println("Petrol Vehicle:");
        petrolVehicle.displayDetails();
        petrolVehicle.refuel(); //Calling refuel method for PetrolVehicle

        System.out.println("\nElectric Vehicle:");
        electricVehicle.displayDetails();
        electricVehicle.charge(); //Calling charge method for ElectricVehicle
    }
}
