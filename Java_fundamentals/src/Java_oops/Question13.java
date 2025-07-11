// File: Question13.java
package Java_oops;

public class Question13 {
    public static String shortLongShort(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static void main(String[] args) {
        String a = "hi";
        String b = "hello";
        String result = shortLongShort(a, b);
        System.out.println("Output: " + result); // Output: hihellohi
    }
}
