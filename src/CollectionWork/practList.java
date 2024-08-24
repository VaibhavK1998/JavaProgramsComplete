package CollectionWork;

import java.util.ArrayList;
import java.util.List;

public class practList {
    public static void main(String[] args) {

        List<String> a1 = new ArrayList<String>();
        a1.add("ok");
        a1.add("b1");
        a1.add("c1");
        for (String name : a1) {
            System.out.println(name);
        }
        a1.remove(1);

    }
}
