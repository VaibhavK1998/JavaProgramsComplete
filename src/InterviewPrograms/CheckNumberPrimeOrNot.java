package InterviewPrograms;

import java.awt.*;
import java.util.Scanner;

public class CheckNumberPrimeOrNot {
    public static void main(String[] args) {
        //numberPrimeOrNot();
        //numberCheck();
        reminder();
    }

    public static void numberPrimeOrNot() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number = scn.nextInt();
        int count = 0;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    count++;
                }
                if(count==2){
                    System.out.println("number is prime number : ");
                }else{
                    System.out.println("number is not a prime number"+count);
                }

        }else{
            System.out.println("not a prime number");
        }

    }

    public static void numberCheck(){
        int num=16;
        if(num%1==0&&num%num==1){
            System.out.println("number is prim");
        }else{
            System.out.println("number is prim");
        }
    }

    public static void reminder(){
        System.out.println(10101%10);
    }
}
