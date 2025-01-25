/*Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. 
Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.*/

//package CapgemTrain.week2.day05javaoops;

//Superclass Animal with attributes name and age
class Animal{
    private String name;
    private int age;

    //Getters and Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    //Constructor
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //A method makeSound()
    void makeSound(){
        System.out.println("Animal making sound:");
    }

    //Display details 
    void display(){
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
//Subclasses Dog with a unique implementation of makeSound()
class Dog extends Animal{
    Dog(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(getName() + " is barking");
    }
}
//subclasses Cat with a unique implementation of makeSound()
class Cat extends Animal{
    Cat(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println( getName() + " is meowing");
    }
}
//subclasses Bird with a unique implementation of makeSound()
class Bird extends Animal{
    Bird(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println( getName() + " is singing");
    }
}

public class AnimalSound{
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 0);
        animal.makeSound();

        Animal dog = new Dog("Kutta", 5);
        dog.display();
        dog.makeSound();

        Animal cat = new Cat("Billi", 5);
        cat.display();
        cat.makeSound();

        Animal bird= new Bird("Chidiya", 5);
        bird.display();
        bird.makeSound();


    }
}