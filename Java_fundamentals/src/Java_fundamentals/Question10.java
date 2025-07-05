package Java_fundamentals;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32);
            System.out.println("Uppercase: " + ch);
        } else if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
            System.out.println("Lowercase: " + ch);
        } else {
            System.out.println("Not an alphabet character");
        }
    }
}
