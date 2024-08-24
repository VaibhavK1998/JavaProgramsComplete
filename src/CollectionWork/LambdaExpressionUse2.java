package CollectionWork;

import javax.swing.*;
import java.util.Comparator;
import java.util.stream.Stream;

interface Calculation {
    abstract int sum(int a, int b);
}

interface LenghtCalculation {
    abstract int lenth(String value);
}

public class LambdaExpressionUse2 {
    public static void main(String[] args) {

        /*
        Calculation cal = (int a, int b) -> {
            return a + b;
        };
         */
        // implementation of interface 1
        Calculation cal = (a, b) -> a + b; // above code we can write in single line also.
        // note here in bracket automaticall fetch the data type of this argument from the method which present in interface
        int c = cal.sum(50, 90);
        System.out.println("addition of two variables : " + c);

        // implementation of interface 2
        LenghtCalculation lenghtCalculation = (value) -> value.length();
        int StringLength = lenghtCalculation.lenth("rajeshwar");
        System.out.println("lenghth of the string is: " + StringLength);
    }
}
