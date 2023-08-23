package InterviewPrograms;

public class RemoveSpecialCharacterFromString {
    public static void main(String[] args) {
removespecialCharacter();
    }
    public static void removespecialCharacter(){
        String name="Rajan@#*234";
        String newName=name.replaceAll("[^a-zA-Z0-9]","");// [^a-zA-Z0-9] this regress function replace all other value except mention regrex expression with empty
        System.out.println(newName);
    }
}
