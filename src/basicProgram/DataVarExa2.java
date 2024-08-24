package basicProgram;

public class DataVarExa2 {

    int a = 10;

    public static void main(String[] args) {
        //addition of int+float datatype
        int a = 40;
        int b = 30;

        System.out.println("ab" + " " + (a + b));

        float k = 11.56f;//float data type range is lies in between +-3.40282347
        float c = a + k;
        System.out.println("c= " + c);

        short p = 332;  //short data type range is lies in between -32768 to 32767
        int m = 212;
        int g = p + m;
        System.out.println("g= " + g);
        //addtion of two no. by using long+long and long+double datatype
        long w = 257485789;//long boundary range is lies between +-9223372036854775
        long q = 253684894;
        double s = 1111.75;// double char range lies +-1.79769313486231570
        long x = w + q;
        double h = q + s;
        System.out.println("x= " + x);
        System.out.println("h= " + h);


        DataVarExa2 bv = new DataVarExa2();
        bv.test1();

    }

    public void test1() {
        System.out.println("a value in test 1:" + a);
    }

}
