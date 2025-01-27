/*Library Management System
Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.*/

//Abstract class LibraryItem with fields like itemId, title, and author
abstract class LibraryItem{
    protected String itemId;
    protected String title;
    protected String author;

    //Constructor
    LibraryItem(String itemId, String title, String author){
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    //abstract method getLoanDuration() and a concrete method getItemDetails()
    abstract int getLoanDuration();

    void getItemDetails(){
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

//interface Reservable with methods reserveItem() and checkAvailability().
interface Reservable{
    void reserveItem(); //Method to reserve an item
    boolean checkAvailability(); //Method to check item availability
}

//subclass Book overriding getLoanDuration() with specific logic
class Book extends LibraryItem implements Reservable{
    //Constructor
    Book(String itemId, String title, String author){
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books can be borrowed for 14 days
    }

    @Override
    public void reserveItem() {
        System.out.println("Book \"" + title + "\" reserved.");
    }

    @Override
    public boolean checkAvailability() {
        // For simplicity, assume all books are available
        return false;
    }
}

class Magazine extends LibraryItem implements Reservable {

    //Constructor
    Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; //Magazines can be borrowed for 7 days
    }

    @Override
    public void reserveItem() {
        System.out.println("Magazine \"" + title + "\" reserved.");
    }

    @Override
    public boolean checkAvailability() {
        //Assuming all magazines are available
        return false;
    }
}

// Subclass DVD
class DVD extends LibraryItem implements Reservable {

    //Constructor
    DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; //DVDs can be borrowed for 3 days
    }

    @Override
    public void reserveItem() {
        System.out.println("DVD \"" + title + "\" reserved.");
    }

    @Override
    public boolean checkAvailability() {
        //Assuming all DVDs are available
        return false;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("B01", "Java Programming", "John Doe");
        LibraryItem magazine = new Magazine("M01", "Tech Trends", "Jane Smith");
        LibraryItem dvd = new DVD("D01", "Inception", "Christopher Nolan");

        LibraryItem[] items = {book, magazine, dvd};

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println();

            // Reserve and check availability for items that are reservable
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                reservableItem.reserveItem();
                System.out.println("Item available: " + reservableItem.checkAvailability());
            }
            System.out.println();
        }
    }
}