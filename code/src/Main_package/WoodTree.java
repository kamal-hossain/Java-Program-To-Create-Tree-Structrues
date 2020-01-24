package Main_package;

public class WoodTree extends Tree {

    private final String mainOrigin = "Amazon Forest";
    private int fruitGivingCyclePerYEar = 0;

    WoodTree() {
        userTreeName = "Wood_Tree" + (int) (Math.random() * 50 + 1);
        isMangrove = false;
    }

    public void woodInfo() {
        super.showInfo();
        woodCharacteristics();
    }

    public void woodCharacteristics() {
        fruitStatus();
        System.out.println("Wood_Tree tree is good for plant Bangladesh environment");
        System.out.println("Wood_Tree fruit can make a profitable function");
        healthBenefits();
        refreshAir();
        System.out.println("Main origin of this tree is from: " + mainOrigin);
        System.out.println("Fruit per year is : " + fruitGivingCyclePerYEar);
    }

    @Override
    void fruitStatus() {
        isSeasonalFruit = false;
        System.out.println("The Wood_Tree fruit is seasonal? " + isSeasonalFruit);
        System.out.println("No valuable fruit in this tree...Mainly used for Wood");
    }

    @Override
    void healthBenefits() {
        System.out.println("Common Health benefits: No COMMON health benefits.");
    }
}
