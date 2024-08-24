package InterviewPrograms;

import java.util.Arrays;

public class CountWordInString {
    public static void main(String[] args) {
        // countWordInString();
        countCheck();
    }

    public static void countWordInString() {
        String name = "Welcome to india";
        int count = 1;
        for (int i = 0; i < name.length() - 1; i++) {
            if (name.charAt(i) == ' ' && name.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }

    public static void countCheck() {
        String name = "Welcome to india";
        int wordCount = 0;
        String ar[] = name.split(" ");
        for (int i = 0; i <= ar.length; i++) {
            wordCount++;
        }
        System.out.println(wordCount);
    }
}
