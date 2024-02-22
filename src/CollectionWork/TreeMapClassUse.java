package CollectionWork;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClassUse {
    public static void main(String[] args) {
        treeMapClassUse();
    }

    public static void treeMapClassUse() {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(1, 100);
        map.put(4, 200);
        map.put(3, 300);
        map.put(2, 990);
        map.put(5, 10);
        map.put(6, 2030);
        map.put(7, 38);
        System.out.println(map);
        map.clear();
        System.out.println(map);
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 900);
        map.put(5, 10);
        map.put(6, 2030);
        map.put(7, 38);
        System.out.println(map);
        System.out.println("ckeck if key is present: " + map.containsKey(3));
        System.out.println("ckeck if value is present: " + map.containsValue(1000));
        System.out.println("value of the key: " + map.get(2));
        map.remove(2);
        System.out.println(map);
        System.out.println("entry sceilling " + map.ceilingEntry(3));
        System.out.println("entry sceilling key " + map.ceilingKey(3));
        System.out.println("floor entry " + map.floorEntry(4));
        System.out.println("first entry: " + map.firstEntry());
        System.out.println("size of the map: " + map.size());
        System.out.println("headMap method use : " + map.headMap(4));
        System.out.println("higher entry of key: " + map.higherEntry(3));
        System.out.println("removing first entry " + map.pollFirstEntry());
        System.out.println("removing Last entry " + map.pollLastEntry());
        map.replace(6,2024);
        System.out.println(map);
        System.out.println(map.subMap(4,6));
        Set<Map.Entry<Integer, Integer>> data = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : data) {
            System.out.println("key :" + entry.getKey() + " value: " + entry.getValue());
        }
    }
}
