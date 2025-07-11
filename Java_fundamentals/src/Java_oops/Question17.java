// File: Question17.java
package Java_oops;

public class Question17 {
    public static String repeatEnd(String str, int n) {
        String lastPart = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(lastPart);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Wipro";
        int n = 3;
        System.out.println("Output: " + repeatEnd(input, n));  // Output: propropro
    }
}
