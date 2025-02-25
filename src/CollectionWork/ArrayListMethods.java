package CollectionWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods {

    /*
    Java ArrayList class uses a dynamic array for storing the elements.
    It is like an array, but there is no size limit. We can add or remove elements anytime.
The ArrayList in Java can have the duplicate elements also. It implements the List interface
 so we can use all the methods of the List interface here The ArrayList maintains the insertion order internally.
 -Java ArrayList class can contain duplicate elements.
-Java ArrayList class maintains insertion order.
-Java ArrayList class is non synchronized.
-Java ArrayList allows random access because the array works on an index basis.
In ArrayList, manipulation is a little bit slower than the LinkedListUse in Java because
 a lot of shifting needs to occur if any element is removed from the array list.
We can not create an array list of the primitive types, such as int, float, char,
etc. It is required to use the required wrapper class in such cases. For example:

     */

    public static void main(String[] args) {

        //arrayListOwnMethods();
        testMethods();
        //collectionsClassMethodUse();
    }


    public static void arrayListOwnMethods() {
        ArrayList list1 = new ArrayList();
        list1.add(0, 100);
        list1.add(1, 191);// we can add element in specific index if you want
        list1.add(2, 140);
        list1.add(3, 90);
        list1.add(4, 20);
        list1.add(5, 100);
        list1.add(6, "rakesh");// arrayList can store heterogeneous data.
        list1.add(7, 100);// arrylist can store duplicate value.
        list1.add(8, null);// arrayList can store null values.
        System.out.println(list1);
        // list1.remove(7);
        // list1.set(8,88);// The set() method adds a new element at the specified position by replacing the older element at that position
        list1.add(8, 20);//The add() method adds a new element at the specified position by shifting the older element towards the right position.
        System.out.println(list1);
    }


    public static void testMethods() {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(199);
        list1.add(234);
        list1.add(2384);
        list1.add(2774);
        list1.add(2342);
        list1.add(null);
        System.out.println("original list1:" + list1);


        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(199);
        list2.add(234);
        list2.add(2384);
        list2.add(2774);
        list2.add(2342);
        list2.add(355);
        list2.add(22);
        list2.add(45);
        list2.add(22); // It is used to append the specified element at the end of a list.
        list2.toArray();
        System.out.println("original list2:" + list2);
        list2.add(5, 44);// It is used to insert the specified element at the specified position in a list.
        System.out.println("list2 after adding new element at inde 5:" + list2);
        list2.addAll(list1);// It is used to append all of the elements in the specified collection to the end of this list,
        System.out.println("list2 after adding complte list 1:" + list2);
        // in the order that they are returned by the specified collection's iterator.
        list2.addAll(3, list1);// It is used to append all the elements in the specified collection, starting at the specified position of the list.
        // list2.clear(); // use to remove all of the element from the list
        System.out.println("get value of index 3: " + list2.get(3));// It is used to fetch the element from the particular position of the list.
        System.out.println("checking if the list is empty: " + list2.isEmpty());//It returns true if the list is empty, otherwise false.
        list2.indexOf(2774);//It is used to return the index in this list of the first occurrence of the specified element,
        // or -1 if the List does not contain this element.
        System.out.println("checking if the list contains this value 22: " + list2.contains(22));  // it check this value is present in List

        System.out.println("checking if the list contains all the elements present in list 1: " + list2.containsAll(list1));// check all elements of collection is present
        // list2.remove(2342);// in the case of integer the object value it will consider as index value and it will throw exception. but for other data types it will work.
        //list2.remove(5);// remove elements of specific index
        //list2.removeAll(list1);// use to remove collection
        //  list2.set(5, 90); // use to set value of specific index

        System.out.println("List1 latest:" + list1);
        System.out.println("List2 latest :" + list2);
        System.out.println("check retaining: " + list2.retainAll(list1));
        list2.retainAll(list1);//// [it returns same element from both colletion] it will remove all those elements from list2 which is not part of list 1
        System.out.println("List2 :" + list2);
        list2.size();// it returns the size of List

        Iterator itr = list2.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void TestMethod2() {
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(199);
        list3.add(234);
        list3.add(2384);
        list3.add(2774);
        list3.add(2342);
        list3.add(355);
        list3.add(22);
        list3.add(45);

        List<Integer> list4 = new ArrayList<Integer>();
        list4.add(1990);
        list4.add(2340);
        list4.add(234);
        list4.add(274);
        list4.add(232);
        list4.add(3559);
        list4.add(220);
        list4.add(45);


        list4.containsAll(list3);

        for (int val : list4) {
            System.out.println("value : " + val);
        }
    }

    public static void collectionsClassMethodUse() {
        List<Integer> list4 = new ArrayList<Integer>();
        list4.add(1990);
        list4.add(2340);
        list4.add(234);
        list4.add(274);
        list4.add(232);
        list4.add(3559);
        list4.add(220);
        list4.add(45);
        Collections.sort(list4);
        System.out.println(list4);
    }
}
