package InterviewPrograms;

import java.util.Scanner;

public class ReverseNumberInJava {
    public static void main(String[] args) {
        //reverseNumberMethod1();
        reverseNumberMethod2();
    }

    public static void reverseNumberMethod1() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scn.nextInt(); // 8979
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10; // moduler operator return last digit of number means reminder which is the single digit position
            number = number / 10; // here we eliminate the last number of number to proceed loop with new number

        }
        System.out.println("Reverse number :" + rev);
    }

    public static void reverseNumberMethod2() {

        int number=343050;
       String rev= String.valueOf(number);
       StringBuffer sb=new StringBuffer(rev);
       System.out.println("reverse string :"+sb.reverse());
    }
}