
package Java_oops;

public class Question15 {
    public static String removeStarAndNeighbors(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*'
                || (i > 0 && str.charAt(i - 1) == '*')
                || (i < str.length() - 1 && str.charAt(i + 1) == '*')) {
                continue;
            }
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStarAndNeighbors("ab*cd")); // Output: ad
    }
}
