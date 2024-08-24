package impMethodSet2; //day 18 lecture topic

public class NarrowingWideningExa2 {

    public static void main(String[] args) {
        byte b1 = 50;
        long k1 = b1; // implicit widening
        long k2 = (long) b1;//explicit widening
        System.out.println("b1=" + b1);
        System.out.println("k1=" + k1);
        System.out.println("k2=" + k2);

        byte x = 10, y = 50;
        //byte sum=x+y; ( java by default consider result value in integer so thats why it showing error for conver int to byte we write byte sum=(byte)(x+y);
        byte sum = (byte) (x + y);
        System.out.println("sum=" + sum);

        //double p=98676737878; if value is out of the range of integer then it showing error for that you need to write d for declaring its a double data type value
        double p = 98676737878d;
        int s = (int) p;
        System.out.println("p=" + p); // it showing result in exponential if the value going out of the integer range
        System.out.println("s=" + s); // data loss happen because it is out of the range of integer

        int c1 = 150;
        byte e1 = (byte) c1;
        System.out.println("e1=" + e1); // result show -106 beacuse byte 150 is out of the byte range whenever 150 number not count byte scale cycle run


    }

}
