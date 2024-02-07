package streamPractise.byteStreams.inuptStreamUsage;

import java.util.Scanner;

public class UserInputUsingScannerClass {
    public static void main(String[] args) {
       // scannerClassUsage();
        scannerClassUsage2();
    }

    public static void scannerClassUsage() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a = scanner.nextInt(); // this method is used to take int type data from keyboard
        System.out.println("Enter number 2: ");
        int b = scanner.nextInt();
        int c = a = b;
        System.out.println("additon of two number is : " + c);
        System.out.println("Enter Byte number: ");
        int byteNumber = scanner.nextByte();// this method is used to take Byte type data from keyboard
        System.out.println("printRecivedByteNumberByScannerClass:  " + byteNumber);

        System.out.println("Enter Float number: ");
        float FloatNumber = scanner.nextFloat();// this method is used to take Byte type data from keyboard
        System.out.println("printRecivedFloatNumberByScannerClass:  " + FloatNumber);


    }

    public static void scannerClassUsage2() {

        System.out.println("take user input");
        Scanner scanner = new Scanner(System.in);
        boolean answer = scanner.hasNextLine();
        System.out.println("answer is: " + answer);
    }
}
