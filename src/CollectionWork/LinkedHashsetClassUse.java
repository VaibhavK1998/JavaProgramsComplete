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
        LinkedHashSet ls = new LinkedHashSet<>();
        ls.add(10);
        ls.add("20");
        ls.add("magesh");
        ls.add("pritam");
        ls.add("mahesh");

       Iterator itr=ls.iterator(); // to iterate elements from Set we use iterator

       while(itr.hasNext()){
           System.out.println(itr.next().hashCode());
       }


        Spliterator sp = ls.spliterator();
    System.out.println("size :" + sp.getExactSizeIfKnown());


    }
}
