package Java_oops;

class Author {
    private String name;
    private String email;
    private char gender;

    // Parameterized Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // toString method for displaying Author details
    public String toString() {
        return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
    }
}

class Book {
    private String name;
    private Author author; // HAS-A relationship
    private double price;
    private int qtyInStock;

    // Parameterized Constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    // toString method for displaying Book details
    public String toString() {
        return "Book Name: " + name + "\n"
             + "Price: " + price + "\n"
             + "Quantity in Stock: " + qtyInStock + "\n"
             + author.toString(); // Reusing Author's toString
    }
}

public class Question3 {
    public static void main(String[] args) {
        // Create Author object
        Author author = new Author("Navya Reddy", "navya@example.com", 'F');

        // Create Book object
        Book book = new Book("Java Basics", author, 599.99, 100);

        // Print all book and author details
        System.out.println(book.toString());
    }
}


