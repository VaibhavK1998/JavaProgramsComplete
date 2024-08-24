package InterviewPrograms;

public class StringBuilderClassUse {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append method - adds text to the end
        sb.append(" World");
        System.out.println(sb); // Output: "Hello World"

        // Insert method - inserts text at a specified position
        sb.insert(6, "Beautiful ");
        System.out.println(sb); // Output: "Hello Beautiful World"

        // Delete method - removes characters between specified positions
        sb.delete(6, 16);
        System.out.println(sb); // Output: "Hello World"

        // DeleteCharAt method - removes the character at a specified position
        sb.deleteCharAt(5);
        System.out.println(sb); // Output: "HelloWorld"

        // Replace method - replaces characters between specified positions with a new string
        sb.replace(5, 10, " Java");
        System.out.println(sb); // Output: "Hello Java"

        // Reverse method - reverses the sequence of characters
        sb.reverse();
        System.out.println(sb); // Output: "avaJ olleH"

        // Convert StringBuilder to String
        String result = sb.toString();
        System.out.println(result); // Output: "avaJ olleH"
    }
}
