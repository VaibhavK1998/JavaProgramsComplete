package CollectionWork;

import java.util.*;
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
        treesetMethodUse();
        //sample();
    }

    public static void treesetMethodUse() {
        TreeSet ts = new TreeSet<>();
        ts.add(100);
        ts.add(1000);
        ts.add(10);
        ts.add(206);
        ts.add(209);
        ts.add(250);
        System.out.println("Ceiling method output: " + ts.ceiling(990));//It returns the equal or closest greatest element of the specified element from the set, or null there is no such element.
        // ts.add(null);// null not allow in treeset
        //  ts.add("rakedh"); we can't store diffrent data type object
        System.out.println("initial set values: " + ts);
        Set s1 = ts.descendingSet();//It returns the elements in reverse order.
        System.out.println("set after descendingSet method :" + s1);
        Iterator itr = ts.descendingIterator();// It is used to iterate the elements in descending order.
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("floor method output: " + ts.floor(208));//It returns the equal or closest least element of the specified element from the set, or null there is no such element.
System.out.println("output of method headSet method:"+ts.headSet(209));//It returns the group of elements that are less than the specified element.
        System.out.println("output of higher method: " + ts.higher(10));//It returns the closest greatest element of the specified element from the set, or null there is no such element.
        System.out.println("output of lower method: " + ts.lower(208));//It returns the closest least element of the specified element from the set, or null there is no such element.
        System.out.println("output of subset method: " + ts.subSet(10,209));//It returns a set of elements that lie between the given range which includes fromElement and excludes toElement.
        System.out.println("output of tailSet method: " + ts.tailSet(10));//It returns a set of elements that are greater than or equal to the specified element.

        System.out.println("updated set: " + s1);
        System.out.println("output of first method: " + ts.first());// It returns the first (lowest) element currently in this sorted set.
        System.out.println("output of last method: " + ts.last());// It returns the last (highest) element currently in this sorted set.





    }

    public static void sample() {

        int ar[] = {-1, 2, -1, 3, 4, 0, -8};
        ArrayList al = new ArrayList<>();

        for (int i = 0; i < ar.length; i++) {
            al.add(ar[i]);
        }
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        TreeSet ts = new TreeSet<>(al);
        System.out.println(ts);
    }


}

