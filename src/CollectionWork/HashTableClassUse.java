package CollectionWork;

import java.util.HashSet;
import java.util.Hashtable;

public class HashTableClassUse {
    public static void main(String[] args) {
        hashTableMethods();
    }

    public static void hashTableMethods() {
        Hashtable hs=new Hashtable<>();
        hs.put(106,"Vaibhav");
        hs.put(102,"manoj");
        hs.put(108,"rakesh");
        hs.put(117,"primal");
        System.out.println(hs);

        String name1="ab";
        String name2="bb";
        String name3="cb";
        String name4="dd";
        String name5="kl";

        // hashing technique tom store value in map or in hashtable
        System.out.println("hashcode value: 1"+name1.hashCode()); // hashvalue=1
        System.out.println("hashcode value: 2"+name2.hashCode());// hashvalue=0
        System.out.println("hashcode value: 3"+name3.hashCode());// hashvalue=15
        System.out.println("hashcode value: 4"+name4.hashCode());// hashvalue=0
        System.out.println("hashcode value: 5"+name5.hashCode());// hashvalue=1

        HashSet<String> s1=new HashSet<>();
        s1.add(name1);
        s1.add(name2);
        s1.add(name3);
        s1.add(name4);
        s1.add(name5);
        System.out.println("set value: "+s1);


    }
}
