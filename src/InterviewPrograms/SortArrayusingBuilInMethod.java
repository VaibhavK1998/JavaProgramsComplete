package InterviewPrograms;

import java.util.*;

public class SortArrayusingBuilInMethod {
    public static void main(String[] args) {
       // sortArrayDescendingOrder();
       // sortArrayDescendingOrderWay2();
    }
    public static void sortArrayInAscendingOrder(){
        int ar[]={10,90,20,30,50};
        System.out.println("Array before sorting"+Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println("Array after sorting"+Arrays.toString(ar));
    }
    public static void sortArrayDescendingOrder(){
        Integer ar[]={10,90,20,30,50};
        System.out.println("Array before sorting"+Arrays.toString(ar));
        Arrays.sort(ar,Collections.reverseOrder());
        System.out.println("Array after sorting"+Arrays.toString(ar));
    }

}
