package InterviewPrograms;

import java.util.Arrays;

public class SortingElementBubbleSort {
    public static void main(String[] args) {
        bubbleSort();
    }

    public static void bubbleSort() {
        int ar[] = {10, 5, 9, 12, 30, 90};
        System.out.println("before sorting: " + Arrays.toString(ar));
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;

                }
            }
        }
        System.out.println("Arrays after sorting: " + Arrays.toString(ar));
    }
}


