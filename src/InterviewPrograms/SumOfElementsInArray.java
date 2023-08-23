package InterviewPrograms;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        sumOfElementsInArray();
    }
    public static void sumOfElementsInArray(){

        int ar []={10,20,30,40,50,60};
        int sum=0;
        for(int i=0;i<=ar.length-1;i++){
            sum=sum+ar[i];
        }
        System.out.println("Sum of array elements: "+sum);
    }
}
