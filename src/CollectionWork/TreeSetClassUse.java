package CollectionWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetClassUse {
    /*
    Java TreeSet class implements the Set interface that uses a tree for storage.
    It inherits AbstractSet class and implements the NavigableSet interface.
    The objects of the TreeSet class are stored in ascending order.

    Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quite fast.
Java TreeSet class doesn't allow null elements.
Java TreeSet class is non-synchronized.
Java TreeSet class maintains ascending order.
The TreeSet can only allow those generic types that are comparable.
 For example The Comparable interface is being implemented by the StringBuffer class.
     */
    public static void main(String[] args) {
        // treesetMethodUse();
        sample();
    }

    public static void treesetMethodUse() {
        TreeSet ts = new TreeSet<>();
        ts.add(100);
        ts.add(1000);
        ts.add(10);
        ts.add(20);
        ts.add(null);// null not allow in treeset
        //  ts.add("rakedh"); we can't store diffrent data type object

        System.out.println(ts);

    }

    public static void sample() {

        int ar[]={-1,2,-1,3,4,0,-8};
        ArrayList al=new ArrayList<>();

        for(int i=0;i<ar.length;i++){
            al.add(ar[i]);
        }
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        TreeSet ts=new TreeSet<>(al);
        System.out.println(ts);
    }


}

