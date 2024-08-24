package impMethodSet2;


class Building {
    int cost = 35000;
    String Material = "RCC";
}

public class SuperKeywordUse extends Building {

    public void testMaterial() {
        System.out.println("cost getting from other class : " + super.cost);// super keyword use to get instance variable of parent class
        System.out.println("Material getting from other class : " + super.Material);
    }

    public static void main(String[] args) {
        SuperKeywordUse sku = new SuperKeywordUse();
        sku.testMaterial();
    }
}
