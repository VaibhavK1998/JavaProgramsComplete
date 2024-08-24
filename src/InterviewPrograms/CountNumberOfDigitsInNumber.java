package InterviewPrograms;

public class CountNumberOfDigitsInNumber {
    public static void main(String[] args) {
        countNumberOfDigitsInNumber();
    }

    public static void countNumberOfDigitsInNumber() {
        int number = 943045;

        String numberI = String.valueOf(number);
        int count = 0;
        for (int i = 1; i <= numberI.length(); i++) {
            count++;
        }
        System.out.println(count);


//        int Countdigits=0;
//        while(number!=0){
//            number=number/10;
//            Countdigits++;
//        }
//        System.out.println("Count of digits :"+Countdigits);
//    }
    }
}
