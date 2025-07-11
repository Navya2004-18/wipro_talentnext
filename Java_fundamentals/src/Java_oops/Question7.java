package Java_oops;

// Base class
class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }

    public void erase() {
        System.out.println("Erasing Shape");
    }
}

// Subclass: Circle
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}

// Subclass: Triangle
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}

// Subclass: Square
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}

// Main class
public class Question7 {
    public static void main(String[] args) {
        // Creating objects using polymorphism
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        // Call draw and erase for Circle
        c.draw();
        c.erase();

        // Call draw and erase for Triangle
        t.draw();
        t.erase();

        // Call draw and erase for Square
        s.draw();
        s.erase();
    }
}

