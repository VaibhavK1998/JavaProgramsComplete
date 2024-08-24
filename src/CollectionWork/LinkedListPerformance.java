package CollectionWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPerformance {
    public static void main(String[] args) {
        int size = 1000000;
        List<Integer> arrayList = new ArrayList<>(size);
        List<Integer> linkedList = new LinkedList<>();

        // Populate both lists with the same elements
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Measure time taken to access the 500,000th element in ArrayList
        long startTime = System.nanoTime();
        int elementFromArrayList = arrayList.get(500000);
        long endTime = System.nanoTime();
        System.out.println("Time taken to access element in ArrayList: " + (endTime - startTime) + " ns");

        // Measure time taken to access the 500,000th element in LinkedList
        startTime = System.nanoTime();
        int elementFromLinkedList = linkedList.get(500000);
        endTime = System.nanoTime();
        System.out.println("Time taken to access element in LinkedList: " + (endTime - startTime) + " ns");
    }
}
