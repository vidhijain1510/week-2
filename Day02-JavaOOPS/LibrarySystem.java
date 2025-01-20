/* Book Library System
Design a Book class with:
ISBN (public).
title (protected).
author (private).
Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title and demonstrate access modifiers */

class BookStore {
    //Instance variables
    public String ISBN;      
    protected String title; 
    private String author;  

    //Constructor
    public BookStore(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    
    //Getter method for author
    public String getAuthor() {
        return author;
    }

    //Setter method for author
    public void setAuthor(String author) {
        this.author = author;
    }

    //Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN + "\nTitle: " + title + "\nAuthor: " + author);
    }
}

//subclass of Book
class EBook extends BookStore {

    //Constructor for EBook that calls the constructor of the Book class
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);  //Calling the parent class (Book) constructor
    }

    //Method to display details of the EBook
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);    // Accessing public ISBN
        System.out.println("Title: " + title);  // Accessing protected title
        // Accessing author via the parent class' getter method
        System.out.println("Author: " + getAuthor());  
    }
 }

public class LibrarySystem {
    public static void main(String[] args) {
        //Creating a Book object
    	BookStore book1 = new BookStore("978-3-16-148410-0", "The Great Adventure", "Johns");
        book1.displayBookDetails();

        //Creating an EBook object
        EBook ebook1 = new EBook("978-1-7", "Digital World", "Smith");
        ebook1.displayEBookDetails();

        //Modify the author name using setter method
        book1.setAuthor("Alice");
        System.out.println("Updated Book 1 Author: " + book1.getAuthor());
    }
}

