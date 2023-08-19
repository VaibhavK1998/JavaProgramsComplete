package oopsConcepts.abstraction;


interface InterfaceExa1 {
        /*
        all methods in interface are abstract methods
        all fileds in interface are public static final
        all methods in interface are public abstract by default
        above java 8 verison methods have a body but method access modifier should be default/private/static
        note:- if you not write any access specifier with method by defalut it consider it as a public
         */


    public static final int age = 50; // All variables in interface are public static final if you not write anything by default it consider as mention
    public static final int marks = 100;

    void test4();

    public void test1();  // public method allowed in interface

    public abstract void test2(); // right syntax

    void test3();

    //   protected void test4(); protected method not allowed in interface
    //  default void test5(); default method not allowed in interface
    private void test6() // private method allowed in interface but its should have a body and its allowed above java 9 version
    {
        System.out.println("test 6 private method of interface");
    }

    static void test7() {         // static method allowed but it should have interface
        System.out.println("test 7 static method of interface");
    }

    default void test8() {
        System.out.println("test 8 default access modifier with method");
    }
}

interface InterfaceExa2 {
    void test8();
}

class importer implements InterfaceExa1 {


    @Override
    public void test4() {
        System.out.println("test 4 implemented method");
    }


    @Override
    public void test1() {
        System.out.println("test 1 implemented method");
    }

    // @Override
//    public void test8() {
//        InterfaceExa1.super.test8();
//        System.out.println("test 8 implemanted and ovverride method");
//    }

    @Override
    public void test2() {
        System.out.println("test 2 implemented method");
    }

    @Override
    public void test3() {
        System.out.println("test 3 implemanted method");
    }

    @Override
    public void test8() {
        InterfaceExa1.super.test8();
    }
}


public class TestInterface {

    public static void main(String[] args) {

        importer b = new importer();
        b.test4();
        b.test3();
        System.out.println("age : " + importer.age); // access the fields from interface
        System.out.println("marks : " + b.marks);// access the fields from interface

    }
}