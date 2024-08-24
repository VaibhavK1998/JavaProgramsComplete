package oopsConcepts.interfacePract2;

import java.util.ArrayList;
import java.util.List;

public class Market implements Books,Stationary{

    @Override
    public List<String> storyBooks() {
        String storyBook[]={"book1","Book2"};
        return new ArrayList<>(List.of(storyBook));
    }

    @Override
    public List<String> gkBooks() {
        String gkBook[]={"gkbook1","gkBook2"};
        return new ArrayList<>(List.of(gkBook));
    }

    @Override
    public String[] campasItem() {
        String item[]={"pen","pencil"};
        return item;
    }

    @Override
    public List<String> stationaryItem() {
        return List.of("cover","handbook");
    }
}
