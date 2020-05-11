import java.util.*;
import java.util.stream.Collectors;

// A stream is a wrapper around a data source that makes it easier to operate with the source
public class StreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 6, 8, 3);

        // Creates a new stream that double each item and displays it
        numbers.stream()
                .map(item->item*2)  // Maps based on rule defined within parentheses
                .forEach(System.out::println);  // Prints out each element of the list (This is a method reference)
                // Can also be written as a lambda expression: .forEach(item -> System.out.println(item));

        // Creates new list to hold elements that meet the defined stream rule
        List<Integer> evenIntegers = numbers.stream()
                .filter(item-> item % 2 ==0)  // Only maps values that meet defined rule (even)
                .collect(Collectors.toList());  // Creates list out of all values that met the rules

        System.out.println(evenIntegers); // Prints out 2, 6, and 8
    }
}
