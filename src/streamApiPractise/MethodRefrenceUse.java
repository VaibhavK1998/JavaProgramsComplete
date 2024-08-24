package streamApiPractise;

import java.util.ArrayList;

public class MethodRefrenceUse {


    public static void main(String[] args) {
        CollectionDetails cd=(String s)->{
          return s.length();
        };
        int size=cd.collectionSize("rakesh");
        System.out.println(size);

        /*CollectionDetails cd=ImplementMethod::length;
        int value=cd.collectionSize("Rajesh");
        System.out.println(value);*/
    }
}
