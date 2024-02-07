package impMethod;

public class StaticToNonStatic {
static int x=10, y=20;
	public static void main(String[] args) {

		StaticToNonStatic obj=new StaticToNonStatic();     //here called by static and called received by non static variable/method method
        System.out.println("x= "+obj.x);                   // we taken value of non static method by using standard syntax object.class
        System.out.println("y= "+obj.y);                   //when we want non static data in static method we called it
	          obj.info();
	     obj.addition() ;                                 // by using syntax= object.className(); (its a only one way or syntax for it)
                               
	}
	
 public void info() {
  System.out.println("student of software testing");    
             
 }
 
   public void addition() {
	StaticToNonStatic obj=new StaticToNonStatic();
     int x=10, y=20;
      int z=x+y;
    System.out.println("z= "+z);
     }
    

}