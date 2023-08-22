package StringPrograms;

public class CountNumberOfDigitsInNumber {
    public static void main(String[] args) {
        countNumberOfDigitsInNumber();
    }
    public static void countNumberOfDigitsInNumber(){
        int number=943045;
        int Countdigits=0;
        while(number!=0){
            number=number/10;
            Countdigits++;
        }
        System.out.println("Count of digits :"+Countdigits);
    }
}
