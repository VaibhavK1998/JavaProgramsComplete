package InterviewPrograms;

import java.util.Arrays;

public class CheckEqualityOfArrays {
    public static void main(String[] args) {
        checkEqualityOfArraysWay1();
    }

    public static void checkEqualityOfArraysWay1() {
        int a1[] = {10, 20, 20, 90, 80,100};
        int a2[] = {10, 90, 60, 80, 100, 120};

        if (a1.length == a2.length) {
            boolean result = Arrays.equals(a1, a2);
            if (result == true) {
                System.out.println("array is equal");
            } else {
                System.out.println("array is not equal");
            }
        } else {
            System.out.println("array is not equal");
        }

    }

}
