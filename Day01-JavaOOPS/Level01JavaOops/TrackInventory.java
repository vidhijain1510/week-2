/*Program to Track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode, itemName, and price. 
Add a method to display item details and calculate the total cost for a given quantity. */

import java.util.*;

class Inventory{
    String itemCode;
    String itemName;
    double price;

    //Constructor
    public Inventory(String itemCode, String itemName, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;    
    }

    //Method to calculate Totalcost
    public double calculateCost(int quantity){
        if(quantity < 0){
            throw new IllegalArgumentException("Quantity can not be 0"); //Throw exception if quantity is less than zero
        }else{
            return quantity*price;
        }
    }

    //Method to display itemCode, itemName, and price and totalprice
    void display(double totalCost){
        System.out.println("The Item code is: " + itemCode + "\nThe Item name is: " + itemName + "\nThe price of item is: " + price + "\nThe total cost will be: " + totalCost);
    }

}

public class TrackInventory{
    public static void main(String[] args) {
        //To take user input
        Scanner input = new Scanner(System.in);
        //Taking user input for itemCode, itemName, price, and quantity
        System.out.println("Enter the itemCode of item: ");
        String itemCode = input.nextLine();//itemCode input
        System.out.println("Enter the itemName of item: ");
        String itemName = input.nextLine();//itemName input
        System.out.println("Enter the price of item: ");
        double price = input.nextDouble();//price input
        System.out.println("Enter the Quantity of item: ");
        int quantity = input.nextInt();//Quantiyt input
        
        //Creating object for calling method
        Inventory inventory = new Inventory(itemCode, itemName, price);
        double totalCost = inventory.calculateCost(quantity);//Calling method 
        inventory.display(totalCost);//calling method
        
        input.close();
    }
}