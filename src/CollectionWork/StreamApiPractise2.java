package CollectionWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApiPractise2 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(20);
        l1.add(20);
        l1.add(40);
        l1.add(19);
        l1.add(45);


        Set<Integer> l2 = l1.stream().filter(i -> i > 10 && i < 50).collect(Collectors.toSet());
        System.out.println("l2:" + l2);

        List<Integer> l3 = l1.stream()
                .map(e -> e * 2)
                .collect(Collectors.toList());
        System.out.println("l3:" + l3);

        List<Integer> l4 = l1.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted list:" + l4);

        l1.stream().sorted().forEach(System.out::println);
        List<Integer> l5 = l1.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println("l5 descending order:" + l5);

        Comparator<Integer> s1 = (a, b) -> {
            if (a > b) {
                return 1;
            } else {
                return 0;
            }
        };

        System.out.println(s1.compare(10, 20));
    }}




