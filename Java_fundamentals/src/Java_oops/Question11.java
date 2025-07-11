package Java_oops;

public class Question11 {
    public static String getFirstHalf(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        // Test inputs
        String input1 = "TomCat";
        String input2 = "Apron";

        System.out.println("Input: " + input1 + " | Output: " + getFirstHalf(input1));
        System.out.println("Input: " + input2 + " | Output: " + getFirstHalf(input2));
    }
}
