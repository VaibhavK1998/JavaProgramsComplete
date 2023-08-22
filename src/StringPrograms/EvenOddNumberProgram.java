package StringPrograms;

import java.util.Scanner;

public class EvenOddNumberProgram {
    public static void main(String[] args) {
evenOddProgram();
    }
    public static void evenOddProgram(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scn.nextInt();
        int evenNumberCount=0;
        int oddNumberCount=0;
        int rem=0;
        while(number>0){
            rem=number%10;
            if(rem%2==0){
                evenNumberCount++;

            }else{
                oddNumberCount++;
            }
            number=number/10;
        }
        System.out.println("even number count:"+evenNumberCount);
        System.out.println("odd number count:"+oddNumberCount);
    }
}
