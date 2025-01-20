/*Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. 
Add constructors to initialize the rental details and calculate total cost. */

class CarRental{
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRentalPrice = 50; // Assuming a fixed rental rate per day (INR50)

    //Getter
    public String getCustomerName(){
        return customerName;
    }
    //Setter
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    //Getter
    public String getCarModel(){
        return carModel;
    }
    //Setter
    public void setCarModel(String carModel){
        this.carModel = carModel;
    }
    //Getter
    public int getRentalDays(){
        return rentalDays;
    }
    //Setter
    public void setRentalDays(int rentalDays){
        this.rentalDays = rentalDays;
    }

    //Constructor
    CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    //Method to calculate total rental cost
    public double totalRentalCost(){
        return rentalDays * dailyRentalPrice;
    }

    //Method to display details
    void displayDetails(){
        System.out.println("Customer name: " + customerName + "\nCar model: " + carModel + "\nRental days: " + rentalDays + "\nTotal rental price: " + totalRentalCost() + "INR");
    }
}

public class CarRentalSystem{
    public static void main(String[] args) {
        //Creating object of class 
        CarRental object1 = new CarRental("Alice", "BMW", 2);
        object1.displayDetails();//Calling Method to display rental information
    }
}
