/* Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, 
and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes. */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Base class Order with common attributes like orderId and orderDate
class Order {
    protected String orderId;
    protected LocalDate orderDate;

    //Constructor
    Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    //Method to get order status
    public String getOrderStatus() {
        return "Order placed. Waiting to be shipped.";
    }

    //Method to display order details
    public void displayOrderDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate.format(formatter));
    }
}

//Subclass ShippedOrder with additional attributes like trackingNumber
class ShippedOrder extends Order {
    protected String trackingNumber;

    //Constructor
    ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    //Method to display order details
    @Override
    public void displayOrderDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate.format(formatter));
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

//Another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute
class DeliveredOrder extends ShippedOrder {
    protected LocalDate deliveryDate;

    //Constructor
    DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    //Method to display order details
    @Override
    public void displayOrderDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate.format(formatter));
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Delivery Date: " + deliveryDate.format(formatter));
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order("OR1", LocalDate.of(2025, 1, 24));
        order.displayOrderDetails();
        System.out.println(order.getOrderStatus());

        ShippedOrder shippedOrder = new ShippedOrder("OR2", LocalDate.of(2025, 1, 25), "TR1");
        shippedOrder.displayOrderDetails();
        System.out.println(shippedOrder.getOrderStatus());

        DeliveredOrder deliveredOrder = new DeliveredOrder("OR3", LocalDate.of(2025, 1, 26), "TR2", LocalDate.of(2025, 1, 27));
        deliveredOrder.displayOrderDetails();
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
