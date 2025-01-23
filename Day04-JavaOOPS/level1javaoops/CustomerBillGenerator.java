/*The class diagram models the system where a customer buys products, and the bill is generated.
Diagram Description:
Classes: Customer, Product, BillGenerator
Relationships:
A Customer can purchase multiple Product items (Composition).
BillGenerator computes the total for the Customer 
Object Diagram
An object diagram shows the details of a Customer and the Product objects they have purchased.
Example:
Customer: Alice
Products:
Apples (2 kg at $3 per kg)
Milk (1 liter at $2 per liter)
Sequence Diagram
The sequence diagram shows the process of bill generation for a customer.
Scenario: A customer checks out at the grocery store, and the total bill is generated.
Actors:
Customer
BillGenerator
*/
import java.util.*;
class Customer{
    private String name;
    private String mobileNumber;
    private ArrayList<Product> products; // A customer can have multiple products

    //constructor
     public Customer(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.products = new ArrayList<>();
    }

    //getter
    public String getName(){
        return name;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }

    //Method to add a product to the customer
    public void addProduct(Product product) {
        products.add(product);
    }

    //Get total amount for the customer
    public float getTotalAmount() {
        float total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }

    //Display the products purchased by the customer
    public void displayProducts() {
        System.out.println(name +"\nM.no. - " + mobileNumber + " \npurchased the following products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
class Product{

    private String name;
    private float pricePerUnit;
    private float quantity; 

    //Constructor
    public Product(String name, float pricePerUnit, float quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    //Method to calculate total price for this product
    public float getTotalPrice() {
        return pricePerUnit * quantity;
    }

    //Getters
    public String getName() {
        return name;
    }

    public float getPricePerUnit() {
        return pricePerUnit;
    }

    public float getQuantity() {
        return quantity;
    }
    public String toString() {
        return name + " (" + quantity + " at $" + pricePerUnit + " per unit)";
    }
}

class BillGenerator{

    //Method to generate the total bill for the customer
    public float generateBill(Customer customer) {
        float totalBill = customer.getTotalAmount();
        return totalBill;
    }
}

public class Main{
    public static void main(String[] args) {
        //Creating object for Products
        Product apples = new Product("Apples", 3, 2); //2 kg at $3 per kg
        Product milk = new Product("Milk", 2, 1);   //1 liter at $2 per liter

        //Creating object for Customer
        Customer customer = new Customer("Alice", "955685");

        //Adding products to customer's purchase
        customer.addProduct(apples);
        customer.addProduct(milk);

        //Displaying customer purchased products
        customer.displayProducts();

        //Generates Bill
        BillGenerator billGenerator = new BillGenerator();
        float totalBill = billGenerator.generateBill(customer);

        //Displaing total bill
        System.out.println("\nTotal Bill for " + customer.getName() + ": $" + totalBill);
    }
}
