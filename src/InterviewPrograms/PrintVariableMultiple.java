package InterviewPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintVariableMultiple {
    public static void main(String[] args) {
        //test();
        //test2();
        test3();
        //test5();
    }

    public static void test() {
        StringBuffer sb = new StringBuffer();
        String name = "a1b10";
        System.out.println("inside test method");
        for (int a = 0; a < name.length(); a++) {
            if (a == 5) {
                break;
            }
            char received = name.charAt(a);
            char mul = name.charAt(a + 1);
            if ((int) mul >= 48 && (int) mul <= 58) {
                int count = Character.getNumericValue(mul);
                for (int b = 0; b <= count; b++) {
                    sb.append(b);
                }
            }
        }
        System.out.println(sb);
    }

    public static void test2() {
        StringBuffer name = new StringBuffer("a111b10");
        name.append(1);
        System.out.println(name);
        StringBuffer sb = new StringBuffer();
        LinkedHashMap<Character, Integer> h1 = new LinkedHashMap<>();
        for (int a = 0; a < name.length(); a += 2) {
            h1.put(name.charAt(a), Character.getNumericValue(name.charAt(a + 1)));

        }
        System.out.println(h1);

        Set<Character> c1 = h1.keySet();
        for (Character cv : c1) {
            int calc = h1.get(cv);
            for (int i = 0; i <= calc; i++) {
                sb.append(cv);
            }
        }
        System.out.println(sb);
    }

    public static void test3() {
        StringBuffer sb = new StringBuffer();
        String input = "abc&10bc3";
        // Define a regex pattern to match characters followed by digits
        Pattern pattern = Pattern.compile("([a-zA-Z\\W]+)(\\d+)");
        Matcher matcher = pattern.matcher(input);

        // Iterate over all matches
        while (matcher.find()) {
            String character = matcher.group(1); // The letter (a, b, c, etc.)
            String number = matcher.group(2); // The associated number
            System.out.println(character + "=" + number);
            for (int i = 0; i <= Integer.valueOf(number); i++) {
                sb.append(character);
            }
        }
        System.out.println(sb);
    }

    public static void test4() {
        String input = "a122b2c*&9";

        // Define a regex pattern to match a character (or character followed by a special character) followed by digits
        Pattern pattern = Pattern.compile("([a-zA-Z][^\\d]?)(\\d+)");
        Matcher matcher = pattern.matcher(input);

        // Iterate over all matches
        while (matcher.find()) {
            String character = matcher.group(1); // The letter or letter followed by a special character
            String number = matcher.group(2); // The associated number

            System.out.println(character + "=" + number);
        }
    }

    public static void test5() {
        StringBuffer sb = new StringBuffer();
        String name = "ab1baj9js";
        String[] names = name.split("[0-9]");
        for (int a = 0; a < name.length(); a++) {
            if (name.charAt(a) > 48 & name.charAt(a) < 57) {
                for (String na : names) {
                    for (int b = 0; b <= Character.getNumericValue(name.charAt(a)); b++) {
                        sb.append(na);
                    }
                }
            }
        }

    }
}




