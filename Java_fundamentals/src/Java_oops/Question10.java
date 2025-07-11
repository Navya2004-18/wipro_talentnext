package Java_oops;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = input.length();
        String firstTwo = input.length() >= 2 ? input.substring(0, 2) : input;

        // Create result using StringBuffer
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(firstTwo);
        }

        // Output result
        System.out.println("Result: " + result.toString());

        scanner.close();
    }
}
