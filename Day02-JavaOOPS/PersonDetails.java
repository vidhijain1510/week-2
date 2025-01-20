/*Create a Person class with a copy constructor that clones another person's attributes. */

import java.util.*;

class Person{
    private String name;
    private char gender;
    private int age;

    //Getter
    public String getName() {
        return name;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Getter
    public char getGender() {
        return gender;
    }
    //Setter
    public void setGender(char gender) {
        this.gender = gender;
    }

    //Getter
    public int getAge() {
        return age;
    }
    //Setter
    public void setAge(int age) {
        this.age = age;
    }

    //Parametrized constructor
    Person(String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //Copy constructor
    Person(Person previousPerson){
        this.name = previousPerson.name;
        this.gender = previousPerson.gender;
        this.age = previousPerson.age;
    }

    //Method to display details
    void displayPersonDetails(){
        System.out.println("Name: " + name + "\nGender: " + gender + "\nAge: " + age +"Years");
    }
}

public class PersonDetails{
    public static void main(String[] args) {
        //To take user input
        Scanner input = new Scanner(System.in);

        //Taking input for name, gender and age of a person
        System.out.println("Enter the name of person: ");
        String name = input.nextLine();//name input
        System.out.println("Enter the gender of person: (\"F\" for female and \"M\" for male)");
        char gender = input.next().charAt(0); //gender input
        System.out.println("Enter the age of person(in years): ");
        int age = input.nextInt();

        //Creating object for parameterized constructor
        Person object1 = new Person(name, gender, age);
        object1.displayPersonDetails();
        System.out.println();

        //Creating object for copy constructor
        Person object2 = new Person(object1);
        object2.displayPersonDetails();

        input.close();
    }
}