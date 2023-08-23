package InterviewPrograms;

public class FactorialOfNumber {
    public static void main(String[] args) {
        factorialOfNumber();
    }

    public static void factorialOfNumber() {
        int number = 5;
        long factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
