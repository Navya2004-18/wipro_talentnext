// File: Question16.java
package Java_oops;

public class Question16 {
    public static String mixStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()) result.append(a.charAt(i));
            if (i < b.length()) result.append(b.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        System.out.println("Output: " + mixStrings(a, b));  // Output: HWeolrllod
    }
}
