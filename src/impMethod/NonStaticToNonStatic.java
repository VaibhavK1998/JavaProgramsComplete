package impMethod;


public class NonStaticToNonStatic {
int  a=10, b=50;
 String name="rajesh";

	public static void main(String[] args) {
		System.out.println("program of to call NonStaticToNonStatic");
		NonStaticToNonStatic obj=new NonStaticToNonStatic();
		obj.test2();
		
	
	
        
	}
 public void test1() {
	 System.out.println("we called nonstatic to non static by using diffrent ways");
                                                                     
	  NonStaticToNonStatic obj=new NonStaticToNonStatic();
	  
       obj.test2();                                        //way1:- to called non static to non static by using syntax=objectName.method/variable();   
  // obj.test2(); this method is not recommended                                                                 
        test2();                                          //way2:- to called non static to non static by using  syntax=methodName.();
                                                                  
    this.test2();                                       //way3:- to called non static to non static by using object  syntax= this.methodName(); its a statndard
    System.out.println("a="+this.a);                  // (this. is use to call non static global variable and non static method)
    System.out.println("b="+this.b);
 }
public void test2() {
System.out.println(" best of luck");
System.out.println(" best wishesh");
System.out.println("a="+a);                 // way 4 nonstatic global data can we used directly also
System.out.println("b="+b);
    System.out.println("name :"+name);
    }
//
}