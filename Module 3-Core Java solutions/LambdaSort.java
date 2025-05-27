import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "John", "Alex", "Ben");

        System.out.println("Original list: " + names);

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted list: " + names);
    }
}
