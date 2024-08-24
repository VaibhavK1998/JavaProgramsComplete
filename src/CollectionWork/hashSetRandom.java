package CollectionWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class hashSetRandom {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(20);
        l1.add(70);
        l1.add(30);
        l1.add(20);
        l1.add(20);
        List<Integer> l2=new ArrayList<>();
        for(int v:l1){
            if(l2.contains(v))
                System.out.println(v +"already present in list");
            else l2.add(v);

        }
        System.out.println(l2);
    }
}
