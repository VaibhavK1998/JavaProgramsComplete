package streamApiPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DiifrentWayToCreateStreamObject {
    public static void main(String[] args) {
        //createEmptyStream();
        //way1();
        way2();
    }

    public static void createEmptyStream() {
        Stream<Object> stream = Stream.empty();
        stream.forEach(e -> {
            System.out.println(e);
        });
    }

    public static void way1() {
        String ar[] = {"ramhul", "prites", "rajesh", "manthan", "manoj" };
        System.out.println(Arrays.stream(ar).count());// first way to create object of stream class.
    }

    public static void way2() {
        String ar[] = {"ramhul", "prites", "rajesh", "manthan", "manoj" };
        Stream<String> stream = Stream.of(ar);// second way to create object of stream
        stream.forEach(e -> {
            System.out.println("way to method elements print :" + e);
        });
    }

    public static void way3() {
        Stream<Object> s = Stream.builder().build();// third way to create object of stream by using builder pattern
    }

    public static void way4() {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(199);
        list1.add(234);
        list1.add(2384);
        list1.add(2774);
        list1.add(2342);
        list1.add(null);

        Stream<Integer> stream=list1.stream();// way 4 to creat object of stream
    }

    public static void way5() {

    }
}
