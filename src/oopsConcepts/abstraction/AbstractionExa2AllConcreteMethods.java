package oopsConcepts.abstraction;

/*
Abstraction means hiding of implementation
we have two ways to achive abstractions
1.Abstract class
2.interface
 */



/*if any class inherit the abstract class then all properties of abstract class come here.
  when the methods of abstract class have a body and when it inherit we don't need to implement those methods we
  can directly create a child class object and get the data from child class
*/
abstract class School{

   public void lectures(){
        System.out.println("lecture running at  100% frequency");
    }
    public void fees(){
        System.out.println("50 % fees collect from student");
    }
}


class Students extends School {
// when

}
 public class AbstractionExa2AllConcreteMethods {


     public static void main(String[] args) {

      Students students=new Students();
      students.lectures();
      students.fees();
     }




}



