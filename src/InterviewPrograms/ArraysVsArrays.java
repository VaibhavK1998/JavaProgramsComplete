package InterviewPrograms;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArraysVsArrays {
    public static void main(String[] args) {
        //arrayUse();
        // arraysClassUse();
        arrayWithNonPrimitive();
    }

    public static void arrayUse() {
        int a[] = {20, 20, 303};

        Array.set(a, 0, 3);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println(Array.get(a, 1));

    }

    public static void arrayWithNonPrimitive() {

        // Create an array of Object
        Object[] mixedArray = new Object[5];

        // Store different types of data
        mixedArray[0] = "Hello";    // String
        mixedArray[1] = 123;        // Integer (autoboxed)
        mixedArray[2] = 45.67;      // Double (autoboxed)
        mixedArray[3] = true;       // Boolean (autoboxed)

        // Access and use the data
        for (Object obj : mixedArray) {
            if (obj instanceof String) {
                System.out.println("String: " + (String) obj);
            } else if (obj instanceof Integer) {
                System.out.println("Integer: " + (Integer) obj);
            } else if (obj instanceof Double) {
                System.out.println("Double: " + (Double) obj);
            } else if (obj instanceof Boolean) {
                System.out.println("Boolean: " + (Boolean) obj);
            }
        }
    }


    public static void arraysClassUse() {
        /*
        Summary
Sorting: Use Arrays.sort() to sort arrays.
Searching: Use Arrays.binarySearch() to search sorted arrays.
Filling: Use Arrays.fill() to fill arrays with values.
Comparing: Use Arrays.equals() to compare arrays for equality.
Copying: Use Arrays.copyOf() to copy arrays.
Converting: Use Arrays.asList() to convert arrays to lists.
The Arrays class provides a set of convenient static methods to perform common array operations efficiently and effectively,
 making it a valuable utility class for array manipulations in Java.
         */

        // Example array
        int[] intArray = {5, 3, 8, 1};

        // Sorting the array
        Arrays.sort(intArray);
        System.out.println("Sorted array: " + Arrays.toString(intArray));

        // Searching in the array
        int index = Arrays.binarySearch(intArray, 10);
        System.out.println("Index of 3: " + index);

        // Filling the array
        Arrays.fill(intArray, 10);
        System.out.println("Filled array: " + Arrays.toString(intArray));

        // Comparing arrays
        int[] anotherArray = {10, 10, 10, 10};
        boolean areEqual = Arrays.equals(intArray, anotherArray);
        System.out.println("Arrays equal: " + areEqual);

        // Copying arrays
        int[] copiedArray = Arrays.copyOf(intArray, 6);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // Converting array to list
        String[] strArray = {"a", "b", "c"};
        List<String> list = Arrays.asList(strArray);
        System.out.println("List: " + list);
    }

}
