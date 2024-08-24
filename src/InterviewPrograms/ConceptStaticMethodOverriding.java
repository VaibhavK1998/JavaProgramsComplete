package InterviewPrograms;

public class ConceptStaticMethodOverriding {
    public static void main(String[] args) {
        B.test1();
    }
}

class A {
    public static void test1() {
        System.out.println("test1 A");
    }
}

class B extends A {
    public static void test1() {
        System.out.println("test1 B");
    }
}