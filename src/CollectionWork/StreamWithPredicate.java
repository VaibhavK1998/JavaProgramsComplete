package CollectionWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamWithPredicate {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(20);
        l1.add(20);
        l1.add(40);
        l1.add(19);
        l1.add(45);

        List<Integer> filteredItems = l1.stream()
                .filter(item -> Collections.frequency(l1, item) > 2)
                .distinct() // To ensure each element appears only once in the output
                .collect(Collectors.toList());

        // Print the filtered list
        System.out.println(filteredItems);
    }
}
