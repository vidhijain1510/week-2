/*Program to Model a Movie Ticket Booking System
Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
Book a ticket (assign seat and update price).
Display ticket details.
Explanation: The MovieTicket class organizes ticket information with attributes. 
The methods handle booking logic and display ticket details.
 */
import java.util.*;
class MovieTicket{
    String movieName;
    String seatNumber;
    double price;

    //Constructor
    MovieTicket(String movieName){
        this.movieName = movieName;
        this.seatNumber = "Not alloted";
        this.price = 0.0;
    }

    //Method to book ticket
    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for movie: " + movieName);
    }

    //Method to display details like movie name, seat number and price.
    void display(){
        System.out.println("Movie Name: " + movieName + "\nSeat Number: " + seatNumber + "\nPrice: " + price);
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        //To take user input
        Scanner input = new Scanner(System.in);
        
        //Creating a MovieTicket object for a movie
        System.out.print("Enter movie name: ");
        String movieName = input.nextLine();
        MovieTicket ticket = new MovieTicket(movieName);
        
        //Booking a ticket
        System.out.println("Booking a ticket for: " + movieName);
        System.out.print("Enter seat number: ");
        String seatNumber = input.nextLine();
        System.out.print("Enter ticket price: ");
        double price = input.nextDouble();
        
        //Method call to book the ticket
        ticket.bookTicket(seatNumber, price);
        
        //Displaying the ticket details
        System.out.println("\nTicket Details:");
        ticket.display();

        input.close();
    }
}