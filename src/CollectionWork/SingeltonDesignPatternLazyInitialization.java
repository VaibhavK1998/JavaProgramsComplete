package CollectionWork;

public class SingeltonDesignPatternLazyInitialization {

    private static SingeltonDesignPatternLazyInitialization singeltonDesignPatternLazyInitialization;// second rule make object of class static and private so that it shoul access in public static method

    private SingeltonDesignPatternLazyInitialization() {  // rule 1: make constructor private of singelton class

    }

    // it's a lazy way to create singelton object here Lazy Instantiation: creation of instance when required.
    public static SingeltonDesignPatternLazyInitialization getInstance() {// rule three make a method who returns the object of a class

        if (singeltonDesignPatternLazyInitialization == null) {
            singeltonDesignPatternLazyInitialization = new SingeltonDesignPatternLazyInitialization();
        }
        return singeltonDesignPatternLazyInitialization;
    }

}
