package CollectionWork;

import java.util.HashSet;
import java.util.Set;

public class HashCodeHashValue {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>(10);
        s1.add(100);
        s1.add(501);
        s1.add(34);
        s1.add(22);
        System.out.println(s1);

        Set<Character> c1=new HashSet<>(16);
        c1.add('Z');
        c1.add('a');
        c1.add('N');
        c1.add('p');
        System.out.println(c1);
    }
}
