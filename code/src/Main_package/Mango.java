package Main_package;

public class Mango extends Tree {
  private final String mainOrigin  = "Rajshahi Forest";
    private int fruitGivingCyclePerYEar = 3;
    Mango() {
        userTreeName = "Mango" + (int) (Math.random() * 50 + 1);
        isMangrove = false;
    }

    public void mangoInfo() {
        super.showInfo();
        mangoCharacteristics();
    }

    public void mangoCharacteristics() {
        fruitStatus();
        System.out.println("Mango fruit is an excellent source of dietary fiber and vitamin B6.");
        System.out.println("Mango leaves can be used for cure followings > Diabetes, Vascular Dieseases etc");
        System.out.println("Mango tree is good for plant Bangladesh environment");
        System.out.println("Mango fruit can make a profitable function");
        healthBenefits();
        refreshAir();
         System.out.println("Main origin of this tree is from: " + mainOrigin);
        System.out.println("Fruit per year is : " + fruitGivingCyclePerYEar);
    }
    @Override
    void fruitStatus() {
        isSeasonalFruit = true;
        System.out.println("The Mango fruit is seasonal? " + isSeasonalFruit);
    }
    @Override
    void healthBenefits() {
        System.out.println("Common Health benefits: Treating diabetes, uric acid, Ears pain etc.");
    }

}
