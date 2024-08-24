package InterviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class CheckValuePresent {
    public static void main(String[] args) {


        List<String> ls1 = new ArrayList<>();
        ls1.add("pune");
        ls1.add("mumbai");
        ls1.add("amravati");

        String ar[] = {"amravati", "pune", "omni"};


        for (int a = 0; a < ar.length; a++) {
            String value = ar[a];
            if (ls1.contains(value) == true) {
                System.out.println("value present: " + value);
            } else {
                System.out.println("value not present: " + value);
            }
        }
    }
}
