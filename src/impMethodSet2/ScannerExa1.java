package impMethodSet2;

import java.util.Scanner;// we import this because this file is in another package

public class ScannerExa1 {
	
	

	public static void main(String[] args) {

	Scanner obj=new Scanner(System.in);// its a syntax of scanner object
	System.out.println("Enter int a:");
   int a=obj.nextInt();// you can take any data type ex for float you write obj.nextfloat();
   
   System.out.println("Enter int b:");
   int b=obj.nextInt();
	
   int sum=a+b;
   System.out.println("sum= "+sum);
	//}

		System.out.println("name");
		String name= obj.nextLine();

   Scan();	
}
public static void Scan()	{
	Scanner obj=new Scanner(System.in);
	System.out.println(" Enter double c=");
	double c=obj.nextDouble();
	System.out.println(" Enter double d=");
	double d=obj.nextDouble();
	
	
	double sum=c+d;
	System.out.println(" sum= "+sum);
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}