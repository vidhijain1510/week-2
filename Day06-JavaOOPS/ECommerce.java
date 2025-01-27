/* E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and
an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for
applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the
final price (price + tax - discount) for a list of Product.*/

//Abstract class Product with fields like productId, name, and price
abstract class Product{
    private String productId;
    private String name;
    private double price;

    //Constructor
    Product(String productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //Abstract method calculateDiscount()
    abstract double calculateDiscount();

    //Method to display details
    void displayDetails(){
        System.out.println("Product ID: " + productId + "\nName: " + name + "\nPrice: " + price);
    }
}

//Interface Taxable with methods calculateTax() and getTaxDetails()
interface Taxable{
    double calculateTax();
    //String getTaxDetails();
}

//concrete classes: Electronics, Clothing, and Groceries.
class Electronics extends Product implements Taxable{
    //Constructor
    Electronics(String productId, String name, double price){
        super(productId, name, price);
    }

    @Override
    public double calculateTax(){
        return getPrice() * 0.15; //15% tax
    }

    @Override
    public double calculateDiscount(){
        return getPrice() * 0.10; //10% discount
    }
}

// Clothing class (extends Product)
class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.1; // 10% tax
    }
}

// E-Commerce Platform class to calculate final price
public class ECommerce{

    //Method to calculate and display the final price (price + tax - discount)
    public static void calculateAndPrintFinalPrice(Product product) {
        product.displayDetails();

        //Calculate discount
        double discount = product.calculateDiscount();

        //Calculate tax if the product is taxable
        double tax = 0;
        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
        }

        //Final price = price + tax - discount
        double finalPrice = product.getPrice() + tax - discount;

        System.out.println("Final Price (Price + Tax - Discount): $" + finalPrice);
        System.out.println();
    }

    public static void main(String[] args) {
        Electronics laptop = new Electronics("1", "Laptop", 1000);
        Clothing tshirt = new Clothing("2", "T-Shirt", 50);

        calculateAndPrintFinalPrice(laptop);
        calculateAndPrintFinalPrice(tshirt);
    }
}


