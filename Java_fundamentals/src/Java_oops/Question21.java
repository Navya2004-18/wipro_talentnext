// File: Question21.java
package Java_oops;

import java.util.Optional;

public class Question21 {
    public static void main(String[] args) {
        String address = null; // or try: "Bangalore"
        Optional<String> optionalAddress = Optional.ofNullable(address);

        String result = optionalAddress.orElse("India");
        System.out.println("Address: " + result); // Output: India (if null)
    }
}
