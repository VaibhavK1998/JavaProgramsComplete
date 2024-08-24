package streamApiPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiPract1 {
    public static void main(String[] args) {

        testWithStreamApi();
       // testWithoutStreamApi();
    }

    public static void testWithStreamApi() {
        // here we are retriving even element from list and creating new arrayList with even number
        List<Integer> al = List.of(10, 20, 30, 12, 19);// if we create list using this way you can't modify the list. this method create immutable object of list.
        System.out.println(al);
        //Stream<Integer> stream = al.stream();
        List evenNumberList = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());// note the expression we written in filter() we called them predicate.
        System.out.println("even number list with streamApi :" + evenNumberList);
        List<String> al2 = List.of("mahesh","bharati");
        al2.stream().forEach(e-> {
           System.out.println("al2 elements:"+e);
        });


    }

    public static void testWithoutStreamApi() {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(38);
        list1.add(47);
        list1.add(29);

        List<Integer> evenList = new ArrayList<>();  // here we can see to filter and create new List with even number we need to write long code as compare to the code when we use stream api.
        for (Integer value : list1) {
            if (value % 2 == 0) {
                evenList.add(value);
            }
        }
        System.out.println("even number list without streamApi :" + evenList);

    }
}
