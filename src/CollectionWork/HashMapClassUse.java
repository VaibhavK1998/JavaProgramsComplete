package CollectionWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClassUse {
    public static void main(String[] args) {
hashMapMethodUse();
    }

    public static void hashMapMethodUse(){
      //  HashMap<Integer,Integer>map=new HashMap<>();
        HashMap map=new HashMap<>();
        map.put(1,100);
        map.put(4,200);
        map.put(3,300);
        map.put(2,990);
        map.put(null,10);
        map.put(6,2030);
        map.put(7,38);
        map.put(8,"rakesh");
        System.out.println(map);
        map.clear();
        System.out.println(map);
        map.put(1,100);
        map.put(2,200);
        map.put(3,300);
        map.put(4,900);
        System.out.println("ckeck if key is present: "+map.containsKey(3));
        System.out.println("ckeck if value is present: "+map.containsValue(1000));
        System.out.println("value of the key: "+map.get(2));
        map.remove(2);
        System.out.println("value of the key: "+map.get(2));
        System.out.println("size of the map: "+map.size());

      // way 1 to retrivew data from map
        Set<Map.Entry<Integer, Integer>> data=map.entrySet();
        for(Map.Entry<Integer, Integer> entry:data){
            System.out.println("key :"+entry.getKey() +" value: "+entry.getValue());
        }

        //way two to retrive data from map
        Set set=map.entrySet();
       Iterator it= set.iterator();
       while(it.hasNext()){
          Map.Entry entry=(Map.Entry)it.next();
          System.out.println("key :"+entry.getKey() +" value: "+entry.getValue());
       }

    }
}
