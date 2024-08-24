package CollectionWork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiImportantMethods {
    public static void main(String[] args) {
        methodsInStreamApi();
    }

    public static void methodsInStreamApi() {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(199);
        list1.add(234);
        list1.add(2384);
        list1.add(2774);
        list1.add(2342);
        // list1.add(null);
        System.out.println(list1);

        List<Integer> listv2 = new ArrayList<Integer>();
        listv2.add(199);
        listv2.add(234);
        listv2.add(2384);
        listv2.add(2774);
        listv2.add(2342);
        listv2.add(355);
        listv2.add(22);
        listv2.add(45);

        List<Integer> list2 = list1.stream().filter(e -> e < 500).collect(Collectors.toList()); // method 1 filter(predicate) predicate means boolean function we need to passes it will return true or false and on the basis of this it will create new stream
        System.out.println("list 2: " + list2);

        List<Integer> list3 = list1.stream().map(e -> e / 10).collect(Collectors.toList());// method 2 in this map we need to passed function and it will apply this on all the elements of stream and it creates new stream with updated objects
        System.out.println("list 3 :" + list3);

        list1.stream().sorted().forEach(System.out::println);// method 3 sorted methos use to sorted a stream
        Integer minValue = list1.stream().min((x, y) -> x.compareTo(y)).get();// method4 min()
        System.out.println("min value :" + minValue);

        Integer maxValue = list1.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("max value :" + maxValue);

        List<Integer> l4=list1.stream().sorted().collect(Collectors.toList());
        System.out.println("l4:"+l4);

        Stream<Integer> stream1 = list1.stream();
        Stream<Integer> stream2 = listv2.stream();


        System.out.println("count of stream1 :" + stream1.count());// count method use to check count of elements in stream1

        //System.out.println("findFirst method use :" + stream1.findFirst());

        Stream<Integer> s5 = stream1.limit(4);
        System.out.println("s5:" + s5);
    }
}
