package InterviewPrograms;

public class SwapTwoNumber {
    public static void main(String[] args) {
//swapTwoNumberUsingThirdVariable();
      //  swapTwoNumberWithoutUsingThirdVariable();
        swapTwoNumberThirdWay();
    }

    public static void swapTwoNumberUsingThirdVariable() {
        int a = 20;
        int b = 50;
        int c = a;
        a = b;
        b = c;

        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }

    public static void swapTwoNumberWithoutUsingThirdVariable() {
        int a = 50;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }

    public static void swapTwoNumberThirdWay() {
        int a = 50;
        int b = 20;

        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }

}
