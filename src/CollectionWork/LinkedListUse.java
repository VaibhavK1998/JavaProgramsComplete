package CollectionWork;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListUse {
    /*
    Linked List is a part of the Collection framework present in java.util package.
    This class is an implementation of the LinkedList data structure which is a linear data structure where
    the elements are not stored in contiguous locations and every element is a separate object with a data part and address part.
    The elements are linked using pointers and addresses. Each element is known as a node.

Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.

    Advantages of using LinkedList in Java:
Dynamic size: As with Vector, the size of a LinkedList can grow or shrink dynamically, so you don’t have to worry about setting an initial size.
Efficient Insertions and Deletions: LinkedList is an efficient data structure for inserting or deleting elements in the middle of the list because you only need to change the links between elements, rather than shifting all elements after the insertion or deletion point.
Flexible Iteration: With a linked list, you can efficiently iterate through the list in either direction, since each element has a reference to both its predecessor and successor elements.

Disadvantages of using LinkedList in Java:
Performance: LinkedList has a slower performance than ArrayList when it comes to accessing individual elements.
 This is because you need to traverse the list to reach the desired element, whereas with ArrayList, you can simply access
 the desired element using an index.
Memory overhead: LinkedList requires more memory than ArrayList because each element requires additional memory for the
 links to its predecessor and successor elements.
     */
    public static void main(String[] args) {
        checkLinkedList();
    }

    public static void checkLinkedList() {
        LinkedList l1 = new LinkedList<>();
        l1.offerFirst(10);
        l1.offerLast(1000);
        l1.add("rakesh");
        l1.add("suresh");
        l1.add("morsl");
        l1.add(90);
        l1.add(null);
        l1.add(null);
        System.out.println("array:" + l1);
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

        l1.addFirst("gajodhar");
        l1.addLast("shridhar");
        System.out.println(l1);
        System.out.println("first element od list:" + l1.getFirst());
        System.out.println("Last element of list:" + l1.getLast());
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);

    }
}
