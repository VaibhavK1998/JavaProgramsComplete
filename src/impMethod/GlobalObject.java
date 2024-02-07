package impMethod;

public class GlobalObject {
 static int  a=10,b=50; //(non static global variable)
 
 
 
 
 public static void test1() {
	 System.out.println(" import value from other class and change here");
	 GlobalObject.obj2.addition();;//here we import method from other class (staticToStatic) class
	 System.out.println("x= "+StaticToStatic.x);
	 }

static GlobalObject obj1=new GlobalObject();     // (global static object) global object its accessible for all method
static StaticToStatic obj2=new StaticToStatic();// we can import other class also and its function,method and value also
	// we creating global object to avoid create multiple object in diifrent method and to eliminate crating of different memory store here
      

      public static void main(String[] args) {
		System.out.println("program of called method by using global object");

       test2();
     	}

     public static void test2() {
       System.out.println("a= "+GlobalObject. obj1.a);// by using class name to called
       System.out.println("a= "+obj1.a);  // by using object name we called here
     GlobalObject.test3();
  
     }

         public static void test3() {
    	
    	 System.out.println("b= "+GlobalObject. obj1.b);// by using class name to called
         System.out.println("b= "+obj1.b);  // by
    	obj1.addition();    // here we see we don't want create new object here because we create global object
    }

    public void addition() {
   int c=a+b;
    System.out.println("c= "+c);

    GlobalObject.test4(); 
    
}
  public static void test4() {
   System.out.println("program running"); 
  test1();
  }   
 
  
  
}