package oopsConcepts.abstraction;

/*
Abstraction means hiding of implementation
we have two ways to achive abstractions
1.Abstract class
2.interface
 */


abstract class Vehicle {

    abstract public void start();                  // the method which don't have body that method called abstract method.

    abstract public void close();
}

/*
 if any class inherit the abstract class then all properties of abstract class come here.
 and the inherited class become abstract. to overcome those we need to implement those unimplemented method here

    note:- we can't create object of abstract class
 */
class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("start the car");
    }

    @Override
    public void close() {
        System.out.println("close the car");
    }
}

public class AbstractionExa1AllNonConcreteMethods {


    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.close();

    }


}



