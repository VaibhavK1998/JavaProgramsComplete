package oopsConcepts.encapsulation;

public class TestPrivacy {
    public static void main(String[] args) {

        PrivateData data=new PrivateData();
        data.setAge(90);  // here we can see that the we access private data of other class using getter and setter method
        System.out.println("modified age : "+data.getAge());
    }
}
