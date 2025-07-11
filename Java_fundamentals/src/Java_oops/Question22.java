package Java_oops;

import java.util.Optional;

public class Question22 {

    // Inner Employee class
    static class Employee {
        public String name;

        public Employee(String name) {
            this.name = name;
        }
    }

    // Inner custom exception class
    static class InvalidEmployeeException extends RuntimeException {
        public InvalidEmployeeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        // Case 1: null employee
        Employee emp1 = null;

        Optional<Employee> optionalEmp1 = Optional.ofNullable(emp1);
        try {
            Employee e1 = optionalEmp1.orElseThrow(() ->
                new InvalidEmployeeException("Employee is null")
            );
            System.out.println("Employee name: " + e1.name);
        } catch (InvalidEmployeeException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

        // Case 2: non-null employee
        Employee emp2 = new Employee("John");

        Optional<Employee> optionalEmp2 = Optional.ofNullable(emp2);
        try {
            Employee e2 = optionalEmp2.orElseThrow(() ->
                new InvalidEmployeeException("Employee is null")
            );
            System.out.println("Employee name: " + e2.name);
        } catch (InvalidEmployeeException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}

