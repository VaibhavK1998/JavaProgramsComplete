package CollectionWork;

public class SingeltonDesignPatternEarlyInitailization {

    //Early Instantiation: creation of instance at load time.// it creates object of the class when class load it doesn't matter whether you will use or not in [roject but it will create object at class loading time.
    private static SingeltonDesignPatternEarlyInitailization singeltonDesignPatternEarlyInitailization=new SingeltonDesignPatternEarlyInitailization();
    private SingeltonDesignPatternEarlyInitailization(){

    }
    public static SingeltonDesignPatternEarlyInitailization getInstance(){
        return singeltonDesignPatternEarlyInitailization;
    }

}
