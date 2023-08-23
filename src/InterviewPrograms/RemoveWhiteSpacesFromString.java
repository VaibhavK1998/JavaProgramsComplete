package InterviewPrograms;

public class RemoveWhiteSpacesFromString {
    public static void main(String[] args) {
        removeWhiteSpaceFromString();
    }

    public static void removeWhiteSpaceFromString() {
        String name = "Ra gr grr rg";
        String newname = name.replaceAll("\\s", "");
        System.out.println("String after remeove space: " + newname);
    }
}
