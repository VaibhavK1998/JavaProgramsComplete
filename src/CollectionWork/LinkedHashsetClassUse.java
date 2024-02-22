package CollectionWork;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;
import java.util.Spliterators;

public class LinkedHashsetClassUse {
    /*
    Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface.
    It inherits the HashSet class and implements the Set interface.
The important points about the Java LinkedHashSet class are;
Java LinkedHashSet class contains unique elements only like HashSet.
Java LinkedHashSet class provides all optional set operations and permits null elements.
Java LinkedHashSet class is non-synchronized.
Java LinkedHashSet class maintains insertion order.
     */
    public static void main(String[] args) {
        linkedHashSetMethods();
    }

    public static void linkedHashSetMethods() {
        LinkedHashSet<String> linkedset
                = new LinkedHashSet<String>();

        // Adding element to LinkedHashSet
        // using add() method
        linkedset.add("A");
        linkedset.add("B");
        linkedset.add("C");
        linkedset.add("D");

        // Note: This will not add new element
        // as A already exists
        linkedset.add("A");
        linkedset.add("E");

        // Getting size of LinkedHashSet
        // using size() method
        System.out.println("Size of LinkedHashSet = "
                + linkedset.size());

        System.out.println("Original LinkedHashSet:"
                + linkedset);

        // Removing existing entry from above Set
        // using remove() method
        System.out.println("Removing D from LinkedHashSet: "
                + linkedset.remove("D"));

        // Removing existing entry from above Set
        // that does not exist in Set
        System.out.println(
                "Trying to Remove Z which is not "
                        + "present: " + linkedset.remove("Z"));

        // Checking for element whether it is present inside
        // Set or not using contains() method
        System.out.println("Checking if A is present="
                + linkedset.contains("A"));

        // Noew lastly printing the updated LinkedHashMap
        System.out.println("Updated LinkedHashSet: "
                + linkedset);


    }
}
