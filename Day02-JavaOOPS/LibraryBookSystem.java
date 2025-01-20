/*Library Book System: Create a Book class with attributes title, author, price, and availability. 
Implement a method to borrow a book. */

class Library{
    //Attributes
    private String title;
    private String author;
    private double price;
    private boolean availability;

    //Getter
    public String getTitle() {
        return title;
    }
    //Setter
    public void setTitle(String title) {
        this.title = title;
    }

    //Getter
    public String getAuthor() {
        return author;
    }
    //Setter
    public void setCircleRadius(String author) {
        this.author = author;
    }

    //Getter
    public double getPrice() {
        return price;
    }
    //Setter
    public void setPrice(double price) {
        this.price = price;
    }

    //Getter
    public boolean getAvailability(){
        return availability;
    }
    //Setter
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    //Constructor
    Library(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; //By default the book is available
    }
    // Method to borrow the book
    public void borrow(){
        if (availability) {
            availability = false;  //Set availability to false when borrowed
            System.out.println("You have successfully borrowed '" + title + "' by " + author + ".");
        } else {
            System.out.println("Sorry, '" + title + "' is currently not available.");
        }
    }

    // Method to display book information
    public void bookInfo() {
        String availabilityStatus = availability ? "Available" : "Not Available";
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price + "\nStatus: " + availabilityStatus);
    }
}
public class LibraryBookSystem{
    public static void main(String[] args) {
        //Creating an object
        Library object1 = new Library("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        //Display book information
        object1.bookInfo();
        //borrowing the book
        object1.borrow();
        //borrowing the book again to check availability status
        object1.borrow();
    }
}