package InterviewPrograms;

import java.util.Random;

public class GenrerateRandomNumberAndString {
    public static void main(String[] args) {
        generateRandomNumber();
       // generateRandomNumberByMathClass();
    }

    public static void generateRandomNumber() {
        Random ran = new Random();
        int RanNumber = ran.nextInt(100);
        System.out.println(RanNumber);
    }

    public static void generateRandomNumberByMathClass() {
        double number = Math.random();
        System.out.println("Random number by math class: " + number);
    }

    public static void generateRandomString() {
        Random ran = new Random();
        System.out.println("RanNumber");
    }
}
