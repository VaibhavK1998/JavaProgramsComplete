package CollectionWork;

import java.util.LinkedList;
import java.util.Vector;

public class VectorClassUse {
    public static void main(String[] args) {

        vectorMethodsUse();
    }

    public static void vectorMethodsUse() {
        Vector l1 = new Vector<>(1);
        l1.add("rakesh");
        l1.add("suresh");
        l1.add("morsl");
        l1.add(90);
        l1.add(null);
        l1.add(null);

        l1.add(22); // It is used to append the specified element at the end of a list.
        l1.add(5, 44);// It is used to insert the specified element at the specified position in a list.
        //l1.addAll(list1);// It is used to append all of the elements in the specified collection to the end of this list,
        // in the order that they are returned by the specified collection's iterator.
        // l1.addAll(3,list1);// It is used to append all the elements in the specified collection, starting at the specified position of the list. l1.clear(); // use to remove all of the element from the list
        l1.get(3);// It is used to fetch the element from the particular position of the list.
        l1.isEmpty();//It returns true if the list is empty, otherwise false.
        l1.indexOf(2774);//It is used to return the index in this list of the first occurrence of the specified element,
        // or -1 if the List does not contain this element.
        l1.contains(22);// it check this value is present in List
        //l1.containsAll(list1);// check all elements of collection is present
        //l1.remove(90);// remove object if its present in list
        // l1.remove(5);// remove elements of specific index
        // l1.removeAll(list1);// use to remove collection
        l1.set(5, 90); // use to set value of specific index
        //l1.retainAll(list1);// It is used to retain all the elements in the list that are present in the specified collection.
        // it return same element from both colletion
        l1.addElement("mahesh");
        System.out.println("first element of vector: "+l1.firstElement());
        System.out.println("last element of vector: "+l1.lastElement());
        System.out.println("l1 elements" + l1);
        l1.removeElement(90);
        l1.removeElementAt(3);
        l1.setElementAt(155,0);
        System.out.println("l1 elements after removal" + l1);
        System.out.println("vector class capacity :" + l1.capacity());

    }
}
