package basicProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ArraySortDescending {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        HashSet ts=new HashSet<>();
        ts.add(55);
        ts.add(33);
        ts.add(10);
        ts.add(90);
        TreeSet ts1=new TreeSet<>(ts);
        System.out.println(ts1.descendingSet());
        ArrayList al=new ArrayList<>(ts);
        System.out.println(al.get(0));

    }
}
