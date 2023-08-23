package InterviewPrograms;

import java.util.Scanner;

public class PalindromNumberProgram {
    public static void main(String[] args) {
        palindromNumberCheckWay1();
    }
    public static void palindromNumberCheckWay1(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scn.nextInt(); // 8979
        int originalNumer=number;
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10; // moduler operator return last digit of number means reminder which is the single digit position
            number = number / 10; // here we eliminate the last number of number to proceed loop with new number

        }
        System.out.println("Reverse number :" + rev);

        if (rev==originalNumer){
            System.out.println("number is palindrom");
        }else{
            System.out.println("number is not palindrom");
        }
    }
}
