/*Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes brand, model, and price. 
Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics. 
The method is used to retrieve and display this information for each object.
*/


import java.util.*;

class MobilePhone{
    String brand;
    String model;
    double price;

    //Constructor
    public MobilePhone(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;    
    }

    //Method to display brand, model and price
    void display(){
        System.out.println("The phone of " + brand + " of model " + model + " has price " + price);
    }

}

public class Mobile{
    public static void main(String[] args) {
        //To take user input
        Scanner input = new Scanner(System.in);

        //Taking input for brand, model and price of mobile1
        System.out.println("Enter the brand1 name: ");
        String brand1 = input.nextLine();
        System.out.println("Enter the model: ");
        String model1 = input.nextLine();
        System.out.println("Enter the price: ");
        double price1 = input.nextInt();
        input.nextLine();//Consumes the new line character

        //Taking input for brand, model and price of mobile2
        System.out.println("Enter the brand2 name: ");
        String brand2 = input.nextLine();
        System.out.println("Enter the model: ");
        String model2 = input.nextLine();
        System.out.println("Enter the price: ");
        double price2 = input.nextInt();

        input.nextLine();//Consumes the new line character
        //Taking input for brand, model and price of mobile3
        System.out.println("Enter the brand3 name: ");
        String brand3 = input.nextLine();
        System.out.println("Enter the model: ");
        String model3 = input.nextLine();
        System.out.println("Enter the price: ");
        double price3 = input.nextInt();

        System.out.println();
        System.out.println("Details of 3 mobiles: ");
        //Calling methods by creating object
        MobilePhone mobilePhone1 = new MobilePhone(brand1, model1, price1);//object 1
        mobilePhone1.display();
        MobilePhone mobilePhone2 = new MobilePhone(brand2, model2, price2);//object 2
        mobilePhone2.display();
        MobilePhone mobilePhone3 = new MobilePhone(brand3, model3, price3);//object 3
        mobilePhone3.display();

        input.close();
    }
}



