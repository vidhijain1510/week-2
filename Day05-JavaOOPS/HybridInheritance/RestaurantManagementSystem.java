/*Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. 
Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique 
implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.
*/

//Superclass Person with common attributes for both Chef and Waiter
class Person {
    protected String name;
    protected String id;

    //Constructor
    Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    //Displaying basic details
    void displayDetails() {
        System.out.println("Name: " + name + " | ID: " + id);
    }
}

//Interface Worker with method performDuties()
interface Worker {
    void performDuties(); //Method to be implemented by all workers
}

//Chef class inherits from Person and implements Worker interface
class Chef extends Person implements Worker {
    //Constructor
    Chef(String name, String id) {
        super(name, id);
    }

    //Implementing the performDuties method from Worker interface
    @Override
    public void performDuties() {
        System.out.println(name + " is cooking meals.");
    }
}

//Waiter class inherits from Person and implements Worker interface
class Waiter extends Person implements Worker {
    //Constructor
    Waiter(String name, String id) {
        super(name, id);
    }

    //Implementing the performDuties method from Worker interface
    @Override
    public void performDuties() {
        System.out.println(name + " is serving food to customers.");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Kapil", "C1");
        Waiter waiter = new Waiter("Prankul", "W1");

        System.out.println("Chef Details:");
        chef.displayDetails();
        chef.performDuties();

        System.out.println("\nWaiter Details:");
        waiter.displayDetails();
        waiter.performDuties();
    }
}
