package InterviewPrograms;

import java.util.HashSet;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {
        //findDuplicateElementsWay1();
        findDuplicateElementsWay2();
    }


    public static void findDuplicateElementsWay1() {
        boolean flag = false;
        String ar[] = {"Raj", "taran", "Mahesh", "Raj", "Mahesh"};
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    System.out.println("Duplicate value:" + ar[i]);
                    flag = true;
                }
            }

            if (flag == false) {
                System.out.println("Duplicate value not found");
            }
        }
    }

    public static void findDuplicateElementsWay2() {
        // using HashSet
        String ar[] = {"Raj", "taran", "Mahesh", "Raj", "Mahesh"};
        HashSet<String> hs = new HashSet<>();
        boolean status;
        boolean flag = false;
        for (String value : ar) {
            status = hs.add(value);
            if (status == false) {
                System.out.println("Duplicate value:" + value);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Duplicate not found");
        }
    }


}
