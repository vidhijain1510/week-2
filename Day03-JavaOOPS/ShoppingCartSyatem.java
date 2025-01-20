/*Sample Program 4: Shopping Cart System
Create a Product class to manage shopping cart items with the following features:
Static:
A static variable discount shared by all products.
A static method updateDiscount() to modify the discount percentage.
This:
Use this to initialize productName, price, and quantity in the constructor.
Final:
Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
Instanceof:
Validate whether an object is an instance of the Product class before processing its details.
 */

class Product{
    String productName;
    double price;
    int quantity;
    final String productID;

    //Static variable discount shared by all products.
    static double discount = 10;

    //Using this to initialize productName, price, and quantity in the constructor.
    Product(String productName, double price, int quantity, String productID){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    //A static method updateDiscount() to modify the discount percentage.
    public static void updateDiscount(double discountUpdate){
        discount = discountUpdate;
    }

    //Method to check if an object is an instance of Employee
    public static void checkingInstance(Object obj) {
        if (obj instanceof Product) {
            System.out.println("\nThe object is an instance of Employee.");
        } else {
            System.out.println("\nThe object is not an instance of Employee.");
        }
    }

    //Method to display product details
    void displayProductDetails(){
        System.out.println("\nProduct name: " + productName + "\nProduct price: " + price + "\nQuantity: " + quantity + "\nProduct ID:" + productID + "\nDiscount: " + discount);
    }
}

public class ShoppingCartSyatem{
    public static void main(String[] args) {
        Product product1 = new Product("Detergnet", 450, 3, "DT196");
        Product product2 = new Product("Shampoo", 300, 5, "SP002");

        //Displaying product details
        product1.displayProductDetails();
        product2.displayProductDetails();

        //Updating discount for all products
        Product.updateDiscount(15); //Setting discount to 15%

        //Displaying product details again after discount update
        System.out.println("\nAfter updating discount:");
        product1.displayProductDetails();
        product2.displayProductDetails();

        //If an object is an instance of Product
        Product.checkingInstance(product1); // Should print "The object is an instance of Product."
        Product.checkingInstance(product2); // Should print "The object is not an instance of Product."
    
    }
}