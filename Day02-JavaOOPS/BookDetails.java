/*Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
 */

 import java.util.*;

 class Book{
     //Attributes
     private String title;
     private String author;
     private double price;
 
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
 
     //Default constructor
     Book(){
        this.title = "Book title";
        this.author = "The Author";
        this.price = 00.00;
     }

     //Parameterized constructor
     Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
     }

     //Method to display details of book
     void display(){
         System.out.println("Title of the Book: " + title + "\nAuthor of the Book is: " + author + "\nPrice of the book: " + price);
     }
 }
 
 public class BookDetails{
     public static void main(String[] args) {
         //Taking user input of title, author and price of book
         Scanner input = new Scanner(System.in);
 
         //Creating object for default constructor
         System.out.println("These are default details of book: ");
         Book object1 = new Book();
         object1.display();//Calling display method using object

         System.out.println();
         System.out.println("Now, You can give the details of book: ");

         System.out.println("Enter the title of book: ");//Title input
         String title = input.nextLine();
         System.out.println("Enter the name of author: ");//Author input
         String author = input.nextLine();
         System.out.println("Enter the price of book: ");//Price input
         double price = input.nextInt();

         System.out.println();
         //Creating object for parametrized constructor
         Book object2 = new Book(title, author, price);
         object2.display();//Calling display method using object
     
         input.close();
     }
 }