package CollectionWork;

import java.util.HashSet;

public class HashSetClassUse {
    /*
    Java HashSet class is used to create a collection that uses a hash table for storage.
    It inherits the AbstractSet class and implements Set interface.
The important points about Java HashSet class are:
HashSet does not contain duplicate value.
HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.
     */
    public static void main(String[] args) {
        hashSetMethodUse();
    }

    public static void hashSetMethodUse() {
        HashSet hs1 = new HashSet<>();
        hs1.add("10");
        hs1.add("10");
        hs1.add(100);
        hs1.add("madan");
        System.out.println("print an set : " + hs1);
        hs1.clear();
        System.out.println("value is present :" + hs1.contains(100));
        hs1.remove(10);
        System.out.println("print size of the set : " + hs1.size());
        System.out.println("print an set : " + hs1);
        System.out.println("check set is empty : " + hs1.isEmpty());
    }
}
