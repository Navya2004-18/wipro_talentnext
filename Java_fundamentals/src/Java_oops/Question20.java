// File: Question20.java
package Java_oops;

import java.util.Optional;

public class Question20 {
    public static void main(String[] args) {
        String[] names = new String[5];
        Optional<String> optionalName = Optional.ofNullable(names[0]);

        if (optionalName.isPresent()) {
            System.out.println(optionalName.get().length());
        } else {
            System.out.println("Value is null, cannot get length.");
        }
    }
}
