package basicProgram;

public class DataVarExa1 {

    public static void main(String[] args) {
        //int a=10;
        //int b=20;
        int a = 10, b = 50;
		/*range of int -2147483648 to 2147483647 so you can take value between this range
		when two values is same data type u can write on same line by using
		, sign here a & b are same datatype integer so thats why we write like this
	int c =a+b;
	 here upper line u can write value 10 & 50 in place of a& b because these 10&50 these value
	is assigning to a& b  so we can write int c=10+50; and output is same as before
	System.out.println("c=  " + c);
	when both data types are different + sign work as separator here
	"c" is a string and next c is a integer i.e why here +sign work as
	separator */

        // here i am right example to doing addition of two bytes
        byte v = 16;
        byte p = 15;
     /* byte his boundary range is -128to127 so you take value more than this
        here we doing addition of two byte
        byte g= v+p; when we go to add two byte it show error(because we use opertor +sign is the answer
        of the addition is always output int
        we can do this in two way
        int z = v + p;
        System.out.println("z :" + z);
        byte g = (byte) (v + p);// it is the right syntax for add pf two bytes number then it not shows error
        System.out.println("g :" + g);
*/
        int z = v + p;
        System.out.println("z :" + z);
    }

}
