package InterviewPrograms;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {

        String key = "vaibhav&*3%/";
        String key2 = "";
        for (int a = 0; a < key.length(); a++) {
            char c = key.charAt(a);
            System.out.println("character retrive: " + c);
            int as = (int) c;
            if (as >= 65 && as <= 90 && as >= 48 && as <= 57 && as >= 97 && as <= 122) {
                key2 = key2 + c;
            } else {
                System.out.println("not needed character");
            }

        }
        System.out.println(key2);
    }
}
