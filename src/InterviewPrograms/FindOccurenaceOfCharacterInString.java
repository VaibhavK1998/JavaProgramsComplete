package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindOccurenaceOfCharacterInString {
    public static void main(String[] args) {
        //findOccurenceOfCharacter();
        findOccurenceOfCharacterWay2();
    }

    public static void findOccurenceOfCharacterWay1() {
        String name = "Ranshrnrt";
        int mainLength = name.length();
        String newname = name.replaceAll("r", "");
        int secondLength = newname.length();
        int count = mainLength - secondLength;
        System.out.println("count: " + count);
    }

    public static void findOccurenceOfCharacterWay2() {
        String name = "Ranshrnrt";
        Map<Character, Integer> m1 = new HashMap<>();
        char ar[] = name.toCharArray();
        for (char val : ar) {
            if (m1.containsKey(val)) {
                m1.put(val, m1.get(val) + 1);
            } else {
                m1.put(val, 1);
            }
        }
        System.out.println(name + " " + m1);
    }
}
