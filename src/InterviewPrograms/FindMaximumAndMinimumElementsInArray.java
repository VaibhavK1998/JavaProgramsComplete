package InterviewPrograms;

import java.util.Arrays;
import java.util.TreeSet;

public class FindMaximumAndMinimumElementsInArray {
    public static void main(String[] args) {
        //  findMinElementInArrayWay1();
        findMaxElementInArrayWay2();
    }

    public static void findMinElementInArrayWay1() {
        int ar[] = {100, 12, 19, 18, 27, 90};
        int min = ar[0];
        for (int i = 1; i <= ar.length - 1; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.println("min number of array is :" + min);

    }


    public static void findMaxElementInArrayWay2() {
        int ar[] = {10, 12, 19, 18, 27, 90};
        int max = ar[0];
        for (int i = 1; i <= ar.length - 1; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.println("max number of array is :" + max);
    }
}
