/*Online Food Delivery System
Description: Create an online food delivery system:
Define an abstract class FoodItem with fields like itemName, price, and quantity.
Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to
include additional charges (e.g., for non-veg items).
Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
Demonstrate encapsulation to restrict modifications to order details and use polymorphism to
handle different types of food items in a single order-processing method.
*/
//Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    //Constructor
    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    //Getter
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    //Concrete method to display food item details
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
    }

    //Abstract method to calculate total price
    public abstract double calculateTotalPrice();
}

//Interface Discountable
interface Discountable {
    double applyDiscount();  //Method to apply discount
    String getDiscountDetails();  //Method to get discount details
}

//Subclass VegItem
class VegItem extends FoodItem {

    //Constructor
    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();  //Veg items don't have additional charges
    }
}

//Subclass NonVegItem
class NonVegItem extends FoodItem implements Discountable {

    //Constructor
    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        //Non-Veg items have an additional charge of 10% for the item
        return getPrice() * getQuantity() * 1.10;
    }

    @Override
    public double applyDiscount() {
        //Apply 5% discount on Non-Veg items
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount applied on Non-Veg item.";
    }
}

public class OnlineFoodDeliverySystem {
    //Method to process an order, accepts any FoodItem (Polymorphism)
    public static void processOrder(FoodItem foodItem) {
        foodItem.getItemDetails();
        double totalPrice = foodItem.calculateTotalPrice();
        System.out.println("Total Price: " + totalPrice);

        //If the item is Discountable, apply discount
        if (foodItem instanceof Discountable) {
            Discountable discountableItem = (Discountable) foodItem;
            double discount = discountableItem.applyDiscount();
            System.out.println(discountableItem.getDiscountDetails());
            totalPrice -= discount;  //Deducting discount from total price
            System.out.println("Total after discount: " + totalPrice);
        }
        System.out.println("-- Order Placed --");
    }

    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Veg Burger", 100, 2);
        FoodItem nonVegItem = new NonVegItem("Burger", 150, 1);

        System.out.println("Processing Veg Item Order:");
        processOrder(vegItem);

        System.out.println("Processing Non-Veg Item Order:");
        processOrder(nonVegItem);
    }
}
