package impMethod;

public class MultipleCopiesOfObject {
    int x=100, y=300;   //value is non-static an its a global variable
    int sum=x+y;
	public static void main(String[] args) {

    MultipleCopiesOfObject obj1 = new MultipleCopiesOfObject()	;//when we call the value of non-static using object the value is store here x=50 and y=20
    MultipleCopiesOfObject obj2 = new MultipleCopiesOfObject()	;//when we call the value of non-static using object the value is store here x=50 and y=20
	MultipleCopiesOfObject obj3 = new MultipleCopiesOfObject()	;//when we call the value of non-static using object the value is store here x=50 and y=20
//3 copies of same data is formed by using object that why its called multicopies
    System.out.println("x= "+obj1.x);
    System.out.println("y= "+obj1.y);
    System.out.println("x="+obj2.x);
   	System.out.println("y="+obj2.y);
    System.out.println("x="+obj3.x);
   	System.out.println("y="+obj3.y);
   // here we can see that all value of obj1,obj2,obj3 is same i.e multiple copies happened of same data    
   // because each object create its separate memory
   	       obj1.x=200;
	       obj1.y=300;
	System.out.println("x= "+obj1.x);//here we can see that the value of obj1 x and y change 
	System.out.println("y= "+obj1.y);
	System.out.println("x= "+obj2.x);//not change value here because obj 2 its a separate memory
	System.out.println("y= "+obj2.y);
	System.out.println("x= "+obj3.x);
	System.out.println("y= "+obj3.y);
    System.out.println("sum="+obj1.sum);
    System.out.println("sum="+obj2.sum);
	// here we can see that only value of obj1 updated and not other object because its store in separate object obj1
    
    
    //
    //
	}

}
