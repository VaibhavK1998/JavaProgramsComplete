package CollectionWork;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ArrayDequeClassUse {
    public static void main(String[] args) {
arrayDequeClassMethodUse();
    }

    public static void arrayDequeClassMethodUse() {
        ArrayDeque ad=new ArrayDeque<>();
        ad.add(1);
        ad.add(10);
        ad.add(100);
        System.out.println(ad);
        ad.addFirst(50);
        ad.addLast(100);
        System.out.println(ad);
        ad.removeFirst();
        ad.removeLast();
        System.out.println(ad);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println(ad.offerFirst(90));
        System.out.println(ad.offerLast(120));
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        System.out.println(ad);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

    }
}
