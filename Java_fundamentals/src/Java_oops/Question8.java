package Java_oops;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Convert to lowercase and remove spaces (optional for strict check)
        String clean = original.toLowerCase().replaceAll("\\s+", "");

        // Reverse the string
        String reversed = new StringBuilder(clean).reverse().toString();

        // Check palindrome
        if (clean.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}
