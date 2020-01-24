package Main_package;

public class Neem extends Tree {
  private final String mainOrigin  = "Pakistan Forest";
    private int fruitGivingCyclePerYEar = 0;
    Neem() {
        userTreeName = "Neem" + (int) (Math.random() * 50 + 1);
    }
    public void neemInfo() {
        super.showInfo();
        neemCharacteristics();
    }

    public void neemCharacteristics() {
        fruitStatus();
        System.out.println("Neem fruit is an excellent source of dietary fiber and vitamin B6.");
        System.out.println("Neem leaves can be used for cure followings > Diabetes, Vascular Dieseases etc");
        System.out.println("Neem tree is good for plant Bangladesh environment");
        System.out.println("Neem fruit can make a profitable function");
        healthBenefits();
        refreshAir();
         System.out.println("Main origin of this tree is from: " + mainOrigin);
        System.out.println("Fruit per year is : " + fruitGivingCyclePerYEar);
    }
    @Override
    void fruitStatus() {
        isSeasonalFruit = true;
        System.out.println("The Neem fruit is seasonal? " + isSeasonalFruit);
    }
    @Override
    void healthBenefits() {
        System.out.println("Common Health benefits: Reduces Dandruff, Detoxifies the body,fight malaria etc.");
    }
}
