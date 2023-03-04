package impMethod;


public class StaticToStatic {
 static int x=20, y=70;
 static int m=99;

 public static void multi() {
	int a=20,b=50;
	int mul=a*b; 
	System.out.println("mul= "+mul); 
 }
	 
	     public static void main(String[] args) {
         System.out.println("we uses the diifrent static to static call method");
        // StaticToStatic obj2=new StaticToStatic();
       	System.out.println("x="+x);
	    System.out.println("y="+y);
   
	//here we calling static method data by another static method
	
  System.out.println("first way to call static to static by using object");//its not recommended its showing warning
  //obj.addition();//here we called static method addition by using syntax= obj.method name(); ( its  1st way to call static method/data)
 
  System.out.println("second way to call by using method name();");
  addition(); //here we called static method addition by using syntax= method name(); ( its first way to call static method/data)
	
  System.out.println("third method to call static to static by using className ");
   StaticToStatic.multi();//its standard method to call static to static syntax=className.method name();
  

	}
         public static void addition() {
       int x=40;
       System.out.println("x= "+x);
        carrer();
    }
 
 
 public static void carrer() { 
 System.out.println(" to become a succesfull software tester");
     System.out.println("M :"+m);
     }


 


 
 
  }