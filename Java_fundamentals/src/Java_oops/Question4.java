package Java_oops;

// Parent class
class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Child class
class Bird extends Animal {
    // Overriding eat() method
    @Override
    public void eat() {
        System.out.println("Bird is pecking food...");
    }

    // Overriding sleep() method
    @Override
    public void sleep() {
        System.out.println("Bird is sleeping in the nest...");
    }

    // New method in child class
    public void fly() {
        System.out.println("Bird is flying in the sky...");
    }
}

public class Question4 {
    public static void main(String[] args) {
        // Creating instance of Animal class
        Animal animal = new Animal();
        System.out.println("Animal class methods:");
        animal.eat();
        animal.sleep();

        System.out.println();

        // Creating instance of Bird class
        Bird bird = new Bird();
        System.out.println("Bird class methods:");
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
