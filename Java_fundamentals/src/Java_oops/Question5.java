package Java_oops;

// Base class Person
class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Derived class Employee
class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    // Constructor
    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name); // Call to Person class constructor
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getters and Setters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Display all employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Annual Salary: ₹" + annualSalary);
        System.out.println("Year Started: " + yearStarted);
        System.out.println("National Insurance Number: " + nationalInsuranceNumber);
    }
}

// Testing class
public class Question5 {
    public static void main(String[] args) {
        // Create Employee object and test all methods
        Employee emp = new Employee("Navya Sree", 750000.0, 2022, "NI12345678");

        // Display details
        System.out.println("Employee Details:");
        emp.displayEmployeeDetails();

        // Modify values
        emp.setAnnualSalary(800000.0);
        emp.setYearStarted(2023);
        emp.setNationalInsuranceNumber("NI99999999");

        // Display updated details
        System.out.println("\nUpdated Employee Details:");
        emp.displayEmployeeDetails();
    }
}
