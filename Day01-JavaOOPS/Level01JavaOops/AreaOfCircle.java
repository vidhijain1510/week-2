/*Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute radius. 
Add methods to calculate and display the area and circumference of the circle.
 */

 import java.util.*;

 class Circle {
     private double radius;
 
     // Constructor to initialize the radius
     public Circle(double radius) {
         this.radius = radius;
     }
 
     // Getter for radius
     public double getCircleRadius() {
         return radius;
     }
 
     // Setter for radius
     public void setCircleRadius(double radius) {
         this.radius = radius;
     }
 
     // Method to find the area of the circle
     public double area() {
         return Math.PI * radius * radius;
     }
 
     // Method to find the circumference of the circle
     public double circumference() {
         return 2 * Math.PI * radius;
     }
 
     // Method to display the area and circumference of the circle
     void displayCircleProperties() {
         System.out.println("The area of the circle is: " + area());
         System.out.println("The circumference of the circle is: " + circumference());
     }
 }
 
 class CircleInformation {
     public static void main(String[] args) {
         // To take input from user
         Scanner input = new Scanner(System.in);
         
         System.out.println("Enter the radius of the circle:");
         double radius = input.nextDouble();
 
         // Creating object for Circle class with the input radius
         Circle circle = new Circle(radius);
 
         // Calling methods from Circle class using the object
         circle.displayCircleProperties();
         
         input.close();
     }
 }
 