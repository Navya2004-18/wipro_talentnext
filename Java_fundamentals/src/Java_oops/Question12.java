// File: Question12.java
package Java_oops;

public class Question12 {
    public static String removeFirstLast(String input) {
        if (input.length() <= 2) {
            return ""; // Not enough characters to remove
        }
        return input.substring(1, input.length() - 1);
    }

    public static void main(String[] args) {
        String input = "Suman";
        String result = removeFirstLast(input);
        System.out.println("Output: " + result); // Output: uma
    }
}
