package CollectionWork;

public class SingeltonImplements {
    public static void main(String[] args) {
        workWithLazyInitalization();
       // workWithEarlyInitialization();
    }

    public static void workWithLazyInitalization() {
        SingeltonDesignPatternLazyInitialization obj1 = SingeltonDesignPatternLazyInitialization.getInstance();
        SingeltonDesignPatternLazyInitialization obj2 = SingeltonDesignPatternLazyInitialization.getInstance();
        System.out.println("obj1: " + obj1.hashCode());
        System.out.println("obj2: " + obj2.hashCode());
    SingeltonDesignPatternLazyInitialization.test();
        // // here you can se it return the same object obj1 and obj2 it's same singelton class not allowed to create multiple object of same class

    }

    public static void workWithEarlyInitialization() {

        SingeltonDesignPatternEarlyInitailization obj1 = SingeltonDesignPatternEarlyInitailization.getInstance();
        SingeltonDesignPatternEarlyInitailization obj2 = SingeltonDesignPatternEarlyInitailization.getInstance();
        System.out.println("obj1: " + obj1.hashCode());
        System.out.println("obj2: " + obj2.hashCode());
    }
}
