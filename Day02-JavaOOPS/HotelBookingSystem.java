/*Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights.
 Use default, parameterized, and copy constructors to initialize bookings. */

import java.util.Scanner;

class HotelBooking{
    //Attributes
    private String guestName;
    private String roomType;
    private int nights;
    
    //Getter
    public String getGuestName() {
        return guestName;
    }
    //Setter
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    //Getter
    public String getRoomType() {
        return roomType;
    }
    //Setter
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    //Getter
    public int getNights() {
        return nights;
    }
    //Setter
    public void setNights(int nights) {
        this.nights = nights;
    }

    //Default Constructor
    HotelBooking(){
        this.guestName = "GuestName";
        this.roomType = "Standard";
        this.nights = 1;
    }

    //Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //Copy constructor
    HotelBooking(HotelBooking previousBooking){
        this.guestName = previousBooking.guestName;
        this.roomType = previousBooking.roomType;
        this.nights = previousBooking.nights;
    } 

    //Method to display details
    void displayDetails(){
        System.out.println("Guest name: " + guestName + "\nRoom type: " + roomType + "\nNights: " + nights);
    } 
}

public class HotelBookingSystem{
    public static void main(String[] args) {
        //To take user input
        Scanner input = new Scanner(System.in);

        //Creating object for default constructor
        HotelBooking object1 = new HotelBooking();
        System.out.println("The default details are: ");
        object1.displayDetails();//Calling method to display details
        System.out.println();//Creates space for better presentation

        //Taking user input for guest name,  room type and nights
        System.out.println("Enter the guest name: ");
        String guestName = input.nextLine();//Guest name input
        System.out.println("Select room type: \n1.Standard \n2.Deluxe \n3.Suite");
        String roomType = input.nextLine();//Room type input
        System.out.println("Enter the no. of nights: ");
        int nights = input.nextInt();

        System.out.println();//Creates space for better presentation
        //Creating object for Parameterized constructor
        HotelBooking object2 = new HotelBooking(guestName, roomType, nights);
        System.out.println("The details are: ");
        object2.displayDetails();//Calling method to display details

        System.out.println();//Creates space for better presentation
        //Creating object for copy constructor
        HotelBooking object3 = new HotelBooking(object2);
        System.out.println("The details are: ");
        object3.displayDetails();//Calling method to display details

        input.close();
    }
}

    
