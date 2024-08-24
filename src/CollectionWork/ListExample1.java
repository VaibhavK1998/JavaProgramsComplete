package CollectionWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample1 {

public void listImplement(){


    List<Integer> list2=new ArrayList<Integer>();
    list2.add(199);
    list2.add(234);
    list2.add(2384);
    list2.add(2774);
    list2.add(2342);
    list2.add(355);
    list2.add(22);
    list2.add(45);

    Iterator<Integer> iterator = list2.iterator(); // we can retrive value from list using iterator
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
}



    public static void main(String[] args) {
        ListExample1 l1=new ListExample1();
        l1.listImplement();
    }
}
