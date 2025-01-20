/*Problem 1: Product Inventory
Create a Product class with:
Instance Variables: productName, price.
Class Variable: totalProducts (shared among all products).
Methods:
An instance method displayProductDetails() to display the details of a product.
A class method displayTotalProducts() to show the total number of products created.
 */

class Product{
    //Instance Variables
    private String productName;
    private double price;
    //Class Variable
    static int totalProducts = 0;;

    //Getter for productName
    public String getProductName(){
        return productName;
    }
    //Setter for productName
    public void setProductName(String productName){
        this.productName = productName;
    }

    //Getter for price
    public double getPrice(){
        return price;
    }
    //Setter for price
    public void setPrice(double price){
        this.price = price;
    }

    //Constructor
    Product(String productName, double price){
        this.productName = productName;
        this.price = price;
        totalProducts+=1;
    }

    //Instance method displayProductDetails() to display the details of a product.
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName + "\nPrice: INR" + price);
    }

    //Class method displayTotalProducts() to show the total number of products created.
    public static void displayTotalProducts(){
        System.out.println("Total Products: " + totalProducts);
    }
}
public class ProductInventory{
    public static void main(String[] args) {
        //Creating Product objects
        Product product1 = new Product("Laptop", 1000.00);
        Product product2 = new Product("Smartphone", 600.00);
        Product product3 = new Product("Headphones", 150.00);

        //Displaying product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        //Displaying total number of products created
        Product.displayTotalProducts();
    }
}

