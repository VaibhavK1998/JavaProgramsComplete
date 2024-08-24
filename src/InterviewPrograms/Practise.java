package InterviewPrograms;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Practise {
    public static void main(String[] args) {
        binarySearch();
    }

    public static void binarySearch() {

        int a[] = {10, 23, 56, 67, 70, 90, 95};
        int low = 0;
        int high = a.length - 1; //5
        int search = 56;

        while (low <= high) {
            int mid = (low + high) / 2;//0+6/2=3 0+5/2=2
            if (a[mid] == search) {
                System.out.println("found");
                break;
            } else if (a[mid] < search) {
                low = mid + 1;
            } else if (a[mid] > search) {
                high = mid - 1;
            }
        }
    }
}
