package CollectionWork;

import java.util.LinkedHashMap;

public class LinkedHashMapClassUse {
    /*
    LinkedHashMap maintains the insertion order of keys, the order in which keys are inserted into LinkedHashMap.
    On the other hand, HashMap doesn't maintain any order or keys, or values.
     */
    public static void main(String[] args) {
        methodsOfLInkedHashMapclass();
    }
    public static void methodsOfLInkedHashMapclass(){
        LinkedHashMap map=new LinkedHashMap<>();
        map.put(1,100);
        map.put(4,200);
        map.put(3,300);
        map.put(2,990);
        map.put(null,10);
        map.put(6,2030);
        System.out.println(map);

    }
}
