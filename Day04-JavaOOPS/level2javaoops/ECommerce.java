import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate the total price for this product (price * quantity)
    public double getTotalPrice() {
        return price * quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return name + " (Quantity: " + quantity + ", Price: $" + price + ")";
    }
}

class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<Product> products;

    // Constructor
    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to calculate the total cost of the order
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }

    // Getter for Order ID
    public String getOrderId() {
        return orderId;
    }

    // Getter for Customer
    public Customer getCustomer() {
        return customer;
    }

    // Method to display the order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + "\nCustomer: " + customer.getName());
        System.out.println("Products in this order:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Total Order Cost: INR" + calculateTotal());
    }
}

class Customer {
    private String name;
    private String email;
    private ArrayList<Order> orders;

    // Constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Method to display customer orders
    public void displayOrders() {
        System.out.println(name + " has placed the following orders:");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

public class Main1{
    public static void main(String[] args) {
        // Creating objects for Product
        Product product1 = new Product("Laptop", 1000.0, 1);
        Product product2 = new Product("Smartphone", 500.0, 2);
        Product product3 = new Product("Headphones", 150.0, 1);

        // Creating a Customer
        Customer customer = new Customer("John Doe", "john.doe@example.com");

        // Creating an order and add products
        Order order1 = new Order("ORD001", customer);
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Place the order
        customer.placeOrder(order1);

        // Creating another order and add products
        Order order2 = new Order("ORD002", customer);
        order2.addProduct(product3);

        // Place the second order
        customer.placeOrder(order2);

        // Displaying customer orders and order details
        customer.displayOrders();
    }
}
