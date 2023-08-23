package InterviewPrograms;

import java.util.Scanner;

public class CheckNumberPrimeOrNot {
    public static void main(String[] args) {
        numberPrimeOrNot();
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
}
