package InterviewPrograms;

public class BinarySearchElement {
    public static void main(String[] args) {
        binarySearchElement();
    }

    public static void binarySearchElement() {
        /*
        prerquisites of binary search is array should be in sorted order
         */
        int ar[] = {10, 20, 30, 40, 50, 60, 70};
        int keySearch = 50;
        int low = 0;//4
        int high = ar.length - 1; //6
        boolean flag = false;
        while (low <= high) {
            int mid = (low + high)/2; //3,5
            if (ar[mid] == keySearch) {
                System.out.println("element found");
                flag = true;
                break;
            }
            if (ar[mid] < keySearch) {
                low = mid + 1;//4
            }
            if (ar[mid] > keySearch) {
                high = mid - 1;// 4

            }

        }
        if (flag == false) {
            System.out.println("element not found");
        }

    }
}
