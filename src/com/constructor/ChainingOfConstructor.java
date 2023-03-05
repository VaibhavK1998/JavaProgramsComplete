package com.constructor;


class SSC{

}

class HSC{
    public HSC(double percentage){
        System.out.println("----------------------------------------------------------");
        double percent=percentage;
        System.out.println("percentage : "+percentage);
    }
}
class Graduation extends HSC{
    public Graduation(double GradPercentage,String University){
        super(99.45);
        System.out.println("----------------------------------------------------------");
        double percentage=GradPercentage;
        String passoutUniversity=University;
        System.out.println("percentage : "+percentage+" passoutUniversity  : "+passoutUniversity);
    }
}

class PostGraduation extends Graduation{ // extends must to use super(); and called other class constructor
    public PostGraduation(double percentage,int year,int age){
        super(34.98,"Amravati");
        System.out.println("----------------------------------------------------------");
        double MyPercentage=percentage;
        int Year=year;
        int Myage=age;

        System.out.println("MyPercentage : "+MyPercentage+" Year  : "+Year+" Myage : "+Myage);
    }
}
public class ChainingOfConstructor {
    public static void main(String[] args) {
        PostGraduation details=new PostGraduation(99.78,2019,23);

    }


}
