package impMethodSet2; //day 19 lecture

public class ParameterExa1 {
    public int addition(int a, int b) {
        //int a=50, b=70;
        int sum = a + b;
        return sum;


    }

    public int subtraction(int a, int b) {     //variable datatypes an parameters data type should be same
        int sub = a - b;
        return sub;

    }

    public static void main(String[] args) {
        ParameterExa1 obj = new ParameterExa1();
        int sum = obj.addition(10, 20); // we sending parameters from this rather than to write in method
        System.out.println("sum= " + sum);

        int sub = obj.subtraction(90, 40);
        System.out.println("sub= " + sub);

        byte addi = obj.additionOfByte((byte) 50, (byte) 70);
        System.out.println("add= " + addi);
    }


    public byte additionOfByte(byte a, byte b) {
        byte sum = (byte) (a + b);
        return sum;


    }
}