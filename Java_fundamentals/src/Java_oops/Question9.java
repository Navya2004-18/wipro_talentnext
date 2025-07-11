package Java_oops;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Convert both to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check for double character at joining point
        if (!str1.isEmpty() && !str2.isEmpty() && str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            str2 = str2.substring(1); // Remove duplicate character
        }

        // Concatenate
        String result = str1 + str2;

        // Output
        System.out.println("Result: " + result);

        scanner.close();
    }
}
