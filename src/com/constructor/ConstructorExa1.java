package com.constructor;

/*
-Constructor is use to create memory of a class and loads the non-static data of class inside that memory
-All classes contains constructor
- By default constructor is hidden in all classes and it is known as default constructor

// this is the chaining of constructor
to call constructor in same class we use this() method with required parameter
make sure that the this() should be first line of the constructor if you performing chaining of constructor
 */


public class ConstructorExa1 {

    public ConstructorExa1() {
        System.out.println("i am default constructor");
    }


    public ConstructorExa1(double experience) {
        this();
        System.out.println("-----------------------------------------------------------");
        double Experience = experience;
        System.out.println("my Experience : " + experience);
    }

    public ConstructorExa1(int salary, String designation) {
        this(3.2);
        System.out.println("-----------------------------------------------------------");
        int Salary = salary;
        String Designation = designation;

        System.out.println("my salary : " + Salary);
        System.out.println("my Designation : " + Designation);
    }

    public ConstructorExa1(int age, String name, char bloodgroup) {
        this(50000, "SDET");
        System.out.println("-----------------------------------------------------------");

        int Age = age;
        String Name = name;
        char Bloodgroup = bloodgroup;

        System.out.println("my Age : " + Age);
        System.out.println("my Name : " + Name);
        System.out.println("my Bloodgroup : " + bloodgroup);
    }

    public static void main(String[] args) {
        ConstructorExa1 con = new ConstructorExa1(23, "akash", 'B');


    }

}
