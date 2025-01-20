/*Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values. */

import java.util.*;
class Circle{
    //Attribute
    private double circleRadius;

    //Getter
    public double getCircleRadius() {
        return circleRadius;
    }
    //Setter
    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    //Default constructor
    Circle(){
        this(1);
    }

    //Parameterized constructor
    Circle(double circleRadius){
        this.circleRadius = circleRadius;
    }

    void display(){
        System.out.print("The radius of circle is: " + circleRadius + "cm");
    }
}

public class CircleRadius{
    public static void main(String[] args){
        //To take user input
        Scanner input = new Scanner(System.in);

        //Creating object for default construtor
        Circle object1 = new Circle();
        System.out.println("The default value: ");
        object1.display();//Calling display method
        System.out.println();

        //Taking user input for radius
        System.out.println("Enter the radius of a circle(in cm): ");
        double radius = input.nextDouble();

        //Creating object for parameterized constructor
        Circle object2 = new Circle(radius);
        System.out.println("The user defined value: ");
        object2.display();//Calling display method

        input.close();
    }

}


