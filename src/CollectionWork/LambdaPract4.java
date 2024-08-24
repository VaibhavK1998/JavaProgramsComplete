package CollectionWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaPract4 {

        public static void main(String[] args) {
            List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

            // Define a comparator that compares strings by their length
            Comparator<String> lengthComparator = (String s1, String s2) -> s1.length() - s2.length();

            // Sort the list using the lengthComparator
            names.sort(lengthComparator);

            // Print the sorted list
            names.forEach(System.out::println);
        }
    }


