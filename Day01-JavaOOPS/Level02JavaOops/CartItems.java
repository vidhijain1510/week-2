/*Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and 
calculating the total cost. */

import java.util.*;
class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    // Getter method
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate the total cost of the item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity + ", Total: $" + getTotalCost());
    }
}
// ShoppingCart class to manage cart operations
class ShoppingCart {
    private List<CartItem> items;
    // Constructor to initialize the ShoppingCart
    public ShoppingCart() {
        items = new ArrayList<>();
    }
    // Method to add an item to the cart
    public void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.getItemName() + " added to the cart.");
    }
    // Method to remove an item from the cart by item name
    public void removeItem(String itemName) {
        boolean removed = items.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
        if (removed) {
            System.out.println(itemName + " removed from the cart.");
        } else {
            System.out.println(itemName + " not found in the cart.");
        }
    }
    // Method to calculate and display the total cost of items in the cart
    public void displayTotalCost() {
        double totalCost = items.stream().mapToDouble(CartItem::getTotalCost).sum();
        System.out.println("Total cost: $" + totalCost);
    }
    // Method to display all items in the cart
    public void displayCartItems() {
        if (items.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (CartItem item : items) {
                item.displayItemDetails();
            }
        }
    }
}
// Main class to test the shopping cart functionality
public class CartItems{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        // Add items to the cart
        cart.addItem(new CartItem("Laptop", 999.99, 1));
        cart.addItem(new CartItem("Smartphone", 499.99, 2));
        cart.addItem(new CartItem("Headphones", 99.99, 3));

        // print items in the cart
        cart.displayCartItems();
        // print the total cost
        cart.displayTotalCost();
        // Remove an item from the cart
        cart.removeItem("Smartphone");
        // print the updated cart items and total cost
        cart.displayCartItems();
        cart.displayTotalCost();
    }
}
