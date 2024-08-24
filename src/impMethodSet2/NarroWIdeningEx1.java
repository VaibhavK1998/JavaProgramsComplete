package impMethodSet2;   // day 18 lecture topic

public class NarroWIdeningEx1 {

    public static void main(String[] args) {

        int a1 = 100;
        byte b1 = (byte) a1; //explicit narrowing (because convert integer a1 to byte a1 by writing (byte)a1;
        System.out.println("b1=" + b1);
        System.out.println("a1=" + a1);

        double d1 = 89.99;
        short s1 = (short) d1;  // explicit narrowing
        System.out.println("d1=" + d1);
        System.out.println("s1=" + s1);//(data loss happen because decimal digit not store in short)

        //double d2=88.00; // and we dont need to write  d after 88.00 we only need if data value cross integer range)
        double d2 = 88;// (we can write 88 in the place of 88.00 this is called implicit widening because int 88 is covert into double 88.00 implicit )
        //(implicit widening)  we dont need to covert explicitly if you write any integer number. in double & float by default it consider it double & float it assume that .00 after the no
        // ( we can store without decimal number in  double & float)
        short s2 = (short) d2; // explicit narrowing
        System.out.println("d2=" + d2);
        System.out.println("s2=" + s2);


    }

}
