package Java_oops;

// Base class
class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    // Constructor
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to be overridden
    public void eat() {
        System.out.println("This is a " + name + ". It tastes " + taste + ".");
    }
}

// Apple class inheriting Fruit
class Apple extends Fruit {

    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    // Overriding eat method
    @Override
    public void eat() {
        System.out.println("Apple: Sweet and crunchy taste.");
    }
}

// Orange class inheriting Fruit
class Orange extends Fruit {

    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    // Overriding eat method
    @Override
    public void eat() {
        System.out.println("Orange: Tangy and juicy taste.");
    }
}

// Main class
public class Question6 {
    public static void main(String[] args) {
        // Creating objects
        Fruit genericFruit = new Fruit("Generic Fruit", "varied", "medium");
        Apple apple = new Apple("Apple", "sweet", "small");
        Orange orange = new Orange("Orange", "sour", "medium");

        // Calling methods
        System.out.println("Generic Fruit:");
        genericFruit.eat();

        System.out.println("\nApple:");
        apple.eat();

        System.out.println("\nOrange:");
        orange.eat();
    }
}




