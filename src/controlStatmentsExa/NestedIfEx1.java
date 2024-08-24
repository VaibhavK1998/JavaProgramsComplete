package controlStatmentsExa;

public class NestedIfEx1 {

    public static void main(String[] args) {
        int score = 50; // if first condition pass then it goes on second otherwise it will exit both condition and print out of loop statement
        if (score > 35) {
            System.out.println("average");
            if (score < 60) {   // inner if block condition executes only when outer if block condition is true
                System.out.println("max");

            }

        }
        Condition2();
    }


    public static void Condition2() {
        int m = 90;
        if (m < 80) {
            System.out.println("condition failed");
            if (m > 80) {
                System.out.println("condition pass");// here we can see first condition fail it not showing second condition even is pass we want fiest condition pass
            }
        }
    }
}















