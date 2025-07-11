// File: Question19.java
package Java_oops;

import java.util.StringJoiner;

public class Question19 {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi").add("Mumbai");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Kolkata").add("Chennai");

        // Case i) s1 merged to s2
        StringJoiner mergedToS2 = new StringJoiner("-");
        mergedToS2.merge(s2);
        mergedToS2.merge(s1);
        System.out.println("s1 merged to s2: " + mergedToS2);

        // Case ii) s2 merged to s1
        StringJoiner mergedToS1 = new StringJoiner("-");
        mergedToS1.merge(s1);
        mergedToS1.merge(s2);
        System.out.println("s2 merged to s1: " + mergedToS1);
    }
}
