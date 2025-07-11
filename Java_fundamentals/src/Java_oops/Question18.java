// File: Question18.java
package Java_oops;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Question18 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        StringJoiner joiner = new StringJoiner(",", "{", "}");
        names.forEach(joiner::add);

        System.out.println("Joined names: " + joiner); // Output: {Alice,Bob,Charlie}
    }
}
