package StringPrograms;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
sumOfDigits();
    }

    public static void sumOfDigits() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scn.nextInt();
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}