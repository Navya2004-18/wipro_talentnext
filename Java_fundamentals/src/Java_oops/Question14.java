// File: Question14.java
package Java_oops;

public class Question14 {
    public static String removeX(String str) {
        if (str.length() == 0) return str;

        if (str.startsWith("x")) {
            str = str.substring(1);
        }

        if (str.endsWith("x") && str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(removeX("xHix"));     // Output: Hi
        System.out.println(removeX("America"));  // Output: America
    }
}
