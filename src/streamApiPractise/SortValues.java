package streamApiPractise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortValues {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(List.of(10, 90, 20, 56, 80));
        Comparator<Integer> lengthComparator = (s1,s2) -> s2 - s1;
        al.sort(lengthComparator);
        al.forEach(System.out::println);
    }
}
