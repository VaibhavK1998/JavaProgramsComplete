package oopsConcepts.inheritance;


/*
inherit the property of parent class to child class it's called inheritence
 */
class Test1 {
    public void test1() {
        System.out.println("test1");
    }
}

class Test3 extends Test1 {
    public void test3() {

        System.out.println("Test3");
    }
}


class InheritenceExa1 {
    public static void main(String[] args) {
        InheritenceExa1 i = new InheritenceExa1();
        Test1 t1 = new Test1();
        t1.test1();
        Test3 t3 = new Test3();
        t3.test3();
        t3.test1();

    }


}
