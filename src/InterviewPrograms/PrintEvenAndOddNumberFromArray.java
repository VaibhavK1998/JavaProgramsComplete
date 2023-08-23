package InterviewPrograms;

import java.util.ArrayList;

public class PrintEvenAndOddNumberFromArray {
    public static void main(String[] args) {
        //printEvenOddNumberWay1();
        printEvenOddNumberWay2();
    }

    public static void printEvenOddNumberWay1() {
        ArrayList<Integer> evenNumber = new ArrayList<Integer>();
        ArrayList<Integer> oddNumber = new ArrayList<Integer>();

        int ar[] = {10, 11, 29, 18, 20, 50, 40};

        for (int number : ar) {
            if (number % 2 == 0) {
                evenNumber.add(number);
            } else {
                oddNumber.add(number);
            }
        }
        System.out.println("even number : " + evenNumber);
        System.out.println("odd number : " + oddNumber);
    }
    public static void printEvenOddNumberWay2(){
        int ar[] = {10, 11, 29, 18, 20, 50, 40};

        for (int number : ar) {
            if (number % 2 == 0) {
                System.out.println("even number : " + number);
            } else {
                System.out.println("odd number : " + number);
            }
        }
    }
}
