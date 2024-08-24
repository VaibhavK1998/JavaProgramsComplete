package oopsConcepts.interfacePract2;

import java.util.List;

public class Purchase extends Market {
    public static void main(String[] args) {

        Purchase p = new Purchase();
        List<String> items = p.stationaryItem();
        for (String value : items) {
            System.out.println(value);
        }

    }
}
