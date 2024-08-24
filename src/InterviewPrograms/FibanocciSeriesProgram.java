package InterviewPrograms;

public class FibanocciSeriesProgram {
    public static void main(String[] args) {
        fibnacciSeriesProgram();
    }

    public static void fibnacciSeriesProgram() {
        /*
        fibanocci series is a sereis in which each number is a sum of two preceding number
         */

        int n1 = 0, n2 = 1, sum = 0;
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < 8; i++) { // here we use i=2 because 0 and 1 we use for n1 and n2 already here i value will directly use for to create fibanoccis series
            sum = n1 + n2;// we use 6 beacause i need fibanocci series till 6 number
            System.out.print(" " + sum);
            n1 = n2;
            n2 = sum;

        }

    }

    public static void fibanacciAttempt2(){
        int first=0;
        int second=1;

        for(int a=2;a<5;a++){
            int third=first+second;
            System.out.println();
        }

    }


}
