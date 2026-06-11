//Optional Class Example

import java.util.Arrays;
import java.util.List;

public class opt {
    public static void main(String[] args) {

        // A fixed list of names
        List<String> names = Arrays.asList("Navin", "Lakshmi", "John", "Kishor");

        // Optional<T> is a container that may or may not hold a value
        // It is used to avoid NullPointerException
        // Instead of returning null when something isn't found, we return Optional.empty()

        String name = names.stream()
                           .filter(str -> str.contains("x"))  // keep only names containing "x"
                           .findFirst()                        // get the first match, returns Optional<String>
                           .orElse("Not Found");               // if Optional is empty, use this default value

        // Since no name contains "x", Optional is empty → "Not Found" is printed
        System.out.println(name);
    }
}
