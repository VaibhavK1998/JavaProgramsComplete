package oopsConcepts.abstraction;


abstract class Farmer {
    int a = 150000;

    abstract public void cutting();

    abstract public void sprayShowering();

    public void fertilizer() {
        System.out.println("farmer uses 2 nd dose of fertilizer ");
    }

    public void loanEligibility() {
        System.out.println("farmer eligible for 100000 ruppes loan");
    }

}

/*
when we use some concrete and non concrete method in abstract class then in child class we need to implement
only those method the methods which don't have implementation in abstract class.
 */
class FarmerData extends Farmer {


    @Override
    public void cutting() {
        System.out.println("cutting of crop per acre is 2000 ruppes");
    }

    @Override
    public void sprayShowering() {
        System.out.println(" 2 litre per acre dose of insectiside needed. ");
    }
}


public class AbstractionExa3ConcreteAndNonConcreteMethod {
    public static void main(String[] args) {
        FarmerData farmerdata = new FarmerData();
        farmerdata.sprayShowering();
        farmerdata.cutting();
        farmerdata.fertilizer();
        farmerdata.loanEligibility();
    }
}
