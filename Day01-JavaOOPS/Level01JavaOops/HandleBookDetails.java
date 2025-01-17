/*Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes title, author, and price. 
Add a method to display the book details.
 */

import java.util.*;

class Book{
    //Attributes
    private String title;
    private String author;
    private double price;

    //Constructor
    public Book(String title, String author, double price){
        this.title  =title;
        this.author = author;
        this.price = price;
    }

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

    //Method to display details of book
    void display(){
        System.out.println("Title of the Book: " + title + "\nAuthor of the Book is: " + author + "\nPrice of the book: " + price);
    }
}

public class HandleBookDetails{
    public static void main(String[] args) {
        //Taking user input of title, author and price of book
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the title of book: ");//Title input
        String title = input.nextLine();
        System.out.println("Enter the name of author: ");//Author input
        String author = input.nextLine();
        System.out.println("Enter the price of book: ");//Price input
        double price = input.nextInt();

        //Creating object of class Book
        Book book = new Book(title, author, price);
        book.display();//Calling display method using object
    
        input.close();
    }
}